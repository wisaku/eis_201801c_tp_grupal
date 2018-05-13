# new feature
# Tags: optional

Feature: Pacman come una fruta especifica y vuela

  Scenario: Pacman come una fruta especifica y vuela
    Given un Pacman, una fruta especial y un fantasma
    When El pacman come la fruta
    Then  pasa por un fantasma y no muere