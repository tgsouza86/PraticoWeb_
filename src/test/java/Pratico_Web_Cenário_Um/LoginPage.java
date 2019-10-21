package Pratico_Web_Cenário_Um;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMapping {

	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void acessarSiteNewtours() {
		
		usuario.sendKeys("mercury");
		senha.sendKeys("mercury");
		
		// TODO Auto-generated method stub
		
	}






	public void realizarLoginSucesso() {
		singIn.click();
		// TODO Auto-generated method stub
		
	}






	

}
