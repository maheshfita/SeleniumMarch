package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpage {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:/Mahesh/ChromeDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// navigate to google
		
		driver.get("https://www.seleniumhq.org/");
		
		// to print the title of the page
	String	ExpectedTitle = "selenium - web browserautomation";
		String ActualTitle = driver.getTitle();
		System.out.println("title of the page is "+driver.getTitle());	
		// click on download button in selenium site
		/*if (ExpectedTitle.equals(ActualTitle)){
			driver.findElement(By.xpath("//a[text()='Download']")).click();
			
		}else{
			driver.close();
		}
		*/
		
		if (ExpectedTitle.equalsIgnoreCase(ActualTitle)){
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		
	}else{
		driver.close();
	}
	
	
		
		
		
		
		
		
	}

}
