Feature:  Amazonda istenilen kelimeleri aratabilme

Scenario Outline: : TC-12 Amazonda Nutella, java, elma, Iphone aratma

    Given kullanici "amazonUrl" anasayfasinda
    When  kullanici "<istenenKelime>" icin arama yapar
    Then sonuclarin "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir

  # yukarida Scenario outline altini cizmesinin sebebi methodlarda oldugu gibi bir return tipe anlamina gelir
  # bu durumda bu alti kirmizi cizgiyi yok etmek icin LIST yani examples olusturuyoruz.
  # Examples yazinca kirmizi gitti

  Examples: # ayni sey istendigi icin tekrar ayri bir sutun olusturmaya gerek yok
  |istenenKelime|
  |Nutella      |
  |java         |
  |Iphone       |
  |Elma         |
  |Armut        |