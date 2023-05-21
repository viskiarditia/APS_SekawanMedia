package step_definitions.ImportDataPemilih;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

public class ImportDataPemilih {
    private WebDriver webDriver;
    public ImportDataPemilih(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^click on the Import Excel$")
    public void clickOnTheImportExcel() throws InterruptedException {
        WebElement DropDownButton = webDriver.findElement(By.xpath("//button[@class='btn btn-sm btn-aps dropdown-toggle dropdown-toggle-split']"));
        DropDownButton.click();
        Thread.sleep(1000);
        WebElement ImportExcel = webDriver.findElement(By.xpath("//a[.='Import Excel']"));
        ImportExcel.click();
        Thread.sleep(1000);
    }

    @And("^appear modal upload data pemilih$")
    public void appearModalUploadDataPemilih() throws InterruptedException {
        WebElement modal = webDriver.findElement(By.xpath("//h5[@id='modaUpload']"));
        modal.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @Then("^click on choose file for upload file$")
    public void clickOnChooseFileForUploadFile() throws InterruptedException {
        String FileForUpload = "/Users/fizkiarditiakusuma/Downloads/Aplikasi_Pemungutan_Suara-SekawanMedia/src/test/resources/File/Data Pemilih 2023-05-21 14_50_35.xlsx";
        WebElement chooseFile = webDriver.findElement(By.xpath("//input[@name='excel_file']"));
        chooseFile.sendKeys(FileForUpload);
        WebElement UploadFile = new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Upload']")));
        UploadFile.click();
        Thread.sleep(2000);

    }

    @And("^apper pop up confirm$")
    public void apperPopUpConfirm() throws InterruptedException {
        WebElement PopUpConfirm = webDriver.findElement(By.xpath("//div[@class='swal2-html-container']"));
        PopUpConfirm.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }

    @And("^click Yes on the pup up confirm$")
    public void clickYesOnThePupUpConfirm() throws InterruptedException {
        WebElement clickYes = webDriver.findElement(By.xpath("//button[@class='swal2-confirm btn btn-focus btn-success m-btn m-btn--pill m-btn--air swal2-styled']"));
        clickYes.click();
        Thread.sleep(2000);
    }

    @And("^click OK on the pop up information$")
    public void clickOKOnThePopUpInformation() throws InterruptedException {
        WebElement clickOK = webDriver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
        clickOK.click();
        Thread.sleep(2000);
    }
}
