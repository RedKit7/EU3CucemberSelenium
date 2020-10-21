package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        strict = true,
        tags = "@pageTitle"
      //  tags = "@driver or @VYT-123"
        //  tags = "@driver and not @VYT-123"
)
public class CukesRunner {


}
