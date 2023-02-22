package com.automation.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class HomePageLocator {
 
      @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
      public  WebElement homePageUserName;
       
}