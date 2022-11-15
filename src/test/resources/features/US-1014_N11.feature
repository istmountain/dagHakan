Feature:  US-1014 N11 sitesinde magazalar ve sepet testi

    Background:

  Given kullanici "n11Url" anasayfasinda

  Scenario: TC-19 N11 magazalar listesinin txt dosyasina yazilmasi
    When  kullanici close location' tiklar
    And Kullanici header'daki magazalari gorur ve tiklar
    And kullanici tum magazalar butonuna tiklar
    And a harfindeki magazalari txt dosyasina yazdirir

  Scenario: TC-20 N11 magazalar alisveris sepetine urun eklemek ve degisiklik yapmak

    When  kullanici arama sayfasinda kulaklik kelimesi aratir
    And Kullanici sonuclari yorum sayisina gore siralar
    And kullanici urunlerden ucretsiz kargo olanlarini listeler
    And  kullanici listelenen sonuclardan ilk ve sonuncu urunu sepete ekler
    And kullanici sepete gider
    And kullanici sepetteku ucuz olanlardan birinin sayisini iki yapar
    And kullanici misafir kullanici olarak odeme adimina ilerler
