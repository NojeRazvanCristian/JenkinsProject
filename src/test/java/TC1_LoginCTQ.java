import CTQ.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC1_LoginCTQ {

    WebDriver driver = new ChromeDriver();
    Login login = new Login(driver);

    @BeforeSuite
    public void beforeSuite(){
        Login login = new Login(driver);
        driver.get("https://development.ctq.cloud/users/sign_in");
        login.loginCTQAdmin();
    }
    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }

    @Test(description = "Test if login as CTQ admin was succesful")
    public void loginCTQAdmin(){
       Assert.assertEquals(driver.getCurrentUrl(),"https://development.ctq.cloud/ctq/requests","The login as CTQ Admin was not succesful");
        //Assert.assertEquals(1,2,"unu nu-i egal cu doi no csf");
    }


   /* @Test(description = "Fail test", dependsOnMethods = "loginCTQAdmin")
    public void Fail(){
        Assert.assertEquals(1,2,"unu nu-i egal cu doi no csf");
    }*/
}
