package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features  ={"C:\\Users\\PC\\eclipse-workspace\\Practice\\src\\test\\resources\\Features\\Test2.feature"},
glue = "com.automation.Stepdef", plugin = {
		"html:reports/reports.html", "json:target/cucumber.json", "rerun:target/rerun.txt" })
public class TestRunner {

}
