package com.softwaretestingboard.pages;

import com.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Pants extends Utility {


    public void mouseHoverOnCronusYogaPantsAndSelect34() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"))).click().build().perform();
        clickOnElement(By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-177']"));

    }

    public void mouseHoverOnCronusYogaPantsAndSelectBlack() {
        clickOnElement(By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']"));

    }

    public void mouseHoverOnCrunusYogaPantsAndClickOnAddToCart() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"))).click().build().perform();
        clickOnElement(By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]"));
    }

    public void clickOnShoppingCart (){
        clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
    }
}
