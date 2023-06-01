package com.automation.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMLeaveOption  {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\teegelasrikanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")).click();
		
		// Verify if the leave application form is displayed
		
		 driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[3]")).isDisplayed(); {
             System.out.println("Leave List form displayed!");
             
          // Find the elements for leave List and enter the required details and Validation
             driver.findElement(By.xpath("//label[normalize-space()='From Date']")).isDisplayed();{
            	 System.out.println("From Date");
              
             driver.findElement(By.xpath("//label[normalize-space()='To Date']")).isDisplayed();
              System.out.println("To Date");
            	 
             }
             
             WebElement fromDateInput = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
             fromDateInput.sendKeys("2023-03-1");
             
            WebElement toDateInput =  driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]"));
            toDateInput.sendKeys("2023-05-30");
             
             
             driver.findElement(By.xpath("//label[@class='oxd-label oxd-input-field-required']")).isDisplayed();
             System.out.println("Show Leave with Status");

             
             WebElement drpLeaveStatus = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
             drpLeaveStatus.click();
             
             drpLeaveStatus.isDisplayed();
             System.out.println("List of Leave Status is Displayed");
             
             driver.findElement(By.xpath("(//div[@class='oxd-input-group__label-wrapper'])[4]")).isDisplayed();
             System.out.println("Leave Type");
             
             WebElement drpLeaveType = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
             drpLeaveType.click();
            
             drpLeaveType.isDisplayed();
             System.out.println("List Of Leave Type is Displayed");
             
             
             WebElement ValidateEmpName = driver.findElement(By.xpath("//label[normalize-space()='Employee Name']"));
             ValidateEmpName.isDisplayed();
             System.out.println("Employee Name is displayed");
             
             WebElement EnterEmpName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
             EnterEmpName.sendKeys("Test User");
             
             WebElement ValidateSubUnit = driver.findElement(By.xpath("//label[normalize-space()='Sub Unit']"));
             ValidateSubUnit.isDisplayed();
             System.out.println("Sub Unit is displayed");
             
             WebElement drpSubUnit = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]"));
             drpSubUnit.click();
             
             drpSubUnit.isDisplayed();
             System.out.println("List of Sub Unit is Displayed");
             
             WebElement ValidatePastEmp = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-leave-filter-text'])[1]"));
             ValidatePastEmp.isDisplayed();
             System.out.println("Validate the past employees filter text is displayed");
             
             WebElement ClickCheckbox = driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
             ClickCheckbox.click();
            
             WebElement ValidateSearchbutton = driver.findElement(By.xpath("(//button[normalize-space()='Search'])[1]"));
             ValidateSearchbutton.isDisplayed();
             System.out.println("Validate Search Button");
             
             ValidateSearchbutton.click();
             
             WebElement ValidateRestButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
             ValidateRestButton.isDisplayed();
             System.out.println("Validate Reset Button ");
             
             ValidateRestButton.click();
             System.out.println("Reset all Enter Data");         
                          
             
		 }
	}

}

