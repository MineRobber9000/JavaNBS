package io.github.minerobber9000.nbs.implementations;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class NBSString implements INBSDataType {
	
	private int len;
	private char[] input;
	
	public NBSString(int len, char[] input) {
		this.len = len;
		this.input = input;
	}
	
	public NBSString(int len, String input) {
		this(len,input.toCharArray());
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
	public INBSDataType from(DataInputStream in) throws IOException {
		return new NBSString(in.read(),in.readUTF());
	}

	@Override
	public void to(DataOutputStream out) throws IOException {
		out.writeInt(len);
		for (char c : input) {
			out.writeChar(c);
		}
	}
	
}
