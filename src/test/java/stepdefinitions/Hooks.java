package stepdefinitions;


import utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {  // hata raporu almak icin ekran goruntusu )
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
    //Driver.closeDriver();  kapatmamaizin sebebi stepdefinitiondaki tum
        // testlerin sonunda after method gibi calismasi
    }
}
