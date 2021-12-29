package PageObjects.railway;

import Common.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage {

    //Locators
    private final By txtUsername = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//input[@value='login']");
    private final By lblMessageErrorLg = By.xpath("//p[@class='message error LoginForm']");

    public WebElement getTxtUsername(){
        return Constant.WEBDRIVER.findElement(txtUsername);
    }

    public WebElement getTxtPassword(){
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    public WebElement getBtnLogin(){
        return Constant.WEBDRIVER.findElement(btnLogin);
    }

    public WebElement getLblMessageErrorLg(){
        return Constant.WEBDRIVER.findElement(lblMessageErrorLg);
    }

    public void login(String username, String password){
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
    }
}
