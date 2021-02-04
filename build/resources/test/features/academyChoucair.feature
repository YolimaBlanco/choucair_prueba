
  @stories
  Feature: Academy Choucair
    As a user, I want to learn automation at the academy Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
    | strUser   | strPassword  |
    | 1063165037| Choucair2021*|
    When he search for the course on the choucair academy platform
    | strCertificaciones |
    | Workshop de Automatización |
    Then he finds the course called
    | strCertificaciones |
    | Workshop de Automatización |