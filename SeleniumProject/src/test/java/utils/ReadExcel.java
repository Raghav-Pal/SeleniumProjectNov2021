package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ReadExcel(String excelPath, String sheetName) {
		try {
			this.workbook = new XSSFWorkbook(excelPath);
			this.sheet = workbook.getSheet(sheetName);
		}catch(Exception exp) {
			System.out.println("*** some exception - "+exp.getMessage());
		}
	}


	public int getRowCount() {
		int rowCount=0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count = "+rowCount);

		}catch(Exception exp) {
			System.out.println("*** some exception - "+exp.getMessage());
		}
		return rowCount;
	}


	public int getColCount() {

		int colCount=0;
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Col Count = "+colCount);

		}catch(Exception exp) {
			System.out.println("*** some exception - "+exp.getMessage());
		}
		return colCount;

	}


	public void getCellData() {

		try {
			int rowCount = getRowCount();
			int colCount = getColCount();

			DataFormatter formatter = new DataFormatter();

			for(int i=1; i<rowCount; i++) {
				for(int j=0; j<colCount; j++) {
					Object cellValue = formatter.formatCellValue(sheet.getRow(i).getCell(j));
					System.out.print(cellValue+" | ");
				}
				System.out.println();
			}

		}catch(Exception exp) {
			System.out.println("*** some exception - "+exp.getMessage());
		}

	}


	public Object getCellValue(int rowNum, int colNum) {
		
		Object cellValue=null;
		try {
			DataFormatter formatter = new DataFormatter();
			cellValue = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			//System.out.println(cellValue);

		}catch(Exception exp) {
			System.out.println("*** some exception - "+exp.getMessage());
		}
		return cellValue;
	}


}
