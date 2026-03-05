package com.payrollservice;

import java.io.FileWriter;
import java.io.IOException;

public class FileService {
	
	public static String savePaySlipAsText(PaySlip payslip) throws IOException{
		String fileName = "Payslip_"+payslip.getEmpId()+"_"+System.currentTimeMillis()
+".txt";
		FileWriter fw = new FileWriter(fileName);
		fw.write(payslip.toString());
		fw.close();
		
		return fileName;
	}
	
	
	public static String savePaySlipAsPdf(PaySlip payslip) throws IOException{
		String fileName = "Payslip_"+payslip.getEmpId()+"_"+System.currentTimeMillis()
+".pdf";
		FileWriter fw = new FileWriter(fileName);
		fw.write(payslip.toString());
		fw.close();
		
		return fileName;
	}
}
