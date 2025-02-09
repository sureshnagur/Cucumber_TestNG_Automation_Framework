package coreRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features",  glue="stepDefinitions",
				tags="@Pi",  monochrome=true, plugin={"pretty", "html:target/cucumber.html"})

public class TestRunner extends AbstractTestNGCucumberTests{

	
}
