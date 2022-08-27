package com.cfn;

public abstract class FileDump {
	public final void dumpData(){
		load();
		parse();
		dump();
	}
	public abstract void load();
	public abstract void parse();
	public void dump(){
		System.out.println("Data dumped Oracle");
	}
}
