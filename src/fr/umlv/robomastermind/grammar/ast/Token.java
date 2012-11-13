package fr.umlv.robomastermind.grammar.ast;

public class Token<V> {
	private final Location location;
	private final V value;

	public Token(Location location, V value) {
		this.location = location;
		this.value = value;
	}

	public Location getSourceLocation() {
		return location;
	}
	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
