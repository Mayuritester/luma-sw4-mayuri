package com.softwaretestingboard.pages;

import com.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

  public void changeQtyTo5 (){
      driver.findElement(By.xpath("//input[@id='cart-439978-qty']")).clear();
      driver.findElement(By.xpath("//input[@id='cart-439978-qty']")).sendKeys("5");
  }

  public void clickOnUpdateShoppingCart (){
      clickOnElement(By.xpath("//span[normalize-space()='Update Shopping Cart']"));
  }

}
