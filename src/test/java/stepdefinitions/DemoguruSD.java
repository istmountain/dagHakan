package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoguruPage;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DemoguruSD {

    DemoguruPage dg=new DemoguruPage();


    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {

        Driver.getDriver().switchTo().frame(dg.iframe);
         if(dg.cerezler.isDisplayed()){
             dg.cerezler.click();

         }

    }

    @And("{string}  sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenensutun) {
        List<WebElement>basliklarListesi=dg.basliklistesi;
        int istenensutunindexi=-1;
        for (int i = 0; i <dg.basliklistesi.size() ; i++) {
            if (dg.basliklistesi.get(i).getText().contains(istenensutun)){

          istenensutunindexi=i+1;
           break;
            }
        }

        if (istenensutunindexi!=-1){
            List<WebElement> istenenSutunListesi=Driver.getDriver().
            findElements(By.xpath("(//tbody[1])[2]/tr/td["+istenensutunindexi+"]"));
            for (WebElement each:istenenSutunListesi

                 ) {
                System.out.println(each.getText());

            }

        }

    }

    }

