# new feature
# Tags: optional
    
Feature: Muerte del pacman
    
Scenario: Establecer el momento en que muere el pacman
    Given un pacman y un fantasma
    When un pacman choca con un fantasma
    Then el pacman muere


Scenario: Establecer el momento en que muere el pacman
    Given un pacman y un fantasma
    When un fantasma choca con un pacman
    Then el pacman muere
