package com.bpp.beans;

public class Videos {

	private int videoId;
	private String title;
	private float length;
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setLength(float length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Videos [videoId=" + videoId + ", title=" + title + ", length=" + length + "]";
	}
	
}
