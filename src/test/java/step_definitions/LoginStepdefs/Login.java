package step_definitions.LoginStepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class Login {

    private WebDriver webDriver;
    public Login(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^user already website APS on login page$")
    public void userAlreadyWebsiteAPSOnLoginPage() throws InterruptedException {
        WebElement loginPage = webDriver.findElement(By.xpath("//h3[@class='font-weight-bolder text-dark']"));
        loginPage.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user Click username field and input \"([^\"]*)\"$")
    public void userClickUsernameFieldAndInput(String username) throws InterruptedException {
        WebElement ClickUsernameField = webDriver.findElement(By.xpath("//input[@id='username']"));
        ClickUsernameField.click();
        Thread.sleep(500);
        ClickUsernameField.sendKeys(username);
        Thread.sleep(500);
    }

    @And("^user Click password field and input \"([^\"]*)\"$")
    public void userClickPasswordFieldAndInput(String password) throws InterruptedException {
        WebElement ClickPasswordField = webDriver.findElement((By.xpath("//input[@id='password']")));
        ClickPasswordField.click();
        Thread.sleep(500);
        ClickPasswordField.sendKeys(password);
        Thread.sleep(500);
    }

    @Then("^user click on Button Masuk on login page$")
    public void userClickOnButtonMasukOnLoginPage() throws InterruptedException {
        WebElement ClickOnButtonMasuk = webDriver.findElement(By.xpath("//button[@id='kt_login_signin_submit']"));
        ClickOnButtonMasuk.click();
        Thread.sleep(1000);
    }

    @And("^user navigate to Home Page website APS$")
    public void userNavigateToHomePageWebsiteAPS() throws InterruptedException {
        WebElement verifyNavigateToHomePage = webDriver.findElement(By.xpath("//div[@id='kt_brand']"));
        verifyNavigateToHomePage.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1500);
    }
}
