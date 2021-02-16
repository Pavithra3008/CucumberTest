package StepDefinitions;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

public class Registration {
	
	@Before
    public void beforeScenario(){
		  System.setProperty("webdriver.chrome.driver",
					"C://Program Files/chromedriver.exe");
			
			driver = new ChromeDriver();
    } 
	WebDriver driver;

    @Given("^I open guru99 website$")
    public void open_guru99() throws Throwable {
    	driver.navigate().to("http://demo.guru99.com/insurance/v1/register.php");
      
        System.out.println("Registration page of the application is opened.");
    }

    @When("^user enter valid data on the page$")
    public void enter_valid_data(DataTable table) throws Throwable {
    	
    	List<List<String>> data=table.raw();
    	Select drpCountry = new Select(driver.findElement(By.id("user_title")));
		drpCountry.selectByVisibleText(data.get(1).get(1));
		Thread.sleep(2000);
        
		driver.findElement(By.id("user_firstname")).sendKeys(data.get(2).get(1));
		Thread.sleep(2000);
        
		driver.findElement(By.xpath("//input[@id='user_surname']")).sendKeys(data.get(3).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_phone']")).sendKeys(data.get(4).get(1));
		Thread.sleep(2000);
		
		Select sYear = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_1i']")));
		sYear.selectByVisibleText(data.get(5).get(1));
		Thread.sleep(2000);
		
		Select sMonth = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_2i']")));
		sMonth.selectByVisibleText(data.get(6).get(1));
		Thread.sleep(2000);
		
		Select sdate = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_3i']")));
		sdate.selectByVisibleText(data.get(7).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='licencetype_f']")).click();
		Thread.sleep(2000);
		
		Select sLicensePeriod = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[2]/div[5]/select[1]")));
		sLicensePeriod.selectByVisibleText(data.get(8).get(1));
		Thread.sleep(2000);
		
		Select sOccupation = new Select(driver.findElement(By.cssSelector("#user_occupation_id")));
		sOccupation.selectByVisibleText(data.get(9).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_address_attributes_street']")).sendKeys(data.get(10).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_address_attributes_city']")).sendKeys(data.get(11).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_address_attributes_county']")).sendKeys(data.get(12).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_address_attributes_postcode']")).sendKeys(data.get(13).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_email']")).sendKeys(data.get(14).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password']")).sendKeys(data.get(15).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']")).sendKeys(data.get(16).get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[3]/form[1]/div[5]/input[2]")).click();
		
		
        System.out.println("data entered in the application");
        }

        @Then("^the user registration should be successful$")
        public void successful_login() throws Throwable {
            driver.getTitle().contains("Title");
            System.out.println("Matching the title of the page after successful Registration.");
          
        }


        @After
        public void Close_the_browser() throws Throwable {
        	boolean funcLogin ;
        	if(driver.findElement(By.xpath("//h3[contains(text(),'Login')]")).isDisplayed())
        	 {
        	funcLogin = true;
        	}
        	else {
        	funcLogin = false;
        	}
        	if(funcLogin) {
        	System.out.println("Successful Registration");
        	 TakesScreenshot ts =((TakesScreenshot)driver);

             //Call getScreenshotAs method to create image file

                     File Src=ts.getScreenshotAs(OutputType.FILE);

                 //Move image file to new destination

                     File Desti=new File("./target/Snapshott/Regsuccess.png");

                     //Copy file at destination
                     FileUtils.copyFile(Src, Desti);

        	
        	}
        	else {
        	System.out.println("UnSuccessful Registration");
        	 TakesScreenshot ts =((TakesScreenshot)driver);

             //Call getScreenshotAs method to create image file

                     File Src=ts.getScreenshotAs(OutputType.FILE);

                 //Move image file to new destination

                     File Desti=new File("./target/Snapshott/Regunsuccess.png");

                     //Copy file at destination
                     FileUtils.copyFile(Src, Desti);
        	}
        	
            driver.close();
            System.out.println("Closes the browser opened through selenium");
           
        }
        
}