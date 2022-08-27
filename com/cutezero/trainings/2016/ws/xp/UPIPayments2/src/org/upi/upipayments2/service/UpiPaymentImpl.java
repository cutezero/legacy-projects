package org.upi.upipayments2.service;

import java.util.UUID;

import javax.jws.WebService;

import org.upi.upipayments2.types.Reciept;
import org.upi.upipayments2.types.UpiAccount;


@WebService(endpointInterface="org.upi.upipayments2.service.UpiPayment")
public class UpiPaymentImpl {

	public Reciept sendMoney(UpiAccount fromAccount, UpiAccount toAccount,
			double amount) {
		Reciept reciept= new Reciept();
		reciept.setTransactionNo(UUID.randomUUID().toString());
		reciept.setFromAccount(fromAccount.getVpa());
		reciept.setToAccount(toAccount.getVpa());
		reciept.setAmount(amount);
		reciept.setStatus("Success");
		
		return reciept;
	}

}
