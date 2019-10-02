@MainUITests
Feature: QBE user flow


#Reading the data directly from the script
Scenario: 
Given open the google chrome browser and start the application 
When I go to the homepage
When I am on the homepage and click on Car and vehicle in the menu bar 
Then when I arrive to the drop down menu we can click on CTP
Given the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW
Then the user should click on get a greenslip quote
Then the user should click on the radio that says anonymous quote
Then the user should input all the nessary details in the Vechile Screen and click Continue
Then the user should input all the nessary details in the details Screen and click Continue
Given the user has done these steps the user should be able to click on finish

