package com.hdfc.netbanking.delegate;

import java.io.IOException;
import java.util.Date;

import org.upi.upipayments2.service.UpiPayment;
import org.upi.upipayments2.types.Reciept;
import org.upi.upipayments2.types.UpiAccount;

import com.hdfc.netbanking.exceptions.ServiceInstantiationException;
import com.hdfc.netbanking.util.locator.UPIPaymentServiceLocator;
import com.hdfc.netbanking.vo.FundsTransferVO;
import com.hdfc.netbanking.vo.ReceiptVO;

public class FundsTransferBusinessDelegate {

	public ReceiptVO transferFunds(FundsTransferVO fundsTransferVO) throws ServiceInstantiationException {
		try{
		UPIPaymentServiceLocator locator=UPIPaymentServiceLocator.getInstance();
		UpiPayment upiPayment= locator.getUpiPaymentImplPort();
		UpiAccount fromAccount= new UpiAccount();
		fromAccount.setAccountHolderName("Srikanta");
		fromAccount.setIfsc("HDFC90956");
		fromAccount.setVpa(fundsTransferVO.getFromAccount());
		
		UpiAccount toAccount= new UpiAccount();
		toAccount.setAccountHolderName("Srikanta");
		toAccount.setIfsc("HDFC90956");
		toAccount.setVpa(fundsTransferVO.getToAccount());
		
		Reciept reciept=upiPayment.sendMoney(fromAccount, toAccount, fundsTransferVO.getAmount());
		ReceiptVO receiptVO= new ReceiptVO();
		receiptVO.setFromAccont(reciept.getFromAccount());
		receiptVO.setToAccount(reciept.getToAccount());
		receiptVO.setAmount(reciept.getAmount());
		receiptVO.setTransactionId(reciept.getTransactionNo());
		receiptVO.setStatus(reciept.getStatus());
		receiptVO.setTransactionDate(new Date());
		return receiptVO;
		}catch(IOException e){
			throw new ServiceInstantiationException("Failed to execute business delegate");
		}
	}
}
