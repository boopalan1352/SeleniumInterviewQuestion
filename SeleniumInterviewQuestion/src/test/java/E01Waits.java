import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E01Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//soundaryamohan//IdeaProjects//Hello//Drivers//chromedriver");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		WebDriverWait wait=new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='LOGIN']")));
		WebElement login=driver.findElement(By.xpath("//button[.='LOGIN']"));
		login.click();
		
		Wait<WebDriver> Fluentwait=new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(30))
				.withTimeout(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

	}

}
