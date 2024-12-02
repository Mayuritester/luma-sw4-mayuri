package com.softwaretestingboard.pages;

import com.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Jackets extends Utility {


    public void sortByFilerProductName (){
        WebElement productName = driver.findElement(By.xpath("(//select[@id='sorter'])[1]"));
        Select sort = new Select(productName);
        sort.selectByVisibleText("Product Name");

    }



}
