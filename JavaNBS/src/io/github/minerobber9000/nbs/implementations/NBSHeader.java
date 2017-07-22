package io.github.minerobber9000.nbs.implementations;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class NBSHeader implements INBSDataType {
	
	public short length;
	public short height;
	public NBSString name;
	public NBSString arranger;
	public NBSString composer;
	public NBSString description;
	public short tempo;
	public boolean autosaving;
	public char asduration;
	public char timesignature;
	public int minspent;
	public int leftclicks;
	public int rightclicks;
	public int baddcount;
	public int bdelcount;
	public NBSString msfilename;

	public NBSHeader(DataInputStream in) {
		//TODO: begin work on reading file
	}
	
	@Override
	public DataType getType() {
		return DataType.AMALGAMATE;
	}

	@Override
	public INBSDataType from(DataInputStream in) {
		return new NBSHeader(in);
	}

	@Override
	public void to(DataOutputStream out) {
		//TODO: implement
		return;
	}

	@Override
	public NBSHeader getValue() {
		return this;
	}

}
