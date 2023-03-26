package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "FeatureFiles",
glue={"stepDefinitions","hooks"},
dryRun=false,
//strict=false,
monochrome = true,
plugin = {"html:CucumberReport/HtmlReport.html","json:CucumberReport/JsonReport.json","junit:CucumberReport/XmlReport.xml"},
tags= ("@BackgroundHooks")
		)
public class RunnerClass {

}
