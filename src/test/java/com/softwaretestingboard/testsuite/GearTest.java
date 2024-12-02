package com.softwaretestingboard.testsuite;

import com.softwaretestingboard.pages.Homepage;
import com.softwaretestingboard.pages.OvernightDufflePage;
import com.softwaretestingboard.pages.ShoppingCartPage;
import com.softwaretestingboard.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
  Homepage homepage = new Homepage();
  OvernightDufflePage overnightDufflePage = new OvernightDufflePage();
  ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
  @Test
  public void userShouldAddProductSuccessFullyToShoppingCart () {
       homepage.clickOnCookie();
//             * Mouse Hover on the ‘Gear’ Menu
      homepage.mouseHoverToGearMenu();
//            * Click on the ‘Bags’
      homepage.clickOnBags();

//            * Click on Product Name ‘Overnight Duffle’
      homepage.clickOnOvernighDuffle();

//            * Verify the text ‘Overnight Duffle’
      String actualText = "OverNightDuffle";
      String expectedText = getTextFromElement(By.xpath("//span[@class='base']"));
      Assert.assertEquals(actualText, expectedText, "Incorrect Bag");
//            * Change the Qty 3
      overnightDufflePage.changeQtyTo3();
//            * Click on the ‘Add to Cart’ Button.
      overnightDufflePage.addToCart();
//* Verify the text‘You added Overnight Duffle to your shopping cart.’
      String actualText1 = "You added Overnight Duffle to your shopping cart.";
      String expectedText1 = getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
      Assert.assertEquals(actualText, expectedText, "Bag not added");
//  * Click on the ‘shopping cart’ Link into message
      overnightDufflePage.clickOnShoppingCart();
//  * Verify the product name ‘Overnight Duffle’
      String actualText4 = "Overnight Duffle";
      String expectedText4 = getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']"));
      Assert.assertEquals(actualText4, expectedText4, "Incorrect Product");
//* Verify the Qty is ‘3’
      String actualText2 = "3";
      String expectedText2 = getTextFromElement(By.xpath("//input[@id='cart-439978-qty']"));
      Assert.assertEquals(actualText2, expectedText2, "Incorrect QTY");
//* Verify the product price ‘$135.00’
      String actualText3 = "$135.00";
      String expectedText3 = getTextFromElement(By.xpath("//input[@id='cart-439978-qty']"));
      Assert.assertEquals(actualText, expectedText, "Incorrect Total");
//* Change the Qty to ‘5’
      shoppingCartPage.changeQtyTo5();
//* Click on the ‘Update Shopping Cart’ button
      shoppingCartPage.clickOnUpdateShoppingCart();
//  * Verify the product price ‘$225.00’
      String acutalText5 = "$225.00";
      String expectedText5 = getTextFromElement(By.xpath("//input[@id='cart-439978-qty']"));
      Assert.assertEquals(acutalText5, expectedText5, "Incorrect Total");

  }
}

