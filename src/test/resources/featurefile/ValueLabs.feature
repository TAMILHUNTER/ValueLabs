@ValueLabs_E2E
Feature: ValueLabs
  *********************************************
  Description :  Validating the Subscription Packages for all Countries
  *********************************************************************

  @Validating_the_Subscription_Packages
  Scenario: Test Case 1 - Validating the Subscription Packages (SYSTEM WILL GET RANDOM INPUTS)
    Description :  As a i should be able to Validate the Subscription Packages (SYSTEM WILL GET RANDOM INPUTS)

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country
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

    
    @Validating_the_Subscription_Packages_Bh_Lite_STC
  Scenario: Test Case 2 - Validating the Subscription Packages for BH Country For Lite Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for BH Country For Lite Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Lite Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    
      @Validating_the_Subscription_Packages_Bh_Lite_VISA
  Scenario: Test Case 3 - Validating the Subscription Packages for BH Country For Lite Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for BH Country For Lite Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Lite Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    
     @Validating_the_Subscription_Packages_Bh_Classic_STC
  Scenario: Test Case 4 - Validating the Subscription Packages for BH Country For Classic Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for BH Country For Classic Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Classic Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
     @Validating_the_Subscription_Packages_Bh_Classic_VISA
  Scenario: Test Case 5 - Validating the Subscription Packages for BH Country For Classic Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for BH Country For Classic Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Classic Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    @Validating_the_Subscription_Packages_Bh_Premium_STC
  Scenario: Test Case 6 - Validating the Subscription Packages for BH Country For Premium Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for BH Country For Premium Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Premium Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
     @Validating_the_Subscription_Packages_Bh_Premium_VISA
  Scenario: Test Case 7 - Validating the Subscription Packages for BH Country For Premium Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for BH Country For Premium Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Premium Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    
 #KW
 
     @Validating_the_Subscription_Packages_KW_Lite_STC
  Scenario: Test Case 8 - Validating the Subscription Packages for KW Country For Lite Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KW Country For Lite Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KW
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Lite Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    
      @Validating_the_Subscription_Packages_KW_Lite_VISA
  Scenario: Test Case 9 - Validating the Subscription Packages for KW Country For Lite Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KW Country For Lite Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KW
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Lite Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    
     @Validating_the_Subscription_Packages_KW_Classic_STC
  Scenario: Test Case 10 - Validating the Subscription Packages for KW Country For Classic Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KW Country For Classic Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KW
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Classic Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
     @Validating_the_Subscription_Packages_KW_Classic_VISA
  Scenario: Test Case 11 - Validating the Subscription Packages for KW Country For Classic Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KW Country For Classic Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KW
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Classic Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    @Validating_the_Subscription_Packages_KW_Premium_STC
  Scenario: Test Case 12 - Validating the Subscription Packages for KW Country For Premium Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KW Country For Premium Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KW
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Premium Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
     @Validating_the_Subscription_Packages_KW_Premium_VISA
  Scenario: Test Case 13 - Validating the Subscription Packages for KW Country For Premium Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KW Country For Premium Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KW
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Premium Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    
 #KSA
 
 
     @Validating_the_Subscription_Packages_KSA_Lite_STC
  Scenario: Test Case 14 - Validating the Subscription Packages for KSA Country For Lite Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KSA Country For Lite Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KSA
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Lite Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    
      @Validating_the_Subscription_Packages_KSA_Lite_VISA
  Scenario: Test Case 15 - Validating the Subscription Packages for KSA Country For Lite Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KSA Country For Lite Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KSA
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Lite Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    
     @Validating_the_Subscription_Packages_KSA_Classic_STC
  Scenario: Test Case 16 - Validating the Subscription Packages for KSA Country For Classic Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KSA Country For Classic Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KSA
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Classic Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
     @Validating_the_Subscription_Packages_KSA_Classic_VISA
  Scenario: Test Case 17 - Validating the Subscription Packages for KSA Country For Classic Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KSA Country For Classic Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KSA
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Classic Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
    @Validating_the_Subscription_Packages_KSA_Premium_STC
  Scenario: Test Case 18 - Validating the Subscription Packages for KSA Country For Premium Plan With STC Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KSA Country For Premium Plan With STC Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KSA
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Premium Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method STC
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
    
     @Validating_the_Subscription_Packages_KSA_Premium_VISA
  Scenario: Test Case 19 - Validating the Subscription Packages for KSA Country For Premium Plan With VISA Payment Method
    Description :  As a i should be able to Validate the Subscription Packages for KSA Country For Premium Plan With VISA Payment Method

    Given Verify User can be able to navigate to the Environment
    And Verify User can be able to Change Language
    Then Verify User can be able to select Country KSA
    Then Verify User can be able to Verify Package Details Lite Plan
    Then Verify User can be able to Verify Package Details Classic Plan
    Then Verify User can be able to Verify Package Details Premium Plan
    Then Verify User can be able to Verify Addon Package Details for Lite Plan
    Then Verify User can be able to Verify Addon Package Details for Classic Plan
    Then Verify User can be able to Verify Addon Package Details for Premium Plan
    Then Verify User can be able to select Premium Subscription package
    Then Verify system displayes Subscription package price details correctly
    Then Verify user can be able to choose Payment Method VISA
    Then Verify system displayes Order Summery correctly
    Then Verify User can be able to view AddOn Package details
    Then Verify User can be able to add AddOn Packages
    Then Verify system displayes Order Summery correctly after adding AddOn packages
    Then Verify User can be able to change Payment Method
    Then Verify system displayes Subscription package price details correctly after changing payment method
    Then Verify User can be able to change Subscription plan
    Then Verify system displayes Subscription package price details correctly after changing plan
    Then Verify User can be able to add Addon packages on summary page
    Then Verify system displayes Subscription package price details correctly after changing AddOn plan
    Then Verify System gets user details for payment based on the payment method selected
    And Verify user can be able to proceed to Payment
       
    