Feature: Toplam Fiyat
  Bu test ürunleri satin alip toplam fiyati bulmayi test eder.
  Scenario: Urun satin alimi
    Given Kullanici giris sayfasinda
    When Kullanici adini girer
    And Kullanici sifre girer
    And Kullanici logine tiklar
    And Kullanici alti urunu secip sepete ekler
    And Kullanici sepete gider
    And Kullanici kotrol edip check out butonuna tiklar
    And Kullanici ad soyad posta kodu girer
    And Kullanici contiue buttonuna tiklar
    Then Kullanici toplam fiyatlarin oldugu sayfaya gelir.