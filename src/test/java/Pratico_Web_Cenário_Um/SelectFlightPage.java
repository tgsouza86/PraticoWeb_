package Pratico_Web_Cenário_Um;

import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage extends SelectFlightMapping {

	public SelectFlightPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
		
	}

	
	public void selecionarVoo() {
		
		radioDepart.click();
		radioReturn.click();
		continuardois.click();
		
		
	}

}
