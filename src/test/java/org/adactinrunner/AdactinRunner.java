package org.adactinrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\org\\adactin\\feature",glue="org.AdactinStepDefinition")
public class AdactinRunner {

}
