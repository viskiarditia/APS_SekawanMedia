package step_definitions.SearchDataPemilihStepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class SearchDataPemilih {
    private WebDriver webDriver;
    public SearchDataPemilih(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    // Validation

    @Then("^user click Search Field$")
    public void userClickSearchField() throws InterruptedException {
        WebElement ClickSearchField = webDriver.findElement(By.xpath("//input[@id='table-inputpemilih_dtSearch']"));
        ClickSearchField.click();
        Thread.sleep(2000);
    }

    @Then("^Input any in search Field \"([^\"]*)\"$")
    public void inputAnyInSearchField(String SearchField) throws InterruptedException {
        WebElement ClickSearchField = webDriver.findElement(By.xpath("//input[@id='table-inputpemilih_dtSearch']"));
        ClickSearchField.sendKeys(SearchField);
        Thread.sleep(2000);
    }


    @Then("^input \"([^\"]*)\" on the search field$")
    public void inputOnTheSearchField(String SearchField) throws InterruptedException {
        WebElement inputOnTheSearch = webDriver.findElement(By.xpath("//input[@id='table-inputpemilih_dtSearch']"));
        inputOnTheSearch.sendKeys(SearchField);
        Thread.sleep(2000);
    }
}
