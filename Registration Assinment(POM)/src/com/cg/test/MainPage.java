package com.cg.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;





public class MainPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Sabari\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Users/sasowmya/Desktop/Bootstrap.html");
		
		RegisterPage regpage = PageFactory.initElements(driver, RegisterPage.class);
		
		regpage.fname.sendKeys("sabari");
		regpage.lname.sendKeys("sowmya");
		regpage.email.sendKeys("sabari@gmail.com");
		regpage.contact.sendKeys("9876543210");
		regpage.address.sendKeys("poonthotam");
		regpage.city.sendKeys("Villupuram");
		regpage.state.sendKeys("TamilNadu");
		regpage.submit.click();
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sabari\\chrome driver\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("D:\\BDD workspace\\Registration Assignment\\src\\com\\cg\\junit\\projectdetails.html");
		
		ProjectPage propage = PageFactory.initElements(driver1, ProjectPage.class);
		propage.projectname.sendKeys("Capgemini");
		propage.clientname.sendKeys("PaulHermalin");
		propage.teamsize.sendKeys("75");
		propage.submit.click();
		

}
}