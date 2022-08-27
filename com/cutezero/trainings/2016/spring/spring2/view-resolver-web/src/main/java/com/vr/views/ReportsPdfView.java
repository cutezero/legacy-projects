package com.vr.views;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.vr.dto.ReportDto;
public class ReportsPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> modelMap, Document doc, PdfWriter writer, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		doc.addTitle("Reports JAN 2017");
		
		List<ReportDto> reports= null;
//		reports= new ArrayList<ReportDto>();
		reports= Arrays.asList(new ReportDto(001, "Srikanta", "8895749052", "srikanta.ydon@gmail.com"),
				new ReportDto(101, "Biswanath", "7381267320", "biswanath.wow3@gmail.com"),
				new ReportDto(124, "Madhu", "989890780", "madhujoshi2019@gmail.com"),
				new ReportDto(1290, "Jagddesh", "909000987", "reddyjaggu@gmail.com"));
		
		PdfPTable table= new PdfPTable(4);
		table.addCell("Report ID ");
		table.addCell("Name");
		table.addCell("Mobile");
		table.addCell("email");
		
		for (ReportDto dto : reports){
			table.addCell(dto.getReportId()+"");
			table.addCell(dto.getName());
			table.addCell(dto.getMobile());
			table.addCell(dto.getEmail());
		}
		
		doc.add(table);
	}


	
}
