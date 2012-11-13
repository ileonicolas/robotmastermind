package fr.umlv.robomastermind.ui;

import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;

import fr.umlv.robomastermind.grammar.ErrorListener;
import fr.umlv.robomastermind.grammar.Scripts;
import fr.umlv.robomastermind.grammar.ast.ScriptNode;

public class ScriptModel {
	private final CopyOnWriteArrayList<ChangeListener> listeners = new CopyOnWriteArrayList<>();
	private final ChangeEvent changeEvent = new ChangeEvent(this);

	final DefaultStyledDocument document = new DefaultStyledDocument();
	private ScriptNode scriptNode;


	public ScriptModel(final ErrorListener errorListener) {
		Objects.requireNonNull(errorListener);
		document.addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				textModified();
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				textModified();
			}
			@Override
			public void changedUpdate(DocumentEvent e) {
				textModified();
			}

			private void textModified() {
				setScriptNode(Scripts.parse(document, errorListener));
			}
		});
	}

	public StyledDocument getDocument() {
		return document;
	}

	public ScriptNode getScriptNode() {
		return scriptNode;
	}
	void setScriptNode(ScriptNode scriptNode) {
		this.scriptNode = scriptNode;
		for(ChangeListener listener: listeners) {
			listener.stateChanged(changeEvent);
		}
	}

	public void addChangeListener(ChangeListener listener) {
		Objects.requireNonNull(listener);
		listeners.add(listener);
	}

	public void removeChangeListener(ChangeListener listener) {
		Objects.requireNonNull(listener);
		listeners.remove(listener);
	}
}
