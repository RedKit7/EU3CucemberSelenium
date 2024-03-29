package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.*;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports"
        },
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@wip",
          strict = true
      //  tags = "@driver or @VYT-123"
        //  tags = "@driver and not @VYT-123"

)
public class CukesRunner {


}
