# Cucumber BDD Sample project

Cucumber BDD Demoproject 

This is a test project to showcase automation of  web app - testscriptdemo site 

Path location of the feature file : <root_directory of the project>/cucumber-bdd-testscript/src/test/java/resources/Testing.feature

Feature: Web automation of the testscript website 

    Scenario: Adding the items to the cart
    
    Given I add four different products to my wish list
    When I view my wishlist table
    Then I  find total "4" selected items in my wishlist
    When I search for the lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart


Running test locally :
    
    1.  Clone the Repo 
    2.  Pre Requisties :

    Please update your local driver path in the file <root_directory of the project>/cucumber-test-bdd/src/main/java/com/test/bdd/servicetesting/UtilityHelper/UIDriverManager.java
    
    System.setProperty("webdriver.chrome.driver", "//usr/local//bin//chromedriver"

    3.Go to your project directory from terminal and hit any of the following commands

        mvn clean install 

        mvn clean verify

        mvn test
    
    4. Validate the logs in TestRunLog.out

      **Sample TestLog Output :** 

            2022-04-09 20:04:656 INFO  ServiceHook:22 - ********************************* NEW TEST SCENARIO NAME: select lowest price item in cart ******************************
            
            2022-04-09 20:04:660 INFO  ServiceHook:24 - /Users/senthilkumar.n/Documents/workspace/cucumber-bdd-testscript/src/test/Drivers/chromedriver
            2022-04-09 20:04:157 INFO  LoginPage:25 - Entered the URL successfully
            2022-04-09 20:04:317 INFO  StepDef:39 - Able to Add 4 products to WishList
            2022-04-09 20:04:853 INFO  WishListPage:67 - Product Item Detail:{}Top pants upper
            2022-04-09 20:04:907 INFO  WishListPage:67 - Product Item Detail:{}£22.00 – £89.00
            2022-04-09 20:04:05 INFO  WishListPage:67 - Product Item Detail:{}Single Shirt
            2022-04-09 20:04:47 INFO  WishListPage:67 - Product Item Detail:{}£30.00 £20.00
            2022-04-09 20:04:159 INFO  WishListPage:67 - Product Item Detail:{}Polo T-shirt
            2022-04-09 20:04:203 INFO  WishListPage:67 - Product Item Detail:{}£22.00 – £25.00
            2022-04-09 20:04:291 INFO  WishListPage:67 - Product Item Detail:{}Black pants
            2022-04-09 20:04:337 INFO  WishListPage:67 - Product Item Detail:{}£89.00 – £99.00
            2022-04-09 20:04:338 INFO  StepDef:45 - Able to View My Wishlist
            2022-04-09 20:04:343 INFO  WishListPage:78 - ======================================
            2022-04-09 20:04:343 INFO  WishListPage:79 - 4 Items are there in WishList
            2022-04-09 20:04:351 INFO  WishListPage:81 - ======================================
            2022-04-09 20:04:365 INFO  WishListPage:87 - Able to get Lowest Item Price:{}20.0
            2022-04-09 20:04:533 INFO  StepDef:61 - Able to Add lowest price item into My Cart
            2022-04-09 20:04:173 INFO  StepDef:67 - Able to Add Item gest added in Cart & Total Details get displayed
            2022-04-09 20:04:363 INFO  ServiceHook:33 - ******************************************** END OF TEST SCENARIO: select lowest price item in cart **************************************
            
