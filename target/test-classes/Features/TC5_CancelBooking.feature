@CancelBooking
Feature: verify the OMRBranchAdactinAutomation Loginpage to Search hotel page , Select hotel, Book Hotel and Cancel Booking details


  Scenario Outline: Verifying Adactin Hotel Cancel Booking page
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    When User should Search hotel "<Location>","<Hotels>","<Room_Type>","<Room_nos>","<Check_In_Date>","<Check_Out_Date>","<Adults_per_Room>" and "<Children_per_Room>"
    Then User should verify after search "Select hotel"
    And User should click any one hotel
    Then User should verify after Select Hotel "Book A Hotel"
    And User should Book by Select all fields "<First_Name>","<Last_Name>" and "<Billing_Address>"
      | Credit_Card_No   | Credit_Card_Type | Expiry_Month | Expiry_Year | CVV_Number |
      | 4512369874563219 | VISA             | December     |        2022 |        123 |
      | 4512349874561213 | American Express | October      |        2022 |        459 |
      | 4512369815963215 | Master Card      | November     |        2022 |        963 |
      | 4512369874563217 | Other            | September    |        2022 |        258 |
    Then User should verify after Book Hotel "Booking Confirmation"
    And User should Navigate to Booked Itinerary and Cancel Order Id
    Then User should verify after Cancel Order Id "The booking has been cancelled"

    Examples: 
      | username    | password | Location | Hotels       | Room_Type | Room_nos  | Check_In_Date | Check_Out_Date | Adults_per_Room | Children_per_Room | First_Name | Last_Name | Billing_Address |
      | najimunisab | Naji@123 | London   | Hotel Hervey | Standard  | 3 - Three | 12/08/2022    | 13/08/2022     | 2 - Two         | 2 - Two           | Najimunisa | Begum     | Chennai         |


  Scenario Outline: Verifying Adactin Hotel Cancel Booking by existing order id
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"
    And User should Navigate to Booked Itinerary and Cancel existing order id "<Order_id>"
    Then User should verify after Cancel existing Order Id message in Booked Itinerary page as "The booking has been cancelled"

    Examples: 
      | username    | password | Order_id   |
      | najimunisab | Naji@123 | 0LV2AOV493 |
