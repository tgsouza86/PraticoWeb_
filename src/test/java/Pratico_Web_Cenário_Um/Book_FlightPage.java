package Pratico_Web_Cenário_Um;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Book_FlightPage extends Book_FlightMapping{

	public Book_FlightPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		
	}
	public void preencherDadosCobranca() {
		// TODO Auto-generated method stub
		firstName.sendKeys("Tiago");
		
		lastName.sendKeys("Souza");
		
		Select comboMeal = new Select(meal);
		comboMeal.selectByValue("Low Calorie");
		
		Select combocardType = new Select(cardType);
		combocardType.selectByValue("AX");
		
		numberCard.sendKeys("1313141244");
		
		Select comboExpirationMonth = new Select(expirationMonth);
		comboExpirationMonth.selectByValue("01");
		
		Select comboExpirationYear = new Select(expirationYear);
		comboExpirationYear.selectByValue("2010");
		
		
		
		
	}

	public void confirmarCompradaPassagem() {
		// TODO Auto-generated method stub
		
		securePurchase.click();
	}

}
