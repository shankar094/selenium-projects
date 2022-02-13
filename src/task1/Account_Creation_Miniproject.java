package task1;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; import org.openqa.selenium.support.ui.Select;

public class Account_Creation_Miniproject {


public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver",
"C:\\Users\\SHANKAR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");


WebDriver driver = new ChromeDriver();


driver.get("http://automationpractice.com/index.php"); driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
signin.click();
 

WebElement emailaddress = driver.findElement(By.id("email_create"));


emailaddress.sendKeys("shankarrajeswari09@gmail.com");


WebElement createaccount = driver.findElement(By.id("SubmitCreate")); 
createaccount.click();

WebElement Gender = driver.findElement(By.id("id_gender1")); 
Gender.click();

WebElement firstname = driver.findElement(By.id("customer_firstname")); 
firstname.sendKeys("Shankar");

WebElement lastname = driver.findElement(By.id("customer_lastname")); 
lastname.sendKeys("Uthyathasan");

WebElement password = driver.findElement(By.id("passwd"));
password.sendKeys("1234@3256");

WebElement days = driver.findElement(By.id("days"));


Select s = new Select(days); 
s.selectByValue("9");

WebElement months = driver.findElement(By.id("months"));


Select s1 = new Select(months);
s1.selectByValue("4");
 

WebElement years = driver.findElement(By.id("years"));


Select s2 = new Select(years);


s2.selectByValue("1994");


WebElement address = driver.findElement(By.id("address1"));


address.sendKeys("Mountain View, California, United States");


WebElement city = driver.findElement(By.id("city")); 
city.sendKeys("mountain view");

WebElement state = driver.findElement(By.id("id_state"));


Select s3 = new Select(state); s3.selectByValue("5");

WebElement postecode= driver.findElement(By.id("postcode"));
postecode.sendKeys("00650");



WebElement phonenumber = driver.findElement(By.id("phone_mobile")); 
phonenumber.sendKeys("9087019494");

WebElement assignaddress = driver.findElement(By.id("alias")); 
assignaddress.clear();
assignaddress.sendKeys("colifornia");
 

WebElement register = driver.findElement(By.id("submitAccount")); 
register.click();


}


}


