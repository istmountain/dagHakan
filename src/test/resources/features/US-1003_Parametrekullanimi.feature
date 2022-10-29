Feature: US-1003 kullanici parametre kullanarak configuration.properties dosyalarini kullanabilmeli

   @par
  Scenario: TC-06 kullanici parametre kullanarak amazonda arama yapabilmeli

    Given  kullanici amazon anasayfasinda
    Then  kullanici "nutella" icin arama yapar
    And   sonuclarin "nutella" icerdigini test eder
    And   sayfayi kapatir


