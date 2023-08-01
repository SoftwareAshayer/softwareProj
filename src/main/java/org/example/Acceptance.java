package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ashay\\OneDrive\\Desktop\\softwareProj-main\\src\\main\\java\\org\\use_cases",
		plugin="html:target/cucumber/report.html",
		monochrome=true,
		snippets= CucumberOptions.SnippetType.CAMELCASE,
		glue= "tests")

public class Acceptance {



}






