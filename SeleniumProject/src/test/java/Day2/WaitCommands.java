package Day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitCommands {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
        boolean Status=driver.findElement(By.xpath("//img[@title='Simplilearn - Online Certification Training Course Provider']")).isDisplayed();
		
		System.out.println("The Webpage logo Status is:" + Status );
		
		String Title= driver.getTitle();
		
		System.out.println("The Title Is:  "+  Title);
		
		String Url= driver.getCurrentUrl();
		System.out.println("The WebPage Url Is:  "+  Url);
		
		String Page=driver.getPageSource();
		System.out.println("The WebPage Source Is:  "+   Page);
		
		String WindowId=driver.getWindowHandle();
		System.out.println("Window Id:  " +   WindowId);
        driver.findElement(By.linkText("Resources")).click();
		
		Set<String> Windowids= driver.getWindowHandles();
		
		System.out.println(Windowids);
		
		driver.close();
		driver.quit();
		
		
		
	}

}
