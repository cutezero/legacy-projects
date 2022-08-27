package com.annote.beans;

import javax.inject.Named;

@Named
public class Computer {

	private String architecture;
	private String osName;
	private String processorModel;
	private int hddCapacity;
	private int ram;
	private String graphicsCard;
	
	
	public Computer() {
	}
	public Computer(String architecture, String osName, String processorModel, int hddCapacity, int ram,
			String graphicsCard) {
		this.architecture = architecture;
		this.osName = osName;
		this.processorModel = processorModel;
		this.hddCapacity = hddCapacity;
		this.ram = ram;
		this.graphicsCard = graphicsCard;
	}
	public String getArchitecture() {
		return architecture;
	}
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getProcessorModel() {
		return processorModel;
	}
	public void setProcessorModel(String processorModel) {
		this.processorModel = processorModel;
	}
	public int getHddCapacity() {
		return hddCapacity;
	}
	public void setHddCapacity(int hddCapacity) {
		this.hddCapacity = hddCapacity;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	@Override
	public String toString() {
		return "Computer [architecture=" + architecture + ", osName=" + osName + ", processorModel=" + processorModel
				+ ", hddCapacity=" + hddCapacity + ", ram=" + ram + ", graphicsCard=" + graphicsCard + "]";
	}
	
	
}
