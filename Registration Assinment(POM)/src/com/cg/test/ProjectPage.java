package com.cg.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProjectPage {

	@FindBy(how=How.ID,using="projectname")
	 WebElement projectname;
	
	@FindBy(how=How.ID,using="clientname")
	 WebElement clientname;
	
	@FindBy(how=How.ID,using="teamsize")
	 WebElement teamsize;
	
	@FindBy(id="submit")
	 WebElement submit;
}
