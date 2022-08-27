package com.cfn;

public class XmlDump extends FileDump {

	@Override
	public void load() {
		System.out.println("XML file dumped");

	}

	@Override
	public void parse() {
		System.out.println("XML file parsed");

	}

}
