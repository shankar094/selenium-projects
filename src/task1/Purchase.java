package task1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils; import org.openqa.selenium.By;
import org.openqa.selenium.OutputType; import org.openqa.selenium.TakesScreenshot; import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Purchase {
public static void main(String[] args) throws IOException, InterruptedException { 
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
"\\Driver\\chromedriver.exe");
 

WebDriver driver = new ChromeDriver(); 
driver.get("http://automationpractice.com/index.php"); 
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
signin.click();

WebElement email = driver.findElement(By.id("email")); 
email.sendKeys("shankarrajeswari09@gmail.com");

WebElement password = driver.findElement(By.id("passwd")); 
password.sendKeys("1234@3256");

WebElement login = driver.findElement(By.id("SubmitLogin"));
login.click();

TakesScreenshot ts = (TakesScreenshot)driver;


File src = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\SHANKAR\\eclipse-workspace\\Selenium\\Screenshot.png");


FileUtils.copyFile(src, dest);


WebElement women= driver.findElement(By.xpath("//a[@title='Women']"));
women.click();
 
WebElement tops = driver.findElement(By.xpath("//a[contains(@title,'Choose')]")); 
tops.click();

WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[4]"));
tshirt.click();

WebElement productname = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]"));
productname.click();


WebElement addtocart = driver.findElement(By.id("add_to_cart")); 
addtocart.click();


WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed tocheckout']"));


proceed.click();


WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));


proceed1.click();


WebElement proceed2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
proceed2.click();


WebElement terms = driver.findElement(By.id("cgv"));
terms.click();
 
WebElement process = driver.findElement(By.xpath("//button[@name='processCarrier']"));
process.click();


WebElement paymentmethod = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
paymentmethod.click();
WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]")); 
confirm.click();

File src1 = ts.getScreenshotAs(OutputType.FILE);
File dest1 = new File("C:\\Users\\SHANKAR\\eclipse-workspace\\Selenium\\Screenshot\\Screenshot3.png");
FileUtils.copyFile(src1, dest1);


}


}

