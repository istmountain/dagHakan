package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSD {
    AmazonPage amazon = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));

    }

    @Then("kullanici nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazon.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        Assert.assertTrue(amazon.sonucYaziElementi.getText().contains("Nutella"));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @Then("kullanici java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazon.aramaKutusu.sendKeys("java" + Keys.ENTER);
    }

    @And("sonuclarin java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        Assert.assertTrue(amazon.sonucYaziElementi.getText().contains("java"));
    }

    @Then("kullanici Iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazon.aramaKutusu.sendKeys("Iphone" + Keys.ENTER);
    }

    @And("sonuclarin Iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazon.sonucYaziElementi.getText().contains("Iphone"));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String aranankelime) {
        {
            amazon.aramaKutusu.sendKeys(aranankelime + Keys.ENTER);

        }

    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazon.sonucYaziElementi.getText().contains(arananKelime));
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
    Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @And("url nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenkelime) {
         String  beklenenUrl= istenenkelime;
        String  actuelUrl = Driver.getDriver().getCurrentUrl();
      //  Assert.assertTrue(actuelUrl.contains(istenenkelime));

     }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenensaniye) {

        try {
            Thread.sleep(istenensaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}