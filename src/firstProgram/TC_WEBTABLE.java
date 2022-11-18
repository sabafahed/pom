package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WEBTABLE {
public static void main(String args[])throws Exception
{
	System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("file:/D:/WebTable.html");
	//count
	int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
	int column=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
	int row_column=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
	System.out.println("row count"+row);
	System.out.println("column count"+column);
	System.out.println("row_column count"+row_column);
	//celldata
	String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(celldata);
	Thread.sleep(3000);
	//DATA-TABLE
	for(int i=1;i<=row;i++)
	{
		String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
		System.out.println(data);
		Thread.sleep(5000);
	
	}
	driver.close();
}
}

