package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

 @RunWith(Cucumber.class)    //features java da degil       stepdefinition javada
 @CucumberOptions( features="src/test/resources/features",glue="stepdefinitions",tags="@par",dryRun=false)


public class Runner {


}
