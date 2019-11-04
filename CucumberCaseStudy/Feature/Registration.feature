Feature: CaseStudy1:Registration
  I want to register on TestMe App by passing data from feature file

  Scenario: Register to TestMe App
    Given I Launched The TestMe App Website and clicked on SignUp Button
    When I entered Username as "Mark97" FirstName as "Mark" LastName as "Duarte" 
    And I entered password as "pass1234" and ConfirmPassword as "pass1234" 
    And I selected Gender as Male Email as "abcdefg@gmail.com" Mobile Number as "1234567890" DOB as "17/07/1997"
    And I entered my Address as "KnowWhere" 
    And I selected Security Question and entered "black" as answer
    Then I clicked the Register Button