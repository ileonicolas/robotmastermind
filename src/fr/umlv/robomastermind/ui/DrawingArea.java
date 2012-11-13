package fr.umlv.robomastermind.ui;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public class DrawingArea extends JComponent {
	private static final long serialVersionUID = -7689835955238866822L;

	private BufferedImage buffer;

	public DrawingArea() {
		setOpaque(true);
		setFocusable(true);
	}

	public void addRefreshListener(RefreshListener listener) {
		listenerList.add(RefreshListener.class, listener);
	}
	public void removeRefreshListener(RefreshListener listener) {
		listenerList.remove(RefreshListener.class, listener);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		if (buffer == null || buffer.getWidth() != width || buffer.getHeight() != height) {
			if (buffer != null) {
				buffer.flush();   // give system resources back
			}
			buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
		}
		fireRefresh(buffer);
		g.drawImage(buffer, 0, 0, null);
	}

	private void fireRefresh(BufferedImage buffer) {
		Object[] listeners = listenerList.getListenerList();
		for (int i = listeners.length-2; i>=0; i-=2) {
			if (listeners[i] == RefreshListener.class) {
				((RefreshListener)listeners[i+1]).refresh(buffer);
			}
		}
	}

	public void refresh() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				paintImmediately(0, 0, getWidth(), getHeight());
			}
		});
	}
}