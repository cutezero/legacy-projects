package com.loginapi.dto;

public class Message {
	private String versionNumber;
	private String engMessage;
	private String burmeseMessage;
	private String url;
	private String apkVersion;
	private int updateType;
	private String newUpdate;
	public String getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public String getEngMessage() {
		return engMessage;
	}
	public void setEngMessage(String engMessage) {
		this.engMessage = engMessage;
	}
	public String getBurmeseMessage() {
		return burmeseMessage;
	}
	public void setBurmeseMessage(String burmeseMessage) {
		this.burmeseMessage = burmeseMessage;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getApkVersion() {
		return apkVersion;
	}
	public void setApkVersion(String apkVersion) {
		this.apkVersion = apkVersion;
	}
	public int getUpdateType() {
		return updateType;
	}
	public void setUpdateType(int updateType) {
		this.updateType = updateType;
	}
	public String getNewUpdate() {
		return newUpdate;
	}
	public void setNewUpdate(String newUpdate) {
		this.newUpdate = newUpdate;
	}
		
}
