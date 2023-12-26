package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		// step:1 Set the filepath

		XSSFWorkbook book = new XSSFWorkbook("./exceldata/CLdata.xlsx");

		// step:2 find the sheet

		XSSFSheet sheetAt = book.getSheetAt(0); // index always starts with zero

		// XSSFSheet sheet = book.getSheet("createlead");

		// webpage-->table--> row-->column-->value

		// book-->sheet-->row -->cell-->value

		// to identify the row
		XSSFRow row = sheetAt.getRow(0);

		// to idenfify the cell
		XSSFCell cell = row.getCell(1);// a2

		// 0,0

		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

	}

}
