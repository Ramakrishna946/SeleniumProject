package Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		driver.get("https://www.htmldog.com/examples/inputcheckboxes.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("//input[@id='drama']")).click();
		List<WebElement> WebList=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement index:WebList) {
			
			index.click();
		}
		Thread.sleep(3000);
		
          for(WebElement index:WebList) {
			
			index.click();
		}
		
          for(int i=0; i<2; i++) {
        	  
        	  WebList.get(i).click();
          }
		for(int i=0;i<WebList.size(); i++) {
			
			if(WebList.get(i).isSelected())
			
			WebList.get(i).click();
		}
		
		driver.close();
		
		

	}

}
