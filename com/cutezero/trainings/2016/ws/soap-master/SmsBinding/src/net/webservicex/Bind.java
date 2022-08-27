package net.webservicex;

public class Bind 
{
		public static void main(String[] args) {
			SendSMS ss= new SendSMS();
			SendSMSSoap sms=ss.getSendSMSSoap();
			sms.sendSMSToIndia(mobileNumber, fromEmailAddress, message);
		}
}
