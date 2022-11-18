package firstProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Mouseover {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application open");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	Actions ac=new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
			driver.findElement(By.linkText("Add employee")).click();
			System.out.println("Clicked on add emp");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	Thread.sleep(3000);
	driver.close();
}
}

