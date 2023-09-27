@ValueLabs
Feature: ValueLabs
  *********************************************
  Description :  Validating the Subscription Packages for all Countries
  *********************************************************************

  @Validating_the_Subscription_Packages
  Scenario: Test Case 1 - Validating the Subscription Packages for SA Country
    Description :  As a i should be able to Validate the Subscription Packages for SA Country

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KSA
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    #Then Verify AddOn Should not be removed after changing payment method  - Found Bug
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    #Found Bug
    And Verify user can be able to proceed to Payment
