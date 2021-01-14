package de.unistuttgart.iste.sqa.pse.exercisesheet11.example;

/**
 * A simple Class with a single attribute and useless operations. For exemplary
 * use only. Do not do this at home.
 *
 */
public class Example {
	private String attribute;

	public Example(final String attribute) {
		this.attribute = attribute;
	}

	public String getAttribute() {
		return attribute;
	}

	/**
	 * For exemplary use only. Do not do such things at home.
	 */
	public boolean foo() {
		throw new NullPointerException();
	}

	/**
	 * For exemplary use only. Do not do such things at home.
	 */
	public void bar() {
		throw new NullPointerException();
	}
}
