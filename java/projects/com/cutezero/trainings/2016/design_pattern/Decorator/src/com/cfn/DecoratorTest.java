package com.cfn;

public class DecoratorTest {

	public static void main(String[] args) {
		IPlan plan=new BonusDecorator(new MoneyBackPlan());
		System.out.println(plan.generatePlan());
		System.out.println("=========================");
		plan=new BonusDecorator(new EndowmentPlan());
		System.out.println(plan.generatePlan());
		System.out.println("=========================");
		IPlan plan3=new MoneyBackPlan();
		System.out.println(plan3.generatePlan());
	}

}
