package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

      public DashboardPage(){
          PageFactory.initElements(Driver.getDriver(),this);
      }

      @FindBy(css="div.main-menu-top>ul>li")
      public List<WebElement> main_menus;

}
