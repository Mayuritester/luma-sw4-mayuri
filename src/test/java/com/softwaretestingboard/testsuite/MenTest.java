package com.softwaretestingboard.testsuite;

import com.softwaretestingboard.pages.Homepage;
import com.softwaretestingboard.pages.Jackets;
import com.softwaretestingboard.pages.Pants;
import com.softwaretestingboard.pages.ShoppingCartPage;
import com.softwaretestingboard.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    Homepage homepage = new Homepage();
    Jackets jackets = new Jackets();
    Pants pants = new Pants();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homepage.clickOnCookie();
//                * Mouse Hover on the ‘Men’Menu
        homepage.mouseHoveOnMen();
//                * Mouse Hover on the ‘Bottoms’
        homepage.mouseHoverOnBottoms();

//            *Click on the ‘Pants’
        homepage.clickOnPants();
//            *Mouse Hover on the product name Cronus Yoga Pant’and click on the size 32
        pants.mouseHoverOnCronusYogaPantsAndSelect34();

//            * Mouse Hover on the product name Cronus Yoga Pant’and click on the Color Black.
        pants.mouseHoverOnCronusYogaPantsAndSelectBlack();

//            *Mouse Hover on the product name Cronus Yoga Pant’and click on the ‘Add To Cart’Button.
        pants.mouseHoverOnCrunusYogaPantsAndClickOnAddToCart();
//            * Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        String actualText = "You added Cronus Yoga Pant to your shopping cart.";
        String expectedText = getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        Assert.assertEquals(actualText, expectedText, "Not added to cart");
//            *Click on the ‘shopping cart’Link into message
        pants.clickOnShoppingCart();
//            * Verify the text ‘Shopping Cart.’
        String actualText1 = "Shopping Cart";
        String expectedText1 = getTextFromElement(By.xpath("//span[@class='base']"));
        Assert.assertEquals(actualText1, expectedText1, "Not added to cart");
//            *Verify the product name ‘Cronus Yoga Pant’
        String actualText2 = "Shopping Cart";
        String expectedText2 = getTextFromElement(By.xpath("//span[@class='base']"));
        Assert.assertEquals(actualText2, expectedText2, "Incorrect Product");
//            *Verify the product size ‘32’
        String actualText3 = "32";
        String expectedText3 = getTextFromElement(By.xpath("//dd[contains(text(),'32')]"));
        Assert.assertEquals(actualText3, expectedText3, "Incorrect Size");
//            *Verify the product color ‘Black’
        String actualText4 = "Black";
        String expectedText4 = getTextFromElement(By.xpath("//dd[contains(text(),'Black')]"));
        Assert.assertEquals(actualText4, expectedText4, "Incorrect Colour");
    }
}
