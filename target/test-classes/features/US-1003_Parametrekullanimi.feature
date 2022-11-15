@back
Feature: US-1003 kullanici parametre kullanarak configuration.properties dosyalarini kullanabilmeli
  Scenario: TC-06 kullanici parametre kullanarak amazonda arama yapabilmeli

    Given  kullanici "amazonUrl" anasayfasinda
    Then  kullanici "nutella" icin arama yapar
    And   sonuclarin "Mutella" icerdigini test eder
    And  kullanici 7 saniye bekler
    And   sayfayi kapatir


