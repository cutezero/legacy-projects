package com.sfc.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.sfc.dto.ProductDtoIn;

public class ProductDao {

//	private final String SQL_DROP_TABLE_PRODUCTS= "drop table PRODUCTS if exists";
//	private final String SQL_CREATE_TABLE_PRODUCTS= "create table PRODUCTS columns(P_ID integer primary key, 'NAME' varchar(35), 'CATEGORY' varchar(15), 'BRAND' varchar(25), PRICE double)";
	private final String SQL_INSERT_TO_PRODUCTS= "insert into PRODUCTS(P_ID, NAME, CATEGORY, BRAND, PRICE) values(:productId, :name, :category, :brand, :price)";
//	private final String SQL_INSERT_TO_PRODUCTS= "insert into PRODUCTS(NAME, CATEGORY, BRAND, PRICE) values(:productId, :name, :category, :brand, :price)";
	private NamedParameterJdbcTemplate npJdbcTemplate;

	public void setNpJdbcTemplate(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}

	public ProductDao(NamedParameterJdbcTemplate npJdbcTemplate) {
		super();
		this.npJdbcTemplate = npJdbcTemplate;
	}
	
	public int addproduct(ProductDtoIn product){
		int result= 0;
		BeanPropertySqlParameterSource paramMap= null;
		
		paramMap=new BeanPropertySqlParameterSource(product);
		result=npJdbcTemplate.queryForObject(SQL_INSERT_TO_PRODUCTS, paramMap, Integer.class);
		return result;
		
	}
}
