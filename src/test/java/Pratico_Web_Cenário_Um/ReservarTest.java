package Pratico_Web_Cenário_Um;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Reservar_um_ticket.feature",

glue={ "" },

monochrome = true, dryRun = false)
public class ReservarTest {

}



