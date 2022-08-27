package com.cfn;

public class Main {

	public static void main(String[] args) {
		FileDump c= new CsvDump();
		c.dumpData();
		FileDump x= new XmlDump();
		x.dumpData();
	}

}
