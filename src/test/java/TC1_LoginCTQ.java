import CTQ.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC1_LoginCTQ {

    WebDriver driver = new ChromeDriver();
    Login login = new Login(driver);

    @BeforeClass
    public void beforeClass(){
        Login login = new Login(driver);
        driver.get("https://staging.ctq.cloud/users/sign_in");
        login.loginCTQAdmin();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    @Test(description = "Test if login as CTQ admin was succesful")
    public void loginCTQAdmin(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://staging.ctq.cloud/ctq/requests","The login as CTQ Admin was not succesful");
    }

    @Test(description = "Fail test", dependsOnMethods = "loginCTQAdmin")
    public void Fail(){
        Assert.assertEquals(1,2,"unu nu-i egal cu doi no csf");
    }
}
