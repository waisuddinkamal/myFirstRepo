Feature: Test Register Account


  Scenario: Retail website register test
    Given user click on Myaccount
    When user click on Register
    And user enter the First Name 'wias'
    And user enter the Last Name 'kamal'
    And user enter the email 'johnkamal@gmail.com'
    And user enter the telephone '530 320 5014'
    And user enter the Password 'eagles'
    And user enter Password Confirm 'eagles'
    And Subscribe should check no by default
    And user check the Privacy Policy 
    Then user click on Continue button
    Then user should be logged in to Account Has Been Created dashboard