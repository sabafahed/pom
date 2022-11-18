package firstProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TestData {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String un="nareshit";
	static String pw="nareshit";
	static String title1="OrangeHRM-New Level of HR Management";		
	static String title2="OrangeHRM";
public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application open");
	if(driver.getTitle().equals(title1))
	{
		System.out.println("Title Matched");
	}
		else
		{
			System.out.println("Title not Matched");	
		}
	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	if(driver.getTitle().equals(title2))
	{
		System.out.println("Title Matched");
	}
		else
		{
			System.out.println("Title not Matched");	
		}
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	driver.close();
	}
}

