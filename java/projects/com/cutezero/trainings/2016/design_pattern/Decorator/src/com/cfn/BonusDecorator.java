package com.cfn;

public class BonusDecorator implements IPlan {
	private IPlan plan;
	public BonusDecorator(IPlan plan){
		this.plan=plan;
	}
	@Override
	public String generatePlan() {
		String str=plan.generatePlan();
		return str.concat("with Bonus");
	}
}
