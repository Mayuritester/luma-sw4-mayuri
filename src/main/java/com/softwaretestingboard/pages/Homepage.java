package com.softwaretestingboard.pages;

import com.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {

    By logLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink (){
        clickOnElement(logLink);
    }

    public void clickOnRegisterLink (){
        clickOnElement(registerLink);
    }

    public void mouseHoverOnWomenMenu () {
        mouseHoverToElement(By.xpath("//span[normalize-space()='Women']"));
    }
        public void mouseHoverOnTops (){
            mouseHoverToElement(By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]"));
        }

        public void clickOnJackets (){
            clickOnElement(By.cssSelector("a[id='ui-id-11'] span"));
           // clickOnElement(waitUntilVisibilityOfElementLocated(By.cssSelector("a[id='ui-id-11'] span"),10));
        }
        public void clickOnCookie (){
            clickOnElement(By.xpath("//body/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]"));
        }
        public void mouseHoveOnMen (){
        mouseHoverToElement(By.xpath("//span[normalize-space()='Men']"));
        }

        public void mouseHoverOnBottoms(){
        mouseHoverToElement(By.xpath("//a[@id='ui-id-18']"));
        }

        public void clickOnPants (){
           // Actions actions = new Actions(driver);
           // actions.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]"))).click().build().perform();
            clickOnElement(By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]"));
        //mouseHoverToElementAndClick(By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]"));
        }

         public void mouseHoverToGearMenu (){
          mouseHoverToElement(By.xpath("//span[normalize-space()='Gear']"));
         }

         public void clickOnBags (){
        clickOnElement(By.cssSelector("#ui-id-25"));
         }

    public void clickOnOvernighDuffle (){
        clickOnElement(By.xpath("//a[normalize-space()='Overnight Duffle']"));
    }

}

