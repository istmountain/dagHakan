Feature:  Facebookta  gecerli email adresi ve gecerli sifre girme

  Scenario Outline: : TC-12 Amazonda Nutella, java, elma, Iphone aratma

    Given kullanici "facebookUrl" anasayfasinda
    When  kullanici 2 saniye bekler
    Then  varsa cerezleri kabul eder
    Then  gecersiz email "<Emailadresi>"  adresi girer
    And   gecersiz "<sifre>" sifre girer
    And   kullanici 5 saniye bekler
    Then  sayfaya giris yapar
    And   sayfaya giris yapilamadigini test eder
    And   kullanici 3 saniye bekler
    And  sayfayi kapatir

  # yukarida Scenario outline altini cizmesinin sebebi methodlarda oldugu gibi bir return tipe anlamina gelir
  # bu durumda bu alti kirmizi cizgiyi yok etmek icin LIST yani examples olusturuyoruz.
  # Examples yazinca kirmizi gitti

    Examples: # ayni sey istendigi icin tekrar ayri bir sutun olusturmaya gerek yok

      |Emailadresi            ||sifre   |
      |hakandag1@hotmail.com  ||1234.a  |
      |hakandag2@hotmail.com  ||14500H5d|
      |hakandag_@hotmail.com  ||1554005d|
