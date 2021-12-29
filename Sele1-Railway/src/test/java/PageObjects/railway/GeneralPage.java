package PageObjects.railway;

import Common.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {

    //Locators
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
    private final By lbWelcomeMessage = By.xpath("//div[@class='account']/strong");

    //Elements
    public WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    public WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }

    public WebElement getLbWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lbWelcomeMessage);
    }

    //Methods
    public String getWelcomeMessage(){
        return this.getLbWelcomeMessage().getText();
    }

    public LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new LoginPage();
    }
}
