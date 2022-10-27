Feature: Getting an insurance quote

  @TC1
  Scenario Outline: The user wants to get an online insurance quote
    Given The user wants to go to the home website
    Then The user wants to click on the Insurance modules
    Then The user wants to click on the Get a Quote button
    And The user wants to select the vehicleYear as "<vehicleYear>"
    Then The user wants to select the vehicleMake as "<vehicleMake>"
    Then The user wants to select the vehicleModel as "<vehicleModel>"
    Then The user wants to select the financeDetails as "<financeDetails>"
    Then The user wants to enter "<drivingDistance>" and select the applicable checkbox as I commute to work or school
    Then The user wants to select the coverage "<startingDate>"
    Then The user wants to select bth saving and discount as yes
    Then The user wants to enter the "<driverLicenceNumber>"
    Then The user wants to select No for the other licence option
    And The user wants to click the Submit button
    Then The user wants to verify that the monthly and annual prices are match
    Examples:
      | vehicleYear | vehicleMake | vehicleModel | financeDetails | drivingDistance | startingDate | driverLicenceNumber |
      |1995         |BMW          |M3            |Owned           |143               |10/28/2023    |AANND-KFDHKD-SLDKS   |

