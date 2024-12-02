package com.softwaretestingboard.testbase;

import com.softwaretestingboard.propertyreader.Propertyreader;
import com.softwaretestingboard.utilities.Utility;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = Propertyreader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setup (){
        selectBrowser(browser);
    }


    //    @AfterMethod
//    public void tearDown (){
//        closeBrowser();
//
//    }
}
