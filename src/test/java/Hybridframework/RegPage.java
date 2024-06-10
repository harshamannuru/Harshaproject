package Hybridframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {
WebDriver driver;
public RegPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[text()='Register']")
WebElement register;

@FindBy(id="customer.firstName")
WebElement firstName;

@FindBy(id="customer.lastName")
WebElement lastName;

@FindBy(id="customer.address.street")
WebElement txtaddress;

@FindBy(id = "customer.address.city")
WebElement city;

@FindBy(id = "customer.address.state")
WebElement state;

@FindBy(id = "customer.address.zipCode")
WebElement zipCode;

@FindBy(id = "customer.phoneNumber")
WebElement phoneNumber;

@FindBy(id = "customer.ssn")
WebElement ssn;

@FindBy(id = "customer.username")
WebElement username;

@FindBy(id = "customer.password")
WebElement password;

@FindBy(id = "repeatedPassword")
WebElement repeatedPassword;

@FindBy(xpath = "//input[@value='Register']")
WebElement registerButton;

//Perform actions
 public void Clickregisterbutton() {
	 register.click();
 }
 public void setfirstname(String fname) {
	firstName.sendKeys(fname); 	 
 }
 public void setlastname1() {
	lastName.sendKeys("Mannuru"); 	 
 }	 
 public void setaddress() {
	txtaddress.sendKeys("HYD"); 	
 }
 public void setcityname() {
	city.sendKeys("ABC"); 	 
 }
 public void setstatename() {
	state.sendKeys("Ap"); 	 
 }
 public void setZipcode() {
	zipCode.sendKeys("123456"); 	 
 }
 public void setphoneNumber() {
	phoneNumber.sendKeys("7337370958"); 	 
 }
 public void setssn() {
    ssn.sendKeys("1234"); 	 
 }
 public void setusername() {
	username.sendKeys("Harsha"); 	 
 }
 public void setpassword() {
	password.sendKeys("Mannuru123"); 	 
 }
 public void setrepeatedPassword() {
	
	 repeatedPassword.sendKeys("Mannuru123"); 	 
 }
 public void registerButton() {
	 registerButton.click(); 	 
 }

	
}

	
	



