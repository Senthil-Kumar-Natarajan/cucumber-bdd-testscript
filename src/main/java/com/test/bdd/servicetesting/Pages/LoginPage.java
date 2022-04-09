package com.test.bdd.servicetesting.Pages;

import com.test.bdd.servicetesting.UtilityHelper.AppWaiter;
import com.test.bdd.servicetesting.UtilityHelper.LoggerHelper;
import com.test.bdd.servicetesting.UtilityHelper.UIDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    Logger log = LoggerHelper.getLogger(LoginPage.class);
    private static WebDriver webDriver;
    AppWaiter appWaiter;

    public LoginPage() {
        webDriver = UIDriverManager.webDriver;
        appWaiter = new AppWaiter(webDriver);
    }

    //***************************Login Page Methods***************************//

    public void openApplication()  {

        webDriver.get("https://testscriptdemo.com/");
        log.info("Entered the URL successfully");
    }

}
