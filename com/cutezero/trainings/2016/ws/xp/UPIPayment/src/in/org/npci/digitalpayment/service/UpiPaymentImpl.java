package in.org.npci.digitalpayment.service;

import java.util.UUID;

import javax.jws.WebService;

import in.org.npci.digitalpayment.types.Reciept;
import in.org.npci.digitalpayment.types.UpiAccount;

@WebService(endpointInterface="in.org.npci.digitalpayment.service.UpiPayment")
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
