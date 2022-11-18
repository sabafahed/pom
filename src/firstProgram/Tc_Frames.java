package firstProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Tc_Frames {
public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application open");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");

	//frames
	driver.switchTo().frame("rightMenu");

	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
			driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
			driver.findElement(By.name("txtEmpLastName")).sendKeys("saba");
			driver.findElement( By.id("btnEdit")).click();
			Thread.sleep(4000);
			System.out.println("New emp added");
			//exit from frame

		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Thread.sleep(3000);
		driver.close();
		
}
}