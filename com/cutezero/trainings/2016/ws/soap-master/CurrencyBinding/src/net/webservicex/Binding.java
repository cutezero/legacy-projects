package net.webservicex;

public class Binding 
{
		public static void main(String[] args) 
		{
			CurrencyConvertor cc =  new CurrencyConvertor();
			CurrencyConvertorSoap cs = cc.getCurrencyConvertorSoap();
			double d = cs.conversionRate("USD", "INR");
			
			System.out.println(d);
		}
}
