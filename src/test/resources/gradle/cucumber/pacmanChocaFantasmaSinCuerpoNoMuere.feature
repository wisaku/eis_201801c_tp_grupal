# new feature
# Tags: optional

Feature: Pacman No Muere por fantasma sin cuerpo

  Scenario: Establecer el momento en que el pacman choca con un fantasma y no muere
    Given un pacman y fantasma sin cuerpo
    When un pacman choca con fantasma sin cuerpo
    Then el pacman no muere


  Scenario: Establecer el momento en que el pacman choca con un fantasma y no muere
    Given un pacman y fantasma sin cuerpo
    When fantasma sin cuerpo choca con un pacman
    Then el pacman no muere