@login
Feature: Users should be able to login


  @driver  @VYT-123
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login


   @smoke  @VYT-123
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login

    @store_manager
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login

   @smoke
  Scenario: Login as a BA
    Given the user is on the login page
    When the user enters the BA information
    Then the user should be able to login

  Scenario: Login as a PO
    Given the user is on the login page
    When the user enters the PO information
    Then the user should be able to login