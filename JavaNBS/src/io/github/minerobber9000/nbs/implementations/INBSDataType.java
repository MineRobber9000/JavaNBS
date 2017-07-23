package io.github.minerobber9000.nbs.implementations;

import java.io.*;

public interface INBSDataType {
	//Get data type (short, byte, string) 
	public DataType getType();
	
	//Using a DataInputStream, create yourself
	//Can throw IOException.
	public INBSDataType from(DataInputStream in) throws IOException;
	
	//Write yourself to a DataOutputStream
	public void to(DataOutputStream out) throws IOException;
	
	//Return data value
	public Object getValue();
}
