package firstProgram;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Window {
public static void main(String args[]) throws Exception {
	//test steps
	System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//1st window
	driver.navigate().to("file:///D:/multiplewindows.html");
	//2nd window
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	//3rd window
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String> windinfo=new ArrayList<> (driver.getWindowHandles());
	driver.switchTo().window(windinfo.get(0));
	driver.close();
}
}
