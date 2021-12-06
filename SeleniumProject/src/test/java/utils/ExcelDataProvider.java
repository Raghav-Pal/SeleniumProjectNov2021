package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	public Object[][] getData(String excelPath, String sheetName) {
		
		ReadExcel excel = new ReadExcel(excelPath, sheetName);
		
		int rowCount =  excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object[][] data = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			
			for(int j=0; j<colCount; j++) {
				
				Object testData = excel.getCellValue(i, j);
				data[i-1][j] = testData;
				System.out.print(data[i-1][j]+" | ");
			}
			System.out.println();
		}
		
		return data;
	}
	
	
	@DataProvider(name="TestData")
	public Object[][] getTestData() {
		
		String excelPath = "./data/test_data.xlsx";
		String sheetName = "Sheet1";
		Object data[][] = getData(excelPath, sheetName);
		return data;
	}
	
	
	@DataProvider(name="LoginTestData")
	public Object[][] getLoginData() {
		
		String excelPath = "./data/test_data.xlsx";
		String sheetName = "LoginTestData";
		Object data[][] = getData(excelPath, sheetName);
		return data;
	}
	
	
	@Test(dataProvider = "LoginTestData")
	public void loginTest(Object username, Object password) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username.toString());
		driver.findElement(By.id("txtPassword")).sendKeys(password.toString());
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	@Test(dataProvider = "TestData")
	public void test1(Object firstName, Object lastName, Object age) {
		
		System.out.println(" I am inside test1");
		System.out.print(firstName+"|"+lastName+"|"+age);
	}
	
	@Test
	public void test2() {
		System.out.println(" I am inside test2");
	}
	
}






