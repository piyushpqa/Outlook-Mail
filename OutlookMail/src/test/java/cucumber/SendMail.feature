
@tag
Feature: Compose and send the email through gmail account
  I want to use this template for my feature file
  
  Background:
  Given: I landed on outlook login page

  @tag2
  Scenario Outline: User Login and send email
    Given User Login with username <name> and password <password>
    When User added To <To> with subject <subject> and body <body>
    Then The email should display in the Sent mail field with subject "Incubyte"

    Examples: 
      | name                           |password  |To                            |subject  |body                           |
      | piyushPandey09sept@outlook.com |Banaras@65|piyushPandey09sept@outlook.com|Incubyte |Automation QA test for Incubyte|
      
