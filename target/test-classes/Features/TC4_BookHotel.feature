@BookHotel
Feature: verify the OMRBranchAdactinAutomation Loginpage to Search hotel page , Select hotel and Book hotel details

  Scenario Outline: Verifying Adactin Login page and verify Booking Confirmation
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel "<Location>","<Hotels>","<Room_Type>","<Room_nos>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>" and "<Children_per_Room>"
    Then User should verify after search "Select Hotel"
    And User should click any one hotel
    Then User should verify after Select Hotel "Book A Hotel"
    And User should Book by Select all fields "<First_Name>","<Last_Name>" and "<Billing_Address>"
      | Credit_Card_No   | Credit_Card_Type | Expiry_Month | Expiry_Year | CVV_Number |
      | 4512369874563219 | VISA             | December     |        2022 |        123 |
      | 4512349874561213 | American Express | October      |        2022 |        459 |
      | 4512369815963215 | Master Card      | November     |        2022 |        963 |
      | 4512369874563217 | Other            | September    |        2022 |        258 |
    Then User should verify after Book Hotel "Booking Confirmation"

    Examples: 
      | username    | password | Location | Hotels       | Room_Type | Room_nos  | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room | First_Name | Last_Name | Billing_Address |
      | najimunisab | Naji@123 | London   | Hotel Hervey | Standard  | 3 - Three | 12/08/2022    | 13/08/2022     | 2 - Two         | 2 - Two           | Najimunisa | Begum     | Chennai         |

  Scenario Outline: Verifying Adactin Login page and verify 7 error messages by without entering any fields
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel "<Location>","<Hotels>","<Room_Type>","<Room_nos>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>" and "<Children_per_Room>"
    Then User should verify after search "Select Hotel"
    And User should click any one hotel
    Then User should verify after Select Hotel "Book A Hotel"
    And User should Book without entering any fields "<First_Name>","<Last_Name>" and "<Billing_Address>"
    Then User should verify after Book Hotel exact Seven error messages "<Please Enter your First Name>", "<Please Enter you Last Name>", "<Please Enter your Address>", "<Please Enter your 16 Digit Credit Card Number>", "<Please Select your Credit Card Type>", "<Please Select your Credit Card Expiry Month>" and "<Please Enter your Credit Card CVV Number>"

    Examples: 
      | username    | password | Location | Hotels       | Room_Type | Room_nos  | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room |
      | najimunisab | Naji@123 | London   | Hotel Hervey | Standard  | 3 - Three | 12/08/2022    | 13/08/2022     | 2 - Two         | 2 - Two           |
