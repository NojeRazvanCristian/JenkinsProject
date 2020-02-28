package CTQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public static final String LOGINUSERNAME_ID = "user_email";
    public static final String PASSWORD_ID = "user_password";
    public static final String LOGINBUTTON_XPATH = "//*[@id=\"new_user\"]/button";

    @FindBy(id = LOGINUSERNAME_ID)
    WebElement input_login;

    @FindBy(id = PASSWORD_ID)
    WebElement input_password;

    @FindBy(xpath = LOGINBUTTON_XPATH)
    WebElement button_login;


    public Login (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void loginCTQAdmin(){
        input_login.sendKeys("admin@ctq.com");
        input_password.sendKeys("909090");
        button_login.click();
    }
}
