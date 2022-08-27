package com.cpe.beans;

public class Metal {

	private String name;
	
	private Dimension dimension;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "Metal [name=" + name + ", dimension=" + dimension + "]";
	}
	
	
}
