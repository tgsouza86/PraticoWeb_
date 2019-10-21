package Pratico_Web_Cenário_Um;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage extends FlightFinderMapping {
	
	public FlightFinderPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		
	}

	public void selecionarDetalhesVoo() {
		
		type.click();
		
		Select comboPassengers = new Select(passengers);
		comboPassengers.selectByValue("roundtrip");
		
		Select comboDepartingFrom = new Select(departingFrom);
		comboDepartingFrom.selectByValue("London");
		
		Select comboOnMonth = new Select(onMonth);
		comboOnMonth.selectByValue("1");
		
		Select comboOnDay = new Select(onDay);
		comboOnDay.selectByValue("1");
		
		Select comboArrivingIn = new Select(arrivingIn);
		comboArrivingIn.selectByValue("Acapulco");
		
		Select comboReturningMonth = new Select(returningMonth);
		comboReturningMonth.selectByValue("1");
		
		Select comboReturningDay = new Select(returningDay);
		comboReturningDay.selectByValue("20");
		
		serviceClass.click();
		
		Select comboairline = new Select(airline);
		comboairline.selectByValue("Blue Skies Airlines");
	}

	public void clicarContinuar() {
		
		continuar.click();
	}
	
	

}
