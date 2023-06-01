package com.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMLoginPage{


	private WebDriver driver;

	public void login() {
		
		Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        String url = properties.getProperty("URL");
        String username = properties.getProperty("Username");
        String password = properties.getProperty("Password");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\teegelasrikanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

     
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")));

        
       WebElement UserName = driver.findElement(By.name("username"));
       UserName.sendKeys(username);            

       WebElement Password =  driver.findElement(By.name("password"));
        Password.sendKeys(password);
        
        
        
//        WebDriverWait wait3 = new WebDriverWait(driver, 20);
//        wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='Login']")));
//        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")).click();

				
	}

	public String LeaveList() {
		
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[3]")).isDisplayed(); 
      System.out.println("Leave List form displayed!");
      
       driver.findElement(By.xpath("//label[normalize-space()='From Date']")).isDisplayed();
     	 System.out.println("From Date");
       
       driver.findElement(By.xpath("//label[normalize-space()='To Date']")).isDisplayed();
       System.out.println("To Date");
       
       driver.findElement(By.xpath("//label[@class='oxd-label oxd-input-field-required']")).isDisplayed();
       System.out.println("Show Leave with Status");
       
       WebElement drpLeaveStatus = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
       drpLeaveStatus.isDisplayed();
       System.out.println("List of Leave Status is Displayed");
       
       driver.findElement(By.xpath("(//div[@class='oxd-input-group__label-wrapper'])[4]")).isDisplayed();
       System.out.println("Leave Type");
       
       WebElement drpLeaveType = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
       drpLeaveType.isDisplayed();
       System.out.println("List Of Leave Type is Displayed");
       
       WebElement ValidateEmpName = driver.findElement(By.xpath("//label[normalize-space()='Employee Name']"));
       ValidateEmpName.isDisplayed();
       System.out.println("Employee Name is displayed");
       
       WebElement ValidateSubUnit = driver.findElement(By.xpath("//label[normalize-space()='Sub Unit']"));
       ValidateSubUnit.isDisplayed();
       System.out.println("Sub Unit is displayed");
       
       WebElement drpSubUnit = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]"));
       drpSubUnit.isDisplayed();
       System.out.println("List of Sub Unit is Displayed");
       
       WebElement ValidatePastEmp = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-leave-filter-text'])[1]"));
       ValidatePastEmp.isDisplayed();
       System.out.println("Validate the past employees filter text is displayed");
       
       WebElement ValidateSearchbutton = driver.findElement(By.xpath("(//button[normalize-space()='Search'])[1]"));
       ValidateSearchbutton.isDisplayed();
       System.out.println("Validate Search Button");
       
       WebElement ValidateRestButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
       ValidateRestButton.isDisplayed();
       System.out.println("Validate Reset Button ");

		return null;
	}

}
