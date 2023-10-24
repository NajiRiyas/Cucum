@SelectHotel
Feature: verify the OMRBranchAdactinAutomation Login page to Search hotel page and Select hotel details

  Scenario Outline: Verifying Adactin Login page by select hotel and verify Book A Hotel
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel "<Location>","<Hotels>","<Room_Type>","<Room_nos>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>" and "<Children_per_Room>"
    Then User should verify after search "Select Hotel"
    And User should click any one hotel
    Then User should verify after Select Hotel "Book A Hotel"

    Examples: 
      | username    | password | Location | Hotels       | Room_Type | Room_nos  | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | najimunisab | Naji@123 | London   | Hotel Hervey | Standard  | 3 - Three | 12/08/2022    | 13/08/2022     | 2 - Two         | 2 - Two           |

  Scenario Outline: Verifying Adactin Login page by without select hotel and verify error message
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel "<Location>","<Hotels>","<Room_Type>","<Room_nos>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>" and "<Children_per_Room>"
    Then User should verify after search "Select Hotel"
    And User should click continue without select any hotels
    Then User should verify exact error message after click continue as "Please Select a Hotel"

    Examples: 
      | username    | password | Location | Hotels       | Room_Type | Room_nos  | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | najimunisab | Naji@123 | London   | Hotel Hervey | Standard  | 3 - Three | 12/08/2022    | 13/08/2022     | 2 - Two         | 2 - Two           |
