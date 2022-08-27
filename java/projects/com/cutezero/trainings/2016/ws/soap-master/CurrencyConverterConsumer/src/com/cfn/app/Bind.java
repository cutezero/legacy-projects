package com.cfn.app;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class Bind {

	public static void main(String[] args) {
		CurrencyConvertor cc= new CurrencyConvertor();
		CurrencyConvertorSoap ccs=cc.getCurrencyConvertorSoap();
		double d=ccs.conversionRate(Currency.USD, Currency.RUB);
		System.out.println(d);
	}
}
