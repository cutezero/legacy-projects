package com.ib.beans;

public class Chain {

	private int chainNo;
	private String chainBrand;
	public void setChainNo(int chainNo) {
		this.chainNo = chainNo;
	}
	public void setChainBrand(String chainBrand) {
		this.chainBrand = chainBrand;
	}
	@Override
	public String toString() {
		return "Chain [chainNo=" + chainNo + ", chainBrand=" + chainBrand + "]";
	}
	
}
