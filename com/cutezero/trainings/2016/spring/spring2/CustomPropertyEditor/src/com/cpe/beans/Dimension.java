package com.cpe.beans;

public class Dimension {

/*	private int refInt;

	public Dimension(int refInt) {
		super();
		this.refInt = refInt;
	}
	
	
	private String refText;

	public Dimension(String refText) {
		super();
		this.refText = refText;
	}
	
	*/
	
	private int length;
	private int width;
	private int thickness;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	@Override
	public String toString() {
		return "Dimension [length=" + length + ", width=" + width + ", thickness=" + thickness + "]";
	}
	
	
}
