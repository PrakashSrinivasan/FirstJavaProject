package demo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://acme-test.uipath.com/login");
//		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
//		driver.findElementById("password").sendKeys("leaf@12");
//		driver.findElementByXPath("//button[@type='submit']").click();
//        System.out.println(driver.getTitle());
//        driver.close();
		driver.get("https://www.amazon.in/");
	}
}
