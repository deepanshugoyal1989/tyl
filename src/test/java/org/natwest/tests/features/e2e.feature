Feature: Complete Application Workflow

  @sanity
  Scenario Outline: User should be able to successfully complete its purchase order.
    Given user enters valid username "<username>" and password "<password>" on loginPage
    When user select the costliest and cheapest products
    And user provide with valid firstname "<firstname>" lastname "<lastname>" and zipcode "<zipcode>"
    Then user should be able to successfully place the purchase order with message "<message>"

    Examples:
      | username      | password     | firstname | lastname | zipcode | message                  |
      | standard_user | secret_sauce | su        | ss       | co3     | THANK YOU FOR YOUR ORDER |