Feature: Account Password Reset

@regression
  Scenario: Successful Account Password Reset
    Given the user navigates to Login page
    When the user enters the details into below fields
      | userName | John       |
    And the user clicks Reset Password
    Then Check the confirmation page