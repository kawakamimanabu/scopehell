package com.javadera.scopehell.data;

/**
 * Dummy Object
 * @author
 *
 */
public class Item {
	private String label = "";

	public Item(){}

	public Item(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Item [label=" + label + "]";
	}

	// --- getter, setter ---
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
