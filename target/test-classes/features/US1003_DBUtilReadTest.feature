Feature: US1003 DBUtil ile istenen degeri test eder


  Scenario: TC03 Kullanici istenen degeri test eder

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    And kullanici DBUtils ile "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici DBUtils ile "Price" sutunundaki verileri okur
    Then  DBUtil ile 2. "Price" in 4000 oldugunu test eder