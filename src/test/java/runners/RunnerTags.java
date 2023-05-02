package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.BeforeSuite;
import utils.DataToFeature;
import utils.RunnerPersonalizado;

import java.io.IOException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/reto.feature"},
        glue = "stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTags {
}
