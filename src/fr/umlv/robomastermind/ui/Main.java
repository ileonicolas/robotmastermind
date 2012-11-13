package fr.umlv.robomastermind.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
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
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import fr.umlv.robomastermind.grammar.ErrorListener;
import fr.umlv.robomastermind.grammar.analysis.PrettyPrinter;
import fr.umlv.robomastermind.grammar.ast.InstructionNode;
import fr.umlv.robomastermind.grammar.ast.ScriptNode;

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
		
		SimpleAttributeSet attrs_blue = new SimpleAttributeSet();
	    StyleConstants.setForeground(attrs_blue, Color.blue);
	    SimpleAttributeSet attrs_red = new SimpleAttributeSet();
	    StyleConstants.setForeground(attrs_blue, Color.red);
	    
		textPane.setText("right(5)");
		document.setCharacterAttributes(1, 5, attrs_blue, false);
		document.setCharacterAttributes(6, 7, attrs_red, false);
		
		
		final Action runAction = new AbstractAction("Start") {
			private static final long serialVersionUID = 2085873676432797044L;

			@Override
			public void actionPerformed(ActionEvent e) {
				ScriptNode scriptNode = model.getScriptNode();
				
				String text = new PrettyPrinter().print(scriptNode);
				System.out.println(text);
			}
		};

		// rend accessible start s'il n'y a aucune erreur dans le script
		runAction.setEnabled(false);
		model.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				boolean hasAScriptNode = model.getScriptNode() != null;
				runAction.setEnabled(hasAScriptNode);
				if (hasAScriptNode) {
					label.setText(null);
				}
				else {
					/** 6eme Point : signalisation des erreurs */
				}
			}
		});
		
		final Action cutAction = new AbstractAction("Cut") {
			private static final long serialVersionUID = -5607975097665632574L;

			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.cut();
			}
		};

		final Action copyAction = new AbstractAction("Copy") {
			private static final long serialVersionUID = 1271710595381946831L;

			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.copy();
			}
		};

		/** 1er Point : Charger et sauvegarder un script sur le disque dur en indiquant le fichier choisi */

		final Action loadAction = new AbstractAction("Load") {
			private static final long serialVersionUID = 4380515786177585932L;

			@Override
			public void actionPerformed(ActionEvent e) {
				Document doc = textPane.getDocument();
				JFileChooser fileLoad = new JFileChooser();
				fileLoad.setFileFilter(new FileNameExtensionFilter("Script .script", "script"));	
				int returnVal = fileLoad.showOpenDialog(new Frame());

				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileLoad.getSelectedFile();
					System.out.println("You load this file: " +	file.getName());

					/** Lis le contenu du script et l'affiche dans la zone d'édition de script (textPane) */
					BufferedReader reader = null;
					try {
						reader = new BufferedReader(new FileReader(file));
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					String str = null;
					try {
						while((str = reader.readLine()) != null) {
							// System.out.println(str);
							doc.insertString(doc.getLength(), str+"\n", null);
						}
					} catch (IOException | BadLocationException e1) {
						e1.printStackTrace();
					}
				}
			}
		};

		final Action saveAction = new AbstractAction("Save") {
			private static final long serialVersionUID = 7703437766369260141L;

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileSave = new JFileChooser();
				fileSave.setFileFilter(new FileNameExtensionFilter("Script .script", "script"));	
				int returnVal = fileSave.showOpenDialog(new Frame());

				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileSave.getSelectedFile();
					System.out.println("You save into this file: " + file.getName());

					/** Lis le contenu de la zone d'édition (textPane) et le sauvegarde dans le fichier sélectionné */
					try {
						BufferedWriter out = new BufferedWriter(new FileWriter(file));
						out.write(textPane.getText()); //
						out.close();
					} catch (IOException e2) {
						e2.printStackTrace();
					}

				}
			}
		};

		/** 1er Point : Fin */

		// rend accessible cut et copy si du texte est sélectionné
		textPane.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent e) {
				boolean isSelected = textPane.getSelectedText() != null;
				cutAction.setEnabled(isSelected);
				copyAction.setEnabled(isSelected);
			}
		});
		
		final Action pasteAction = new AbstractAction("Paste") {
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

		// partie graphique

		JToolBar toolbar = new JToolBar();
		toolbar.setFloatable(false);
		toolbar.add(loadAction);
		toolbar.add(saveAction);
		toolbar.addSeparator(new Dimension(64, 64));
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

		// creation du plateau et du "robot"
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

					graphics.setColor(Color.ORANGE);
					for(int i=0; i<width; i+=40) {
						graphics.drawLine(i, 0, i, height);
					}
					graphics.setColor(Color.LIGHT_GRAY);
					for(int i=0; i<height; i+=40) {
						graphics.drawLine(0, i, width, i);
					}

					graphics.setColor(Color.RED);
					Random random = new Random();
					// position du robot
					graphics.fill(new Ellipse2D.Float(random.nextInt(width), random.nextInt(height), 50, 50));

				} finally {
					graphics.dispose();
				}
			}
		});

		// just for the demo, refresh automatically the drawing area every 20 seconds
		new Timer(10000, new ActionListener() {
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
