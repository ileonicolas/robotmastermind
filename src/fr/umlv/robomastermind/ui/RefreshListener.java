package fr.umlv.robomastermind.ui;

import java.awt.image.BufferedImage;
import java.util.EventListener;

public interface RefreshListener extends EventListener {
	public void refresh(BufferedImage image);
}
