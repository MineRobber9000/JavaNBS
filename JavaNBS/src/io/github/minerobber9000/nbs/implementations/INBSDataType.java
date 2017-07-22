package io.github.minerobber9000.nbs.implementations;

import java.io.*;

public interface INBSDataType {
	//Get data type (short, byte, string) 
	public DataType getType();
	
	//Using a DataInputStream, create yourself
	public INBSDataType from(DataInputStream in);
	
	//Write yourself to a DataOutputStream
	public void to(DataOutputStream out);
	
	//Return data value
	public Object getValue();
}
