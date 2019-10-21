package Pratico_Web_Cenário_Um;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightFinderMapping {

	@FindBy (xpath = "//input[@value='roundtrip']")
	protected WebElement type;
	
	
	@FindBy (xpath = "//select [@name='passCount']")
	protected WebElement passengers;
	
	@FindBy (xpath = "//select [@name='fromPort']")
	protected WebElement departingFrom ;
	
	@FindBy (xpath = "//select [@name='fromMonth']")
	protected WebElement onMonth ;
	
	@FindBy (xpath = "//select[@name='fromDay']")
	protected WebElement onDay ;
	
	@FindBy (xpath = "//select [@name='toPort']")
	protected WebElement arrivingIn;
	
	@FindBy (xpath = "//select [@name='toMonth']")
	protected WebElement returningMonth;
	
	@FindBy (xpath = "//select [@name='toDay']")
	protected WebElement returningDay;
	
	@FindBy (xpath = "//input[@value='Business']")
	protected WebElement serviceClass;
	
	@FindBy (xpath = "//select[@name='airline']")
	protected WebElement airline;
	
	@FindBy (xpath = "//input[@name='findFlights']")
	protected WebElement continuar;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
