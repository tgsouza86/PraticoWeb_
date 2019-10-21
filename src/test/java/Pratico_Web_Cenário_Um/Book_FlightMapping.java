package Pratico_Web_Cenário_Um;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Book_FlightMapping {
	
	@FindBy (xpath = "//input[@name='passFirst0']")
	protected WebElement firstName;	
	
	@FindBy (xpath = "//input[@name='passLast0']")
	protected WebElement lastName;	

	@FindBy (xpath = "//select[@name='pass.0.meal']")
	protected WebElement meal;
	
	@FindBy (xpath = "//select[@name='creditCard']")
	protected WebElement cardType;
	
	@FindBy (xpath = "//input[@name='creditnumber']")
	protected WebElement numberCard;
	
	@FindBy (xpath = " //select[@name='cc_exp_dt_mn']")
	protected WebElement expirationMonth;
	
	@FindBy (xpath = " //select[@name='cc_exp_dt_yr']")
	protected WebElement expirationYear;
	
	@FindBy (xpath = "//input[@name='buyFlights']")
	protected WebElement securePurchase;
	
}
