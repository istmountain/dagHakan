
   @back
Feature: US-1002 kullanici ortak adimlari background ile calistirir

       Background: ortak adim
         Given  kullanici amazon anasayfasinda

  Scenario: TC-04 kullanici amazon sayfasinda nutella arar
     Then  kullanici nutella icin arama yapar
     Then  sonuclarin nutella icerdigini test eder
     And   sayfayi kapatir

    Scenario: TC-05 kullanici amazon sayfasinda java arar
      Then  kullanici java icin arama yapar
      Then  sonuclarin java icerdigini test eder
      And   sayfayi kapatir
