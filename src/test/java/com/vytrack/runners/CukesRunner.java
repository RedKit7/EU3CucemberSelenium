package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@smoke",
          strict = true
      //  tags = "@driver or @VYT-123"
        //  tags = "@driver and not @VYT-123"

)
public class CukesRunner {


}