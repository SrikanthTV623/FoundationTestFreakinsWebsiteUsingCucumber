Feature: Shopping for jeans on the website

  Scenario: Verify user can add and remove item from cart
    Given user opens website
    Then verify user is on home page
    When user clicks on the do later button
    And user clicks on search button
    And searches for "search.value"
    And user select on first shirt item
    Then verify user is on shirt description page
    When user clicks on the do later button
    And user click on add to cart button
    Then verify item is added into cart
    When user clicks cart button which is displayed in home page
    When user remove the product in cart page
    Then verify cart is empty


  Scenario: Verify user is on Home page and take screenshot
    Given user opens website
    Then verify user is on home page
    Given user opens website
    Then verify user is on home page
    When user clicks on the do later button
    And user clicks on search button
    And searches for "search.value"
    And user select on first shirt item
    When user clicks on the do later button
    And user click on add to cart button
    Then verify item is added into carts


