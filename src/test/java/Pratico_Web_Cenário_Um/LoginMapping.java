package Pratico_Web_Cenário_Um;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMapping {
	
	
	@FindBy (xpath = "//input[@name='userName']")
	protected WebElement usuario;
	
	@FindBy (xpath ="//input[@name='password']")
	protected WebElement senha;
	
	@FindBy (xpath ="//input[@value='Login']")
	protected WebElement singIn;
}
