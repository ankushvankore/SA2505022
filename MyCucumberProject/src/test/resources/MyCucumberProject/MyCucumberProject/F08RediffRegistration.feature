Feature: Rediff Registration

  Scenario Outline: Validate Registration process on Rediff mail
    Given Launch Rediff registration page
    When I Enter fullName as "<FullName>"
    When I Enter rediff id "<RediffId>"
    When I Enter password and confirm password as "<Password>"
    When I Select gender as "<Gender>"
    And I click on Check availablity
    Then Rediff id available message should display

    Examples: 
      | FullName       | RediffId       | Password     | Gender |
      | Ankita Kabra   | ankitakabra123 | Ankita@123   | Female |
      | Jayanta Debroy | jayant         | Jayant@123   | Male   |
      | Vrushika Hingu | vrushikahingu  | Vrushika@123 | Female |
