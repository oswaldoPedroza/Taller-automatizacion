package com.tcs.training.proyectoscreenplay.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\ingresar.feature",
        glue = "com.tcs.training.proyectoscreenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Ingresar {

}
