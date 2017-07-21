package io.github.minerobber9000.nbs.implementations;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class NBSString implements INBSDataType {
	
	private int len;
	private char[] input;
	
	public NBSString(int len, char[] input) {
		this.len = len;
		this.input = input;
	}
	
	public int getLength() {
		return len;
	}
	
	public String toString() {
		return String.valueOf(input);
	}
	
	@Override
	public String getValue() {
		return this.toString();
	}
	
	@Override
	public DataType getType() {
		return DataType.STRING;
	}

	@Override
	public INBSDataType from(DataInputStream in) {
		return new NBSString(12,"Hello World!".toCharArray());
	}

	@Override
	public void to(DataOutputStream out) {
		return;
	}
	
}
