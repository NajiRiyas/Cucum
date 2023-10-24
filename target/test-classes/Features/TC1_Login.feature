
@Login
Feature: verify the OMRBranchAdactinAutomation Adactin Hotel Login details

  Scenario Outline: Verifying Adactin Login Page with Valid Credential
    Given User is on Adactin Page
    When User should Login "<username>","<password>"
    Then User should verify after Login success message "Hello Najimunisab!"

    Examples: 
      | username    | password |
      | najimunisab | Naji@123 |

  Scenario Outline: Verifying Adactin Hotel Login Page with Valid Credential by using enter key
    Given User is on Adactin Page
    When User should Login  "<username>","<password>" with enter key
    Then User should verify after Login success message "Hello Najimunisab!"

    Examples: 
      | username    | password |
      | najimunisab | Naji@123 |

  
  Scenario Outline: Verifying Adactin Hotel Login Page with InValid Credential with error message
    Given User is on Adactin Page
    When User should Login with Invalid Credential "<username>","<password>"
    Then User should verify after Login contains error message "Invalid Login details or Your Password might have expired"

    Examples: 
      | username    | password  |
      | najimunisab | Naji@1234 |
