import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ashay\\OneDrive\\Desktop\\softwareProj-main\\src\\test\\java\\feature\\use_cases",
		plugin="html:target/cucumber/report.html",
		monochrome=true,
		snippets= CucumberOptions.SnippetType.CAMELCASE,
		glue= "")

public class Acceptance {



}






