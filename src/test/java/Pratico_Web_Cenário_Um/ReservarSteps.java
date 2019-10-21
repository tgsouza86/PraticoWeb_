package Pratico_Web_Cenário_Um;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReservarSteps {

    @Given  ("acessei o site da newtours")
    public void acessarSiteNewtours(){
    	LoginPage loginPage = new LoginPage();
    	loginPage.acessarSiteNewtours();
    }
    @Then   ("realizando o login com sucesso")
    public void realizarLoginSucesso() {
    	LoginPage loginPage = new LoginPage();
    	loginPage.realizarLoginSucesso();
    }
    @And    ("seleciono os detalhes do voo")
    public void selecionarDetalhesVoo() {
    	FlightFinderPage flightFinderPage = new FlightFinderPage ();
    	flightFinderPage.selecionarDetalhesVoo();
    }
    @Then   ("clico no botao continuar")
    public void clicarContinuar() {
    	FlightFinderPage flightFinderPage = new FlightFinderPage ();
    	flightFinderPage.clicarContinuar();
    	
    }
    @And    ("seleciono o voo")
    public void selecionarVoo() {
    	SelectFlightPage selectFlightMapping = new SelectFlightPage ();
    	selectFlightMapping.selecionarVoo();
    	
    }
    @When   ("preencho os dados de cobranca")
    public void preencherDadosCobranca() {
    	Book_FlightPage book_FlightMapping = new Book_FlightPage ();
    	book_FlightMapping.preencherDadosCobranca();
    }
    @And    ("confirmo a compra da passagem")
    public void confirmarCompradaPassagem() {
    	Book_FlightPage book_FlightMapping = new Book_FlightPage ();
    	book_FlightMapping.confirmarCompradaPassagem();    	
    }
    
    
}
