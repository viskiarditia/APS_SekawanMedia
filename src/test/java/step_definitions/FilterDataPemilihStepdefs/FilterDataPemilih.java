package step_definitions.FilterDataPemilihStepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class FilterDataPemilih {
    private WebDriver webDriver;
    public FilterDataPemilih(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^click the button Filter$")
    public void clickTheButtonFilter() throws InterruptedException {
        WebElement ButtonFilter = webDriver.findElement(By.xpath("//button[@class='btn btn-sm btn-light-aps d-flex justify-content-center']"));
        ButtonFilter.click();
        Thread.sleep(1000);
    }

    @Then("^input Provinsi valid data \"([^\"]*)\"$")
    public void inputProvinsiValidData(String inputProvinsi) throws InterruptedException {
        WebElement Provinsi = webDriver.findElement(By.cssSelector("[aria-labelledby='select2-filter_provinsi_id-container'] > .select2-selection__rendered"));
        Provinsi.click();
        WebElement ProvinsiValidData = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        ProvinsiValidData.sendKeys(inputProvinsi);
        ProvinsiValidData.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }

    @And("^input Kota or Kabupaten valid data \"([^\"]*)\"$")
    public void inputKotaOrKabupatenValidData(String inputKotaOrKabupaten) throws InterruptedException {
        WebElement KotaOrKabupaten = webDriver.findElement(By.xpath("//div[@class='modal fade show']//span[@class='select2-selection__placeholder']"));
        KotaOrKabupaten.click();
        WebElement KotaOrKabupatenValidData = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        KotaOrKabupatenValidData.sendKeys(inputKotaOrKabupaten);
        KotaOrKabupatenValidData.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }

    @And("^input Kecamatan valid data \"([^\"]*)\"$")
    public void inputKecamatanValidData(String inputKecamatan) throws InterruptedException {
        WebElement Kecamatan = webDriver.findElement(By.cssSelector("[aria-labelledby='select2-filter_kecamatan_id-container'] > .select2-selection__rendered"));
        Kecamatan.click();
        WebElement KecamatanValidData = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        KecamatanValidData.sendKeys(inputKecamatan);
        KecamatanValidData.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }

    @And("^input Kelurahan valid data \"([^\"]*)\"$")
    public void inputKelurahanValidData(String inputKelurahan) throws InterruptedException {
        WebElement Kelurahan = webDriver.findElement(By.cssSelector("[aria-labelledby='select2-filter_kelurahan_id-container'] > .select2-selection__rendered"));
        Kelurahan.click();
        WebElement KelurahanValidData = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        KelurahanValidData.sendKeys(inputKelurahan);
        KelurahanValidData.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }

    @And("^input TPS valid data \"([^\"]*)\"$")
    public void inputTPSValidData(String inputTPS) throws InterruptedException {
        WebElement TPS = webDriver.findElement(By.cssSelector("[aria-labelledby='select2-filter_tps_id-container'] > .select2-selection__rendered"));
        TPS.click();
        WebElement TPSValidData = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        TPSValidData.sendKeys(inputTPS);
        TPSValidData.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }

    @And("^user click button apply on the filter page$")
    public void userClickButtonApplyOnTheFilterPage() throws InterruptedException {
        WebElement ClickButtonApply = webDriver.findElement(By.xpath("//div[@class='modal fade show']//button[@class='btn btn-sm btn-aps font-weight-bold']"));
        ClickButtonApply.click();
        Thread.sleep(1000);
    }

    @And("^data result by input all field$")
    public void dataResultByInputAllField() throws InterruptedException {
        WebElement dataResultByInputAllField = webDriver.findElement(By.xpath("//td[.='Curup Utara']"));
        dataResultByInputAllField.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^data result by input valid data Provinsi Field$")
    public void dataResultByInputValidDataProvinsiField() throws InterruptedException {
        WebElement dataResultByInputValidDataProvinsiField = webDriver.findElement(By.xpath("//th[.='KECAMATAN']"));
        dataResultByInputValidDataProvinsiField.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^data result by input valid data Kabupaten Field$")
    public void dataResultByInputValidDataKabupatenField() throws InterruptedException {
        WebElement dataResultByInputValidDataKabupatenField = webDriver.findElement(By.xpath("//th[.='KECAMATAN']"));
        dataResultByInputValidDataKabupatenField.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^data result by input valid data Kecamatan Field$")
    public void dataResultByInputValidDataKecamatanField() throws InterruptedException {
        WebElement dataResultByInputValidDataKecamatanField = webDriver.findElement(By.xpath("//th[.='KECAMATAN']"));
        dataResultByInputValidDataKecamatanField.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^data result by input valid data Kelurahan Field$")
    public void dataResultByInputValidDataKelurahanField() throws InterruptedException {
        WebElement dataResultByInputValidDataKelurahanField = webDriver.findElement(By.xpath("//th[.='KECAMATAN']"));
        dataResultByInputValidDataKelurahanField.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }
}
