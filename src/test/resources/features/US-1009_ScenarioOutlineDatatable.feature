Feature: US-1009 Datatable sayfasina veriler girebilmeli
  Scenario Outline: TC-13  5  https://editor.datatables.net/  sayfasina5 farkli giris yapalim

    Given kullanici "datatablesUrl" anasayfasinda
    And  kullanici 2 saniye bekler
    When new butonuna basar
    And  kullanici 2 saniye bekler
    Then kullanici firstname "<firstName>" girer
    And  kullanici 1 saniye bekler
    Then kullanici lastname "<lastName>" girer
    And  kullanici 1 saniye bekler
    Then kullanici pozisyon "<position>" girer
    And  kullanici 1 saniye bekler
    Then kullanici ofis adresini "<office>" girer
    And  kullanici 1 saniye bekler
    Then kullanici extension alanina "<extension>" girer
    And  kullanici 1 saniye bekler
    Then kullanici startdate "<startDate>" girer
    And  kullanici 1 saniye bekler
    Then kullanici maas "<salary>" girer
    And  kullanici 1 saniye bekler
    Then Create tusuna basar
    Then kullanici ilk isim  "<firstName>" ile arama yapar
    And  kullanici 1 saniye bekler
    And  isim bolumunde firstname "<firstName>" oldugunu dogrular
    And  sayfayi kapatir



    Examples:
      |firstName|lastName|position|office|extension|startDate|salary|
      |Alim     |Sahin    |qa      |ankara|UI       |2021-10-11|10000|
      |Berk     |Can     |tester  |ankara|api      |2022-05-05|11000|
      |Huseyin  |Kacmaz  |BA      |berlin|-        |2022-07-10|40000|
      |Fatih    |Sahin   |PO      |berlin|-        |2022-03-12|45000|
      |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-06|11000|







