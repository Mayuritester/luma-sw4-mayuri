package com.softwaretestingboard.pages;

import com.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {


    public void changeQtyTo3 (){
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("3");


    }

    public void addToCart () {
        clickOnElement(By.xpath("//span[normalize-space()='Add to Cart']"));


    }
    public void clickOnShoppingCart (){
        clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
    }

}
