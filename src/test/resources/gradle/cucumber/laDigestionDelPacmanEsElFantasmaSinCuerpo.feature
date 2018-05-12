# new feature
# Tags: optional
    
Feature: fantasma choca contra un pacman debilitado y no muere.
    
Scenario: Pacman choca contra un fantasma debilitado y no muere.
Adicionalmente la digestión es el fantasma sin cuerpo.
    Given un fantasma debilitado y un pacman
    When el fantasma choca con el pacman
    Then la digestion es el fantasma sin cuerpo


#Scenario: Pacman choca contra un fantasma debilitado y no muere.
#Adicionalmente la digestión es el fantasma sin cuerpo.
#    Given un pacman y un fantasma debilitado
#    When el pacman choca con el fantasma
#    Then la digestion es el fantasma sin cuerpo