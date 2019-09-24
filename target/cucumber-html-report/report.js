$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Features/test.feature");
formatter.feature({
  "name": "QBE user flow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MainUITests"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MainUITests"
    }
  ]
});
formatter.step({
  "name": "open the google chrome browser and start the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_go_to_the_homepage()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d75.0.3770.90)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LTAU00496\u0027, ip: \u0027192.168.1.136\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 75.0.3770.90, chrome: {chromedriverVersion: 75.0.3770.140 (2d9f97485c7b..., userDataDir: C:\\Users\\798014\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:60903}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 2e421043ecbcc75db871c47aa034c230\n*** Element info: {Using\u003dtag name, value\u003dli}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByTagName(RemoteWebDriver.java:400)\r\n\tat org.openqa.selenium.By$ByTagName.findElements(By.java:312)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\r\n\tat co.uipackage.NumberOfLinksTest.MenuLinkCountTest(NumberOfLinksTest.java:22)\r\n\tat stepDefinitions.Steps.I_go_to_the_homepage(Steps.java:84)\r\n\tat ✽.I go to the homepage(file:src/main/java/Features/test.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on the homepage and click on Car and vehicle in the menu bar",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_am_on_the_homepage_and_click_on_Car_and_vehicle_in_the_menu_bar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when I arrive to the drop down menu we can click on CTP",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.when_I_arrive_to_the_dropdown_menu_we_can_click_on_CTP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user has clicked on the NSW the user should click on renew greenslip and the title of this page should be Compulsory Third Party NSW",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.the_user_has_clicked_on_the_NSW_the_user_should_click_on_renew_greenslip_and_the_title_of_this_page_should_be_Compulsory_Third_Party_NSW()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should click on get a greenslip quote",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_user_should_click_on_get_a_greenslip_quote()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should click on the radio that says anonymous quote",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_user_should_click_on_the_radio_that_says_anonymous_quote()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should input all the nessary details in the Vechile Screen and click Continue",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_user_should_input_all_the_nessary_details_in_the_Vechile_Screen_and_click_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should input all the nessary details in the details Screen and click Continue",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_user_should_input_all_the_nessary_details_in_the_details_Screen_and_click_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user has done these steps the user should be able to click on finish",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.the_user_has_done_these_steps_the_user_should_be_able_to_click_on_finish$()"
});
formatter.result({
  "status": "skipped"
});
});