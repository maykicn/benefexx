package com.benefex.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources/features",
        glue = "com/benefex/stepDefinitions",
//        tags = "",
        dryRun = false
)
public class CukesRunner {
}
