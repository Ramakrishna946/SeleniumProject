package Day01;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstOne {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String Title=driver.getTitle();
		
		System.out.println(Title);
		
		if(Title.equals("Downloads | Selenium"))
		{
			System.out.println("Print Testcase passed successfully......@@@!");
		}
	
		else {
			System.out.println("Print Testcase Failed ....@@@!");
		}
		
		driver.close();

		System.out.println("Welcome to automation testing................!!!!!!!!!!");


		
	}

}
