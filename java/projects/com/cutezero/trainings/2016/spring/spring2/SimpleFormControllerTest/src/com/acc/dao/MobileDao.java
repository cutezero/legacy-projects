package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.bo.MobileBo;
import com.acc.dto.MobileDto;

public class MobileDao {

	private final String QUERY="select brand,price,camera,sim from mobile where brand=? and price between ? and ?";
	
	private JdbcTemplate jt;

	public MobileDao(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}
	
	public List<MobileBo> getSearchedMobile(MobileDto dto){
		List<MobileBo> mlist=jt.query(QUERY, new Object[]{dto.getBrand(),dto.getMinPrice(),dto.getMaxPrice()}, new RowMapper<MobileBo>(){
            MobileBo mb=null;
			@Override
			public MobileBo mapRow(ResultSet rs, int index) throws SQLException {
				
				if(rs!=null)
				{
					mb=new MobileBo();
					mb.setMobile(rs.getString(1));
					mb.setPrice(rs.getInt(2));
					mb.setCamera(rs.getString(3));
					mb.setSimType(rs.getString(4));
				}
				return mb;
			}
			
		});
		return mlist;
	}
}
