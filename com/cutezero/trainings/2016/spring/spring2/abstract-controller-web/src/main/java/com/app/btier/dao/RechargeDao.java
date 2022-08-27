package com.app.btier.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.app.bo.RechargeDetailsBo;

public class RechargeDao {

	private final String SQL_SELECT_FROM_RECHARGES="select ORDER_ID, MOBILE_NO, AMOUNT, RECHARGE_DATE, STATUS from RECHARGES";
	private JdbcTemplate jdbcTemplate;

	public RechargeDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<RechargeDetailsBo> getRechargeHistory(){
		List<RechargeDetailsBo> rechargeBos= null;
		
		rechargeBos=jdbcTemplate.query(SQL_SELECT_FROM_RECHARGES, new RowMapper<RechargeDetailsBo>() {

			public RechargeDetailsBo mapRow(ResultSet rs, int rowNum) throws SQLException {
				RechargeDetailsBo bo= null;
				
				bo= new RechargeDetailsBo();
				bo.setOrderId(rs.getString(1));
				bo.setMobileNo(rs.getString(2));
				bo.setAmount(rs.getFloat(3));
				bo.setRechargeDate(rs.getDate(4));
				bo.setStatus(rs.getString(5));
				return bo;
			}
		});
		return rechargeBos;
	}
}
