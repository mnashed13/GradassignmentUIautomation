@FireFoxBrowserDatagridTest
Feature: QBE user flow DataGrid Test
#Reading the data from the Data Grid
Scenario Outline:
Given that this is a DataGrid Test the console will show this 
Then the user will open the browser again and go the qbe homepage
When I am on the homepage and click on Car and vehicle in the menu bar for the datagrid test
Then when I arrive to the drop down menu where we can click on the CTP Button
Given the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW for the datagrid test
Then the user should click on get a greenslip quote for the datagrid test
Then the user should click on the radio button that says anonymous quote for the date grid test
Then the user should input all the nessary details in the Vechile Screen they include Year as a "<Year>", "<Make>", "<Shape>", "<Usage>", "<PostCode>" and click Continue for the datagrid test
Then the user should input all the nessary details in the details Screen and click Continue in datagrid test
Given the user has done these steps the user should be able to click on finish for the datagrid test

Examples:
|	Year 				| Make 				| Shape 	|	Usage 				|PostCode					|
|	2016				| Ford				|	SED		|	BUSG				| 2007-BROADWAY				|
|	2012				| Holden			|	SED		|	PPG					| 2008-DARLINGTON			|
|	2011				| Mazda				|	WAG		|	PRIV				| 2007-BROADWAY				|
|	2013				| Aec				|	SED		| 	PPG					| 2009-PYRMONT				|	
|	2004				| Nissan			|	WAG		|	PRIV				| 2007-ULTIMO				|
|	2008				| Toyota			|	SED		|	PPG					| 2010-SURRY HILLS			|



