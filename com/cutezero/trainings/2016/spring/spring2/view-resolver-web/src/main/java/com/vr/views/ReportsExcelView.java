package com.vr.views;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ReportsExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> modelMap, HSSFWorkbook workbook, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {

		workbook= new HSSFWorkbook();
	}

	
}
