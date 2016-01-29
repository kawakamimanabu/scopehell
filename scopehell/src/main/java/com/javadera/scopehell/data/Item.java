package com.javadera.scopehell.data;

/**
 *
 * @author
 *
 */
public class Item {
	private String keyString;
	private String valueString;

	public Item(){}

	public Item(String key, String value) {
		keyString = key;
		valueString = value;
	}

	// --- getter, setter ---
	public String getKeyString() {
		return keyString;
	}
	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}
	public String getValueString() {
		return valueString;
	}
	public void setValueString(String valueString) {
		this.valueString = valueString;
	}


}
