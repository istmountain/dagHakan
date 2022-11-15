package stepdefinitions;

import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.N11Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Set;

public class N_11_SD {

    N11Page n11 = new N11Page();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @When("kullanici close location' tiklar")
    public void kullanici_close_location_tiklar() throws InterruptedException {
        n11.cerezler.click();
        Driver.getDriver().switchTo().frame(n11.iframe);
        Thread.sleep(3000);
        n11.uyariIptal.click();
        Driver.getDriver().switchTo().parentFrame();
        Thread.sleep(3000);




    }

    @When("Kullanici header'daki magazalari gorur ve tiklar")
    public void kullanici_header_daki_magazalari_gorur_ve_tiklar() throws InterruptedException {

        js.executeScript("arguments[0].scrollIntoView(true)", n11.siteharitasi);
        Thread.sleep(3000);
        n11.siteharitasi.click();
        Thread.sleep(3000);
        //js.executeScript("arguments[0].click", n11.siteharitasi);
        js.executeScript("arguments[0].scrollIntoView(true)", n11.Magazalar);
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
    }

    @When("kullanici tum magazalar butonuna tiklar")
    public void kullanici_tum_magazalar_butonuna_tiklar() throws InterruptedException {

        n11.Magazalar.click();
        js.executeScript("arguments[0].scrollIntoView(true)", n11.A_harfi);
        actions.click(n11.A_harfi).perform();
        Thread.sleep(3000);

    }

    @When("a harfindeki magazalari txt dosyasina yazdirir")
    public void a_harfindeki_magazalari_txt_dosyasina_yazdirir() throws IOException {
        n11.A_Ile_Baslayan_Magazalar.forEach(t -> System.out.println(t.getText()));

        String A_ile_baslayan_magazalarin_listesi = n11.A_Ile_Baslayan_Magazalar.toString();
        String dosyaYolu = "src/test/resources/SeleniumNotlarim/A_harfi_ile_baslayan_magazalar.rtf";
        File file = new File(dosyaYolu);
        FileUtils.writeStringToFile(file, A_ile_baslayan_magazalarin_listesi, Charset.defaultCharset());
    }


        @When("kullanici arama sayfasinda kulaklik kelimesi aratir")
        public void kullanici_arama_sayfasinda_kulaklik_kelimesi_aratir() throws InterruptedException {
            n11.cerezler.click();
            Driver.getDriver().switchTo().frame(n11.iframe);
            Thread.sleep(3000);
            n11.uyariIptal.click();
            Driver.getDriver().switchTo().parentFrame();
            Thread.sleep(5000);
            actions.click(n11.arama_motoru).sendKeys("kulaklik").sendKeys(Keys.ENTER).perform();


        }

        @When("Kullanici sonuclari yorum sayisina gore siralar")
        public void kullanici_sonuclari_yorum_sayisina_gore_siralar() throws InterruptedException {
            n11.akilliSiralama.click();
            n11.yorumsayisi.click();
            Thread.sleep(5000);
            actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN) .sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN)
            .perform(); Thread.sleep(5000);


        }

        @When("kullanici urunlerden ucretsiz kargo olanlarini listeler")
        public void kullanici_urunlerden_ucretsiz_kargo_olanlarini_listeler() throws InterruptedException {
            actions.click(n11.ucretsizKargo).perform();
            Thread.sleep(5000);
        }

        @When("kullanici listelenen sonuclardan ilk ve sonuncu urunu sepete ekler")
        public void kullanici_listelenen_sonuclardan_ilk_ve_sonuncu_urunu_sepete_ekler() throws InterruptedException {


        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        n11.birinci_urun.click();
        n11.ikinci_urun.click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(n11.sepetegit));
         n11.sepetegit.click();
        //actions.click(n11.sepetegit);
        Thread.sleep(3000);
         Set<String> handels=Driver.getDriver().getWindowHandles();
            System.out.println(handels);
    }

        @When("kullanici sepete gider")
        public void kullanici_sepete_gider() {


        }

        @When("kullanici sepetteku ucuz olanlardan birinin sayisini iki yapar")
        public void kullanici_sepetteku_ucuz_olanlardan_birinin_sayisini_iki_yapar() {


        }

        @When("kullanici misafir kullanici olarak odeme adimina ilerler")
        public void kullanici_misafir_kullanici_olarak_odeme_adimina_ilerler() {


        }


    }


