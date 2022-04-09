package com.test.bdd.servicetesting.stepDefinition;

import com.test.bdd.servicetesting.UtilityHelper.LoggerHelper;
import com.test.bdd.servicetesting.UtilityHelper.UIDriverManager;
import io.cucumber.java.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.apache.log4j.Logger;

import java.io.IOException;

public class ServiceHook {
    static Logger log = LoggerHelper.getLogger(ServiceHook.class);
    UIDriverManager uiDriverManager = new UIDriverManager();

    public ServiceHook() throws IOException {
    }


    @Before public void initializeDriver(Scenario scenario) throws IOException, InterruptedException {
        String ScnName= scenario.getName();
        log.info("********************************* NEW TEST SCENARIO NAME: "+ScnName +" ******************************\n");
        String filePath = System.getProperty("user.dir") + "/src/test/Drivers/chromedriver";
        log.info(filePath);
        uiDriverManager.browserToInitialize(filePath);

    }


    @After  public void tearDown(Scenario scenario){
        uiDriverManager.closeBrowser();
        String ScnName= scenario.getName();
        log.info("******************************************** END OF TEST SCENARIO: "+ScnName +" **************************************\n");
    }
}