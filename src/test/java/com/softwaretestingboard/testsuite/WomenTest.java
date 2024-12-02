package com.softwaretestingboard.testsuite;

import com.softwaretestingboard.pages.Homepage;
import com.softwaretestingboard.pages.Jackets;
import com.softwaretestingboard.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    Homepage homepage = new Homepage();
    Jackets jackets = new Jackets();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        homepage.clickOnCookie();
//* Mouse Hover on the ‘Women’ Menu
        homepage.mouseHoverOnWomenMenu();
//
// Mouse Hover on the ‘Tops’
        homepage.mouseHoverOnTops();
//          // * Click on the ‘Jackets’
        homepage.clickOnJackets();
        // sort jacket names in list
        List<WebElement> jacketsElementsList = getListOfElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Product Name");
        Thread.sleep(1000);
        // After Sorting value
        jacketsElementsList = getListOfElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);
    }

    @Test

    public void verifyTheSortByPriceFilter() {
        homepage.clickOnCookie();
// * Mouse Hover on the ‘Women’ Menu
        homepage.mouseHoverOnWomenMenu();
// * Mouse Hover on the ‘Tops’
        homepage.mouseHoverOnTops();
//* Click on the ‘Jackets’
        homepage.clickOnJackets();
//* Select Sort By filter “Price”
        // Select Sort By filter “Price”
        List<WebElement> jacketsPriceElementList = getListOfElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Price");

        // After Sorting Products by Price
        jacketsPriceElementList = getListOfElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();

        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
//        }
//        // Sort the jacketPriceListBefore to Ascending Order
            Collections.sort(jacketsPriceListBefore);
//        // Verify the products price display in Low to High
            Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
        }
    }
}
