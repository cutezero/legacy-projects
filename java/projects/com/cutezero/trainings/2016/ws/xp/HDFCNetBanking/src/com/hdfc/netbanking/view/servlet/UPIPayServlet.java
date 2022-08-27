package com.hdfc.netbanking.view.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import com.hdfc.netbanking.delegate.FundsTransferBusinessDelegate;
import com.hdfc.netbanking.exceptions.ServiceInstantiationException;
import com.hdfc.netbanking.vo.FundsTransferVO;
import com.hdfc.netbanking.vo.ReceiptVO;

public class UPIPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UPIPayServlet() {
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		FundsTransferVO fundsTransferVO= null;
		
		fundsTransferVO= new FundsTransferVO();
		fundsTransferVO.setFromAccount(request.getParameter("fromAc"));
		fundsTransferVO.setToAccount(request.getParameter("toAc"));
		fundsTransferVO.setAmount(Double.parseDouble(request.getParameter("amount")));
		fundsTransferVO.setRemarks(request.getParameter("remarks"));
		System.out.println("Amount: "+fundsTransferVO.getAmount());
		FundsTransferBusinessDelegate ftbd= new FundsTransferBusinessDelegate();
		ReceiptVO receiptVO;
		try {
			receiptVO = ftbd.transferFunds(fundsTransferVO);
		
		System.out.println("From: "+receiptVO.getFromAccont());
		request.setAttribute("receiptVO", receiptVO);
		request.setAttribute("transactioId", receiptVO.getTransactionId());
		request.setAttribute("fromAc", receiptVO.getFromAccont());
		request.setAttribute("toAc", receiptVO.getToAccount());
		request.setAttribute("status", receiptVO.getStatus());
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} catch (ServiceInstantiationException e) {
			System.err.println("Failed in servelt to forwarrd request to delegate");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
