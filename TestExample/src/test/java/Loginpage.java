import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	WebDriver driver;

	@BeforeSuite
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
	}

	@Test

	public void login() {

		driver.get("http://tm-demo.xyloinc.com/");
		driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys("admin@123");

		driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/div[2]/button")).click();
	}

	@AfterSuite

	public void quit() {

		driver.quit();
	}

}
