package fr.umlv.robomastermind.grammar.ast;

import java.util.Objects;

abstract class AbstractNode implements Node {
	private final Location location;

	AbstractNode(Location location) {
		this.location = Objects.requireNonNull(location);
	}

	@Override
	public Location getSourceLocation() {
		return location;
	}
}
