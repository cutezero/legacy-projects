package com.aop.throwing.beans;

import java.sql.SQLException;

public class AccountTransfer {

	public String transferFunds(double amount) throws SQLException {
		String result = null;
		if (amount == 100) {
			result = "failed";
			throw new IllegalArgumentException("100 is an illegal argument ");
		} else if (amount == 200) {
			result = "failed";
			throw new ArrayIndexOutOfBoundsException("200 is an ArrayOutOfBoundException");
		} else if (amount == 300) {
			result = "failed";
			throw new SQLException("300 is an SQLException");
		} else
			result = "Success";
		return result;
	}
}
