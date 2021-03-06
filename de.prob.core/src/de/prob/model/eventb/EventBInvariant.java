package de.prob.model.eventb;

import de.prob.animator.domainobjects.EventB;
import de.prob.model.representation.Invariant;

public class EventBInvariant extends Invariant {

	private final String name;
	private final boolean theorem;

	public EventBInvariant(final String name, final String code,
			final boolean theorem) {
		super(new EventB(code));
		this.name = name;
		this.theorem = theorem;
	}

	public String getName() {
		return name;
	}

	public boolean isTheorem() {
		return theorem;
	}
}
