Feature: Merchant Page
  This page conatins the Profile,Status of Inventory,SEarch Links

  Scenario: Profile Page of Merchant
    Given I want to get Merchant detail
    When I press on Profile link
    Then Display 'merchantProfile' page

  Scenario: InventorySatus
    Given I want to get the status of Inventory
    When I press on Status OF Inventory link
    Then Display 'inventory' page
