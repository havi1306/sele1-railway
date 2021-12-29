package Testcases.railway;

import Common.constant.Constant;
import PageObjects.railway.HomePage;
import PageObjects.railway.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver","D:\\Sele1-Railway\\src\\test\\java\\Executables\\chromedriver_96.exe");

        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage.open();
        loginPage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);


    }
}
