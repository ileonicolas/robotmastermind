package fr.umlv.robomastermind.grammar.ast;

public interface Location {
	public int position();

	public interface Factory {
		Location createLocation(int sourcePosition);
	}
}
