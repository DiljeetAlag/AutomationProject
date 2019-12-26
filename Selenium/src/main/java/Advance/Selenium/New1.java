package Advance.Selenium;




import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DILJEET ALAG\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com"); //URL in the browser
		driver.findElement(By.id("privacy-link")).click();
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		
	}

}