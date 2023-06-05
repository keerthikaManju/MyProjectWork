import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageItems {
	
	WebDriver driver;
	
	@BeforeSuite
	
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@BeforeTest
	
	public void login() {
		
		driver.get("http://tm-demo.xyloinc.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/div[2]/button")).click();
		
		
		
	}
	
	@AfterTest
	
	public void logout() {
		
		//driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-drawer-container/mat-drawer-content/div/app-navbar/nav/div/div[2]/ul/li[2]/a/i")).click();
	    //driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-drawer-container/mat-drawer-content/div/app-navbar/nav/div/div[2]/ul/li[2]/div/a[4]")).click();
	System.out.println("done");
	}
	
	@Test
	public void inventory() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//driver.get("http://tm-demo.xyloinc.com/#/admin/dashboard");
		driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-4\"]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-drawer-container/mat-drawer/div/app-sidebar/div/aside/mat-accordion/mat-expansion-panel[5]/div/div/mat-nav-list/a[1]/span/span[3]")).click();
		
		//delete button
		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-drawer-container/mat-drawer-content/div/app-all-items/div[2]/div/div/div/div[2]/div/mat-table/mat-row[2]/mat-cell[8]/button/span[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-drawer-container/mat-drawer-content/div/app-all-items/div[1]/div/div[2]/div/div/button[1]")).click();
	}

}
