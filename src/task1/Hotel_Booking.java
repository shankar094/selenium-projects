package task1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Booking {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHANKAR\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));

		username.sendKeys("shankar123");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Shrrji09@94");

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement location = driver.findElement(By.id("location"));

		Select s = new Select(location);

		s.selectByValue("Paris");

		WebElement hotel = driver.findElement(By.id("hotels"));

		Select s1 = new Select(hotel);

		s1.selectByValue("Hotel Hervey");

		WebElement roomtype = driver.findElement(By.id("room_type"));

		Select s2 = new Select(roomtype);
		s2.selectByValue("Super Deluxe");

		WebElement noofrooms = driver.findElement(By.id("room_nos"));

		Select s3 = new Select(noofrooms);
		s3.selectByValue("2");

		WebElement checkindate = driver.findElement(By.id("datepick_in"));

		checkindate.clear();
		checkindate.sendKeys("01/03/2022");

		WebElement checkoutdate = driver.findElement(By.id("datepick_out"));
		checkoutdate.clear();
		checkoutdate.sendKeys("05/03/2022");

		WebElement adultsperroom = driver.findElement(By.id("adult_room"));

		Select s5 = new Select(adultsperroom);

		s5.selectByValue("2");

		WebElement childperroom = driver.findElement(By.id("child_room"));

		Select s6 = new Select(childperroom);
		s6.selectByValue("1");

		WebElement search = driver.findElement(By.id("Submit"));

		search.click();

		WebElement select = driver.findElement(By.id("radiobutton_0"));

		select.click();

		WebElement clicktocontinue = driver.findElement(By.id("continue"));
		clicktocontinue.click();

		WebElement firstname = driver.findElement(By.id("first_name"));

		firstname.sendKeys("shankar");

		WebElement lastname = driver.findElement(By.id("last_name"));

		lastname.sendKeys("uthayathasan");

		WebElement address = driver.findElement(By.id("address"));

		address.sendKeys("No.859/3 2nd lane,Anotny church road,London,Paris");

		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys("1245234655898896");

		WebElement cardtype = driver.findElement(By.id("cc_type"));

		Select s7 = new Select(cardtype);
		s7.selectByValue("AMEX");

		WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));

		Select s8 = new Select(expirymonth);
		s8.selectByValue("5");

		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));

		Select s9 = new Select(expiryyear);
		s9.selectByValue("2022");

		WebElement cvvcode = driver.findElement(By.id("cc_cvv"));

		cvvcode.sendKeys("987");

		WebElement booknow = driver.findElement(By.id("book_now"));

		booknow.click();

	}

}
