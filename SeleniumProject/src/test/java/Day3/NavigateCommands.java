package Day3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		//driver.get("https://www.simplilearn.com/");
        driver.navigate().to("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.ambitionbox.com/list-of-companies?locations=hyderabad&sortBy=popular&indianEmployeeCounts=501-1000,201-500,51-200&page=11");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.quit();
		

	}

}
