package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith; // Junit tercih etmemizin sebebi RunnerWith notasyonudur.


@RunWith(Cucumber.class) // bu notasyon sayesinde TestRunner classi calisma ozelligi kazanir.
@CucumberOptions(


        plugin={"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml" },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags ="@back",
        dryRun =false
        // dryRun true yazarsak sadece eksik adimlati bize bildirir.
        //calistirmadan eksik adimlar varmi bunu kontrol eder sadece calismadan. ve bu cok kisa surer
)


public class TestRunner2 {
}
