

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.FlavorEvent;
import java.awt.datatransfer.FlavorListener;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.StyledDocument;

import fr.umlv.robomastermind.grammar.ErrorListener;
import fr.umlv.robomastermind.grammar.analysis.PrettyPrinter;
import fr.umlv.robomastermind.grammar.ast.ScriptNode;
import fr.umlv.robomastermind.ui.DrawingArea;
import fr.umlv.robomastermind.ui.RefreshListener;
import fr.umlv.robomastermind.ui.ScriptModel;

public class Main {
	public static void main(String[] args) {
		final JLabel label = new JLabel();

		ErrorListener errorListener = new ErrorListener() {
			@Override
			public void error(String message, Object... args) {
				label.setText(String.format(message, args));
			}
		};

		final ScriptModel model = new ScriptModel(errorListener);
		StyledDocument document = model.getDocument();
		final JTextPane textPane = new JTextPane(document);

		final Action runAction = new AbstractAction("run") {
			private static final long serialVersionUID = 2085873676432797044L;

			@Override
			public void actionPerformed(ActionEvent e) {
				ScriptNode scriptNode = model.getScriptNode();
				String text = new PrettyPrinter().print(scriptNode);
				System.out.println(text);
			}
		};
		runAction.setEnabled(false);
		model.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				boolean hasAScriptNode = model.getScriptNode() != null;
				runAction.setEnabled(hasAScriptNode);
				if (hasAScriptNode) {
					label.setText(null);
				}
			}
		});

		final Action cutAction = new AbstractAction("cut") {
			private static final long serialVersionUID = -5607975097665632574L;

			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.cut();
			}
		};
		final Action copyAction = new AbstractAction("copy") {
			private static final long serialVersionUID = 1271710595381946831L;

			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.copy();
			}
		};
		textPane.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent e) {
				boolean isSelected = textPane.getSelectedText() != null;
				cutAction.setEnabled(isSelected);
				copyAction.setEnabled(isSelected);
			}
		});
		final Action pasteAction = new AbstractAction("paste") {
			private static final long serialVersionUID = -5166974512137056749L;

			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.paste();
			}
		};
		final Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.addFlavorListener(new FlavorListener() {
			@Override
			public void flavorsChanged(FlavorEvent event) {
				boolean stringAvailable;
				try {
					stringAvailable = clipBoard.getData(DataFlavor.stringFlavor) != null;
				} catch (UnsupportedFlavorException | IOException e) {
					stringAvailable = false;
				}
				pasteAction.setEnabled(stringAvailable);
			}
		});

		JToolBar toolbar = new JToolBar();
		toolbar.setFloatable(false);
		toolbar.add(copyAction);
		toolbar.add(cutAction);
		toolbar.add(pasteAction);
		toolbar.addSeparator(new Dimension(64, 64));
		toolbar.add(runAction);


		final DrawingArea drawingArea = new DrawingArea() {
			private static final long serialVersionUID = 5317163817572057932L;

			@Override
			public Dimension getPreferredSize() {
				return new Dimension(500,600);
			}
		};
		drawingArea.addRefreshListener(new RefreshListener() {
			@Override
			public void refresh(BufferedImage image) {
				System.out.println("refresh ...");

				Graphics2D graphics = image.createGraphics();
				try {
					int width = image.getWidth();
					int height = image.getHeight();

					// because we draw an ellipsis, set the antialising otherwise it looks crappy  
					graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

					graphics.setColor(Color.BLACK);
					graphics.fill(new Rectangle(0, 0, width, height));

					graphics.setColor(Color.LIGHT_GRAY);
					for(int i=0; i<width; i+=20) {
						graphics.drawLine(i, 0, i, height);
					}
					for(int i=0; i<height; i+=20) {
						graphics.drawLine(0, i, width, i);
					}

					graphics.setColor(Color.RED);
					Random random = new Random();
					graphics.fill(new Ellipse2D.Float(random.nextInt(width), random.nextInt(height), 50, 50));

				} finally {
					graphics.dispose();
				}
			}
		});

		// just for the demo, refresh automatically the drawing area every 2 seconds
		new Timer(2000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drawingArea.refresh();
			}
		}).start();

		JScrollPane scrollPane = new JScrollPane(textPane);

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		panel.add(drawingArea, BorderLayout.EAST);
		panel.add(scrollPane, BorderLayout.CENTER);

		JFrame frame = new JFrame("RoboMasterMind");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(toolbar, BorderLayout.NORTH);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
