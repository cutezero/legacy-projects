package com.annote.beans;

import javax.inject.Named;

@Named
public class Mobile {

	private String architecture;
	private String osNameWithVersion;
	private String processorModel;
	private int internalMemory;
	private int ram;
	private String backCameraResolution;
	private String frontCameraResolution;
	private boolean flashLight;
	
	
	public Mobile() {
		super();
	}

	public Mobile(String architecture, String osNameWithVersion, String processorModel, int internalMemory, int ram,
			String backCameraResolution, String frontCameraResolution, boolean flashLight) {
		this.architecture = architecture;
		this.osNameWithVersion = osNameWithVersion;
		this.processorModel = processorModel;
		this.internalMemory = internalMemory;
		this.ram = ram;
		this.backCameraResolution = backCameraResolution;
		this.frontCameraResolution = frontCameraResolution;
		this.flashLight = flashLight;
	}
	
	public String getArchitecture() {
		return architecture;
	}
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public String getOsNameWithVersion() {
		return osNameWithVersion;
	}
	public void setOsNameWithVersion(String osNameWithVersion) {
		this.osNameWithVersion = osNameWithVersion;
	}
	public String getProcessorModel() {
		return processorModel;
	}
	public void setProcessorModel(String processorModel) {
		this.processorModel = processorModel;
	}
	public int getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(int internalMemory) {
		this.internalMemory = internalMemory;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getBackCameraResolution() {
		return backCameraResolution;
	}
	public void setBackCameraResolution(String backCameraResolution) {
		this.backCameraResolution = backCameraResolution;
	}
	public String getFrontCameraResolution() {
		return frontCameraResolution;
	}
	public void setFrontCameraResolution(String frontCameraResolution) {
		this.frontCameraResolution = frontCameraResolution;
	}
	public boolean isFlashLight() {
		return flashLight;
	}
	public void setFlashLight(boolean flashLight) {
		this.flashLight = flashLight;
	}
	@Override
	public String toString() {
		return "Mobile [architecture=" + architecture + ", osNameWithVersion=" + osNameWithVersion + ", processorModel="
				+ processorModel + ", internalMemory=" + internalMemory + ", ram=" + ram + ", backCameraResolution="
				+ backCameraResolution + ", frontCameraResolution=" + frontCameraResolution + ", flashLight="
				+ flashLight + "]";
	}
}
