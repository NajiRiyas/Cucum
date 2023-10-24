@SearchHotel
Feature: verify the OMRBranchAdactinAutomation Loginpage to Search hotel page details

  Scenario Outline: Verifying Adactin Login page by selecting all fields
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel "<Location>","<Hotels>","<Room_Type>","<Room_nos>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>" and "<Children_per_Room>"
    Then User should verify after search "Select Hotel "

    Examples: 
      | username    | password | Location | Hotels       | Room_Type | Room_nos  | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | najimunisab | Naji@123 | London   | Hotel Hervey | Standard  | 3 - Three | 21/08/2022    | 23/08/2022     | 2 - Two         | 2 - Two           |

  Scenario Outline: Verifying Adactin Login page by entering only mandatory fields
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel only mandatory fields "<Location>","<Room_nos>","<Check_In_Date>","<Check_Out_Date>" and "<Adults_per_Room>"
    Then User should verify after search "Select Hotel "

    Examples: 
      | username    | password | Location | Room_nos  | Check_In_Date | Check_Out_Date | Adults_per_Room |
      | najimunisab | Naji@123 | London   | 3 - Three | 21/08/2022    | 23/08/2022     | 2 - Two         |

  Scenario Outline: Verifying Adactin Login page by selecting invalide date
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel by selecting invalid date "<Location>","<Hotels>","<Room_Type>","<Room_nos>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>" and "<Children_per_Room>"
    Then User should verify after search exact two error message in Date Checking "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username    | password | Location | Hotels       | Room_Type | Room_nos  | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | najimunisab | Naji@123 | London   | Hotel Hervey | Standard  | 3 - Three | 23/08/2022    | 21/08/2022     | 2 - Two         | 2 - Two           |

  Scenario Outline: Verifying Adactin Login page by without entering any fields
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel without selecting any fields
    Then User should verify after search exact error message "Please Select a Location"

    Examples: 
      | username    | password |
      | najimunisab | Naji@123 |
