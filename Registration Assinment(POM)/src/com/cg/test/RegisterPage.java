package com.cg.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
	
	@FindBy(how=How.ID,using="firstname")
	 WebElement fname;
	
	@FindBy(how=How.ID,using="lastname")
	 WebElement lname;
	
	@FindBy(how=How.ID,using="email")
	 WebElement email;
	
	@FindBy(how=How.ID,using="contact")
	 WebElement contact;
	
	@FindBy(how=How.ID,using="address")
	 WebElement address;
	
	@FindBy(how=How.ID,using="city")
	 WebElement city;
	
	@FindBy(id="state")
	 WebElement state;
	
	@FindBy(id="submit")
	 WebElement submit;

	
	
}
