@DataTable
Feature: To check more data using scenario outline
Scenario Outline: Login page of OrangeHrm
Given user has to enter the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then user has to enter their credintials "<username>" and "<password>"

Examples:
|username|password|
|Admin|admin123|
|admin|admin123|
|Admin|Admin123|