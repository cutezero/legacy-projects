package com.cfn.spring.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.cfn.spring.dao.Employee;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;


public class MyPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Object> list= (List)model.get("employees");
		Iterator it= list.iterator();
		Paragraph p=new Paragraph("Employees List");
		p.setAlignment("center");
		Table t=new Table(4);
		t.setAlignment("center");
		t.addCell("empno");
		t.addCell("ename");
		t.addCell("sal");
		t.addCell("deptno");
		
		while(it.hasNext()){
			Employee e=(Employee) it.next();
			t.addCell(e.getEmpno()+"");
			t.addCell(e.getEname());
			t.addCell(e.getSal()+"");
			t.addCell(e.getDeptno()+"");
		}
		document.add(p);
		document.add(t);
		
	}
	
}
