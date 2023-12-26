package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllValues {

	public static String[][] readData() throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./exceldata/DeleteLeadData.xlsx");
		XSSFSheet sheetAt = book.getSheetAt(0); // index always starts with zero
		
		XSSFRow row = sheetAt.getRow(0);
		XSSFCell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);	
		
		//to get the number of rows from the excel sheet
		
	      int rowCount = sheetAt.getLastRowNum(); //count of active rows-->row having data filled
	     //by default treat the first row as a header ,it ignores to take into count
	      short colCount = row.getLastCellNum();		
		
	     System.out.println(rowCount);
	     System.out.println(colCount);
	     
	     String[][] data=new String[rowCount][colCount];
	     
	     for(int i=1;i<=rowCount;i++) {//row iterate outer loop
	    	 for(int j=0;j<colCount;j++) {  //col iterate  	 //ineer loop	    		 
	    		 //sheet-->row-->cell-->value
	    		 String allValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
	    		 data[i-1][j]=allValues; //data[0][0] =cname
	    		// data[0][0]=Testleaf
	    	 }
	     }
	     
	     //1,0 1,1 1,2 1,3 reading from excel and pushing to -->data 0,0 
	     //2,0 2,1 2,2 2,3
	     book.close();
	     return data;
		
	}
	//[][]

}
