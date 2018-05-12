# new feature
# Tags: optional

Feature: Debilitar fantasmas

  Scenario: Pacman come un pellet y los fantasmas se debilitan
    Given un pellet un pacman y fantasmas
    When  pacman come un pellet
    Then  los fantasmas se debilitan