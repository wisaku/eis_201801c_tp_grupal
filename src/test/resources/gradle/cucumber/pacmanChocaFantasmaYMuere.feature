# new feature
# Tags: optional
    
Feature: Muerte del pacman
    
Scenario: Establecer el momento en que muere el pacman
    Given un pacman y un fantasma
    When el pacman choca con el fantasma
    Then el pacman muere


#Scenario: Establecer el momento en que muere el pacman
#    Given un pacman y un fantasma
#    When el fantasma choca con el pacman
#    Then el pacman muere
