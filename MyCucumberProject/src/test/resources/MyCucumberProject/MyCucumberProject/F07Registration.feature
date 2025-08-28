Feature: Registration process

  Background: 
    Given Launch registration page

  Scenario: Test Registration process with valid data
    When I enter following data
      | Vicky   | M     | vicky@gmail.com   | Male   | Chennai  | 9898989898 |
      | Ankita  | Kabra | ankita@gmail.com  | Female | Bhilwara | 8989898989 |
      | Pallavi | Patil | pallavi@gmail.com | Female | Sangli   | 7878787878 |
    Then Registration should successful
