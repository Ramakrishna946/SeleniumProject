package Day3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsandPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		driver.get("https://www.htmldog.com/examples/inputcheckboxes.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	}

}
