package Pratico_Web_Cenário_Um;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectFlightMapping {

	@FindBy (xpath = "//input[@value='Unified Airlines$363$281$11:24']")
	protected WebElement radioDepart;
	
	@FindBy (xpath = "//input[@value='Unified Airlines$633$303$18:44']")
	protected WebElement radioReturn;
	

	@FindBy (xpath = "//input[@name='reserveFlights']")
	protected WebElement continuardois;
	
	
	
	
	
}
