package step_definitions.UpdateDataPemilihStepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class UpdateDataPemilih {
    private WebDriver webDriver;
    public UpdateDataPemilih(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^Click edit button in data your choise$")
    public void clickEditButtonInDataYourChoise() throws InterruptedException {
        WebElement clickEditButton = webDriver.findElement(By.xpath("//table[@id='table-inputpemilih']//tr[3]//i[@class='icon far fa-edit']"));
        clickEditButton.click();
        Thread.sleep(1000);
    }

    @And("^update No NIK Field with valid data \"([^\"]*)\"$")
    public void updateNoNIKFieldWithValidData(String NoNIKField) throws InterruptedException {
        WebElement updateNoNIK = webDriver.findElement(By.xpath("//input[@id='pemilih_nik']"));
        updateNoNIK.clear();
        updateNoNIK.sendKeys(NoNIKField);
        Thread.sleep(1000);
    }

    @And("^update Nama Field with valid data \"([^\"]*)\"$")
    public void updateNamaFieldWithValidData(String NamaField) throws InterruptedException {
        WebElement updateNoNIK = webDriver.findElement(By.xpath("//input[@id='pemilih_nama']"));
        updateNoNIK.clear();
        updateNoNIK.sendKeys(NamaField);
        Thread.sleep(1000);
    }

    @And("^Update Alamat Field with valid data \"([^\"]*)\"$")
    public void updateAlamatFieldWithValidData(String AlamatField) throws InterruptedException {
        WebElement updateAlamat = webDriver.findElement(By.xpath("//input[@id='pemilih_nama']"));
        updateAlamat.clear();
        updateAlamat.sendKeys(AlamatField);
        Thread.sleep(1000);

    }

    @And("^Update RT Field with valid data \"([^\"]*)\"$")
    public void updateRTFieldWithValidData(String RTField) throws InterruptedException {
        WebElement updateRT = webDriver.findElement(By.xpath("//input[@id='pemilih_rt']"));
        updateRT.clear();
        updateRT.sendKeys(RTField);
        Thread.sleep(1000);
    }

    @And("^Update RW Field with valid data \"([^\"]*)\"$")
    public void updateRWFieldWithValidData(String RWField) throws InterruptedException {
        WebElement updateRW = webDriver.findElement(By.xpath("//input[@id='pemilih_rw']"));
        updateRW.clear();
        updateRW.sendKeys(RWField);
        Thread.sleep(1000);
    }
}
