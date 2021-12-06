package utils;

public class GetExcelData {
	
	public static void main(String[] args) {
		
		String excelPath = "./data/test_data.xlsx";
		String sheetName = "LoginTestData";
		
		ReadExcel excel = new ReadExcel(excelPath, sheetName);
		excel.getCellData();
		
	}
}
