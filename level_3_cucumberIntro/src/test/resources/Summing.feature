Feature: Summing
  Background: Turn on calculator
    Given calculator is on


  Scenario: Summing small numbers
    When I add 2 and 4
    Then the result is 6


  Scenario Outline: Summing numbers <number1> and <number2>
    When I add <number1> and <number2>
    Then the result is <result>
    Examples:
    |number1|number2|result|
    |0      |0      |0     |
    |-7     |4      |-3    |
    |1      |2137   |2138  |