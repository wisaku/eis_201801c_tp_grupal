Feature: Alimentación de Pacman

  Scenario: Pacman come fruta y engorda
    Given una fruta y un pacman
    When el pacman come una fruta
    Then pacman se vuelve gordo
