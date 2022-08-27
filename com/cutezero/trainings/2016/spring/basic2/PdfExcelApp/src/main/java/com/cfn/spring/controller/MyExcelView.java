package com.cfn.spring.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.cfn.spring.dao.Employee;

@SuppressWarnings("deprecation")
public class MyExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Sheet sheet= workbook.createSheet("Sheet1");
		List<Object> list= (List)model.get("employees");
		Iterator it=list.iterator();
		Row r1=sheet.createRow(0);
		Cell c1=r1.createCell(0);
		c1.setCellValue("empno");
		Cell c2=r1.createCell(1);
		c2.setCellValue("ename");
		Cell c3=r1.createCell(2);
		c3.setCellValue("sal");
		Cell c4=r1.createCell(3);
		c4.setCellValue("deptno");
		
		int rowIndex=1;
		while(it.hasNext()){
			Employee e= (Employee)it.next();
			Row r=sheet.createRow(rowIndex);
			Cell c5=r1.createCell(0);
			c5.setCellValue(e.getEmpno());
			Cell c6=r1.createCell(1);
			c6.setCellValue(e.getEname());
			Cell c7=r1.createCell(2);
			c7.setCellValue(e.getSal());
			Cell c8=r1.createCell(3);
			c8.setCellValue(e.getDeptno());
			rowIndex++;
		}

	}

}
