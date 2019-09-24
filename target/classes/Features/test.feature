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

# First method of of putting all Scenarios in one feature file 
##Reading the data from the Data Grid
#
#Scenario Outline:
#Given that this is a DataGrid Test the console will show this 
#Then the user will open the browser again and go the qbe homepage
#When I am on the homepage and click on Car and vehicle in the menu bar 
#Then when I arrive to the drop down menu where we can click on the CTP Button
#Given the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW for the datagrid test
#Then the user should click on get a greenslip quote for the datagrid test
#Then the user should click on the radio button that says anonymous quote for the date grid test
#Then the user should input all the nessary details in the Vechile Screen they include Year as a "<Year>", "<Make>", "<Shape>", "<Usage>", "<PostCode>" and click Continue for the datagrid test
#Then the user should input all the nessary details in the details Screen and click Continue in datagrid test
#Given the user has done these steps the user should be able to click on finish for the datagrid test
#Examples:
#|	Year 				| Make 				| Shape 	|	Usage 				|PostCode					|
#|	2016				| Ford				|	SED		|	BUSG				| 2007-BROADWAY				|
#|	2012				| Ford				|	SED		|	PPG					| 2008-DARLINGTON			|
#|	2011				| Ford				|	SED		|	PRIV				| 2007-BROADWAY				|
#|	2013				| Ford				|	SED		|	BUSG				| 2007-BROADWAY				|	
##Reading the Data From the Excel Sheet Test
#
#
#Scenario:
#Given that this is a Excel Test the console will show this 
#Then the user will open the browser again and go the qbe homepage for the Excel test
#When I am on the homepage and click on Car and vehicle in the menu bar for the Excel test
#Then when I arrive to the drop down menu where we can click on the CTP Button for the excel test
#Given the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW for the excel test
#Then the user should input all the nessary details in the Vechile Screen they include the excel as a "C:\Users\798014\eclipse-workspace\GradAssignmentSelenium\src\main\java\co\ExcelDataPackage\SeleniumQBEValues.xlsx" and click Continue for the excel test
#

