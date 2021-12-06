import java.io.File;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserActions {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		//open webpage
		driver.get("https://google.com");
		Thread.sleep(1000);
		//store window handle
		String originalWindow = driver.getWindowHandle();
		
		driver.navigate().to("https://www.selenium.dev/");
		//get url
		System.out.println(driver.getCurrentUrl());
		//get title
		System.out.println(driver.getTitle());
		//back forward refresh
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		*/
		/*
		//open and switch to new window or tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.switchTo().window(originalWindow);
		*/
		//close browser
		/*
		//frames
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement frame = driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Action")).click();
		driver.switchTo().defaultContent();
		*/
		/*
		driver.get("https://google.com");
		//size
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		System.out.println(width);
		System.out.println(height);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		driver.manage().window().setSize(new Dimension(800, 600));
		
		//position
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		driver.manage().window().setPosition(new Point(500, 100));
		Thread.sleep(3000);
		//maximise(), minimize(), fullscreen()
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		*/
		/*
		//screenshot
		driver.get("https://google.com");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./image1.png"));
		
		//WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		WebElement element = driver.findElement(By.id("hplogo"));
		File scrFile2 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("./image2.png"));
		*/
		
		// javascript
		driver.get("https://google.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement button = driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click();", button);
		js.executeScript("console.log('... Hello World...')");
		
		Thread.sleep(3000);
		//driver.close();
		//driver.quit();
	}
}
