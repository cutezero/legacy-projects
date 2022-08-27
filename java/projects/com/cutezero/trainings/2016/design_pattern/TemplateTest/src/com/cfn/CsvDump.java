package com.cfn;

public class CsvDump extends FileDump {

	@Override
	public void load() {
		System.out.println("CSV file dumped");

	}

	@Override
	public void parse() {
		System.out.println("CSV file parsed");

	}

}
