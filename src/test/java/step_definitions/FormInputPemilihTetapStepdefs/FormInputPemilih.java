package step_definitions.FormInputPemilihTetapStepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class FormInputPemilih {
    private WebDriver webDriver;
    public FormInputPemilih(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    //cara masuk sampai di page pemilih tetap
    @When("^user click menu Pemilih Tetap$")
    public void userClickMenuPemilihTetap() throws InterruptedException {
        WebElement ClickMenuPemilihTetap = webDriver.findElement(By.xpath("//li[contains(.,'Pemilih Tetap')]"));
        ClickMenuPemilihTetap.click();
        Thread.sleep(2000);
    }
    @And("^already on page Pemilih Tetap$")
    public void alreadyOnPagePemilihTetap() throws InterruptedException {
        WebElement verifyOnPagePemilihTetap = webDriver.findElement(By.xpath("//div[@id='cardDataPemilih']//div[@class='card-title']"));
        verifyOnPagePemilihTetap.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(5000);
    }

}
