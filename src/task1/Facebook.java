package task1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\Driver\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement createaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createaccount.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("raja");
		
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("sekar");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("raja@gmail.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("12354");
		
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		
		Select s = new Select(birthday);
		s.selectByValue("9");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByValue("4");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s2 = new Select(year);
		
		s2.selectByValue("1994");
		
		List<WebElement> options = s2.getOptions();
		
		for (WebElement opt : options)
		{
			
			String text = opt.getText();
			System.out.println(text);
			
			
			
			
		}
				
	}

}
