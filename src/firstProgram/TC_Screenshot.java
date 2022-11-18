package firstProgram;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;

public class TC_Screenshot {
	

	public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		try {
		
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		System.out.println("Application open");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement( By.linkText("Add Employee123")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on submenu");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		}
		catch(Exception e) {
		
			File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1,new File("D://TestResults.png"));
		}
		 driver.close();
}
}