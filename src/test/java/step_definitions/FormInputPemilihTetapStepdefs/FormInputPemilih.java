package step_definitions.FormInputPemilihTetapStepdefs;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import step_definitions.Hooks;

public class FormInputPemilih {
    private WebDriver webDriver;

    public FormInputPemilih() {
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

    @And("^user click button Tambah$")
    public void userClickButtonTambah() throws InterruptedException {
        WebElement ClickButtonTambah = webDriver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]"));
        ClickButtonTambah.click();
        Thread.sleep(2000);
    }

    @Then("^Input any \"([^\"]*)\"$")
    public void inputAny(String TypeData) throws InterruptedException {
        WebElement ClickNoKK = webDriver.findElement(By.xpath("//input[@id='pemilih_kk']"));
        ClickNoKK.sendKeys(TypeData);
        Thread.sleep(2000);
    }

    // Validation

    // Click No KK Field
    @Then("^user click No KK field$")
    public void userClickNoKKField() throws InterruptedException {
        WebElement ClickNoKK = webDriver.findElement(By.xpath("//input[@id='pemilih_kk']"));
        ClickNoKK.click();
        Thread.sleep(2000);
    }

    // Click No NIK Field
    @Then("^user click No NIK field$")
    public void userClickNoNIKField() throws InterruptedException {
        WebElement ClickNoNIK = webDriver.findElement(By.xpath("//input[@id='pemilih_nik']"));
        ClickNoNIK.click();
        Thread.sleep(2000);
    }

    //Click Nama Field
    @Then("^user click Nama field$")
    public void userClickNamaField() throws InterruptedException {
        WebElement ClickNama = webDriver.findElement(By.xpath("//input[@id='pemilih_nama']"));
        ClickNama.click();
        Thread.sleep(2000);
    }

    @Then("^user click Alamat field$")
    public void userClickAlamatField() throws InterruptedException {
        WebElement ClickAlamat = webDriver.findElement(By.xpath("//textarea[@id='pemilih_alamat']"));
        ClickAlamat.click();
        Thread.sleep(2000);
    }

    @Then("^user click RT field$")
    public void userClickRTField() throws InterruptedException {
        WebElement ClickRT = webDriver.findElement(By.xpath("//input[@id='pemilih_rt']"));
        ClickRT.click();
        Thread.sleep(2000);
    }

    @Then("^user click RW field$")
    public void userClickRWField() throws InterruptedException {
        WebElement ClickRT = webDriver.findElement(By.xpath("//input[@id='pemilih_rw']"));
        ClickRT.click();
        Thread.sleep(2000);
    }

    @Then("^user Select Kelurahan field$")
    public void userSelectKelurahanField() throws InterruptedException {
        WebElement SelectKelurahan = webDriver.findElement(By.cssSelector("[aria-labelledby='select2-pemilih_kelurahan_id-container']"));
        SelectKelurahan.click();
        Thread.sleep(2000);
    }

    @Then("^user click Tempat Lahir field$")
    public void userClickTempatLahirField() throws InterruptedException {
        WebElement ClickTempatLahir = webDriver.findElement(By.xpath("//input[@id='pemilih_tempat_lahir']"));
        ClickTempatLahir.click();
        Thread.sleep(2000);
    }

    @Then("^user click Jenis Kelamin Laki - Laki field$")
    public void userClickJenisKelaminLakiLakiField() throws InterruptedException {
        WebElement ClickJenisKelaminLakiLaki = webDriver.findElement(By.xpath("//label[contains(.,'Laki-laki')]"));
        ClickJenisKelaminLakiLaki.click();
        Thread.sleep(2000);
    }

    @Then("^user click Jenis Kelamin Perempuan field$")
    public void userClickJenisKelaminPerempuanField() throws InterruptedException {
        WebElement ClickJenisKelaminPerempuan = webDriver.findElement(By.xpath("//label[contains(.,'Perempuan')]"));
        ClickJenisKelaminPerempuan.click();
        Thread.sleep(2000);
    }

    @Then("^user click Status Kawin field$")
    public void userClickStatusKawinField() throws InterruptedException {
        WebElement ClickStatusKawin = webDriver.findElement(By.cssSelector("[aria-labelledby='select2-pemilih_status_kawin-container']"));
        ClickStatusKawin.click();
        Thread.sleep(2000);
    }

    @Then("^user click Caleg field$")
    public void userClickCalegField() throws InterruptedException {
        WebElement ClickCaleg = webDriver.findElement(By.cssSelector("[aria-labelledby='select2-pemilih_caleg_id-container']"));
        ClickCaleg.click();
        Thread.sleep(2000);
    }

    @Then("^user click TPS field$")
    public void userClickTPSField() throws InterruptedException {
        WebElement ClickTPS = webDriver.findElement(By.xpath("//select[@id='pemilih_tps_id']"));
        ClickTPS.click();
        Thread.sleep(2000);
    }

    @Then("^user click Status on Pemilih field$")
    public void userClickStatusOnPemilihField() throws InterruptedException {
        WebElement ClickStatusOnPemilih = webDriver.findElement(By.xpath("//label[contains(.,'PEMILIH')]"));
        ClickStatusOnPemilih.click();
        Thread.sleep(2000);
    }

    @Then("^user click Status on Potensi field$")
    public void userClickStatusOnPotensiField() throws InterruptedException {
        WebElement ClickStatusOnPotensi = webDriver.findElement(By.xpath("//label[contains(.,'POTENSI')]"));
        ClickStatusOnPotensi.click();
        Thread.sleep(2000);
    }

    // Functionality


    @And("^input No KK Field with valid data \"([^\"]*)\"$")
    public void inputNoKKFieldWithValidData(String NoKKField) throws InterruptedException {
        WebElement inputNoKK = webDriver.findElement(By.xpath("//input[@id='pemilih_kk']"));
        inputNoKK.sendKeys(NoKKField);
        Thread.sleep(2000);
    }

    @And("^input No NIK Field with valid data \"([^\"]*)\"$")
    public void inputNoNIKFieldWithValidData(String NoNIKField) throws InterruptedException {
        WebElement inputNoNIK = webDriver.findElement(By.xpath("//input[@id='pemilih_nik']"));
        inputNoNIK.sendKeys(NoNIKField);
        Thread.sleep(2000);
    }

    @And("^input Nama Field with valid data \"([^\"]*)\"$")
    public void inputNamaFieldWithValidData(String NamaField) throws InterruptedException {
        WebElement inputNama = webDriver.findElement(By.xpath("//input[@id='pemilih_nama']"));
        inputNama.sendKeys(NamaField);
        Thread.sleep(2000);
    }

    @And("^input Alamat Field with valid data \"([^\"]*)\"$")
    public void inputAlamatFieldWithValidData(String AlamatField) throws InterruptedException {
        WebElement inputAlamat = webDriver.findElement(By.xpath("//textarea[@id='pemilih_alamat']"));
        inputAlamat.sendKeys(AlamatField);
        Thread.sleep(2000);
    }

    @And("^input RT Field with valid data \"([^\"]*)\"$")
    public void inputRTFieldWithValidData(String RTField) throws InterruptedException {
        WebElement inputRT = webDriver.findElement(By.xpath("//input[@id='pemilih_rt']"));
        inputRT.sendKeys(RTField);
        Thread.sleep(2000);
    }

    @And("^input RW Field with valid data \"([^\"]*)\"$")
    public void inputRWFieldWithValidData(String RWField) throws InterruptedException {
        WebElement inputRW = webDriver.findElement(By.xpath("//input[@id='pemilih_rw']"));
        inputRW.sendKeys(RWField);
        Thread.sleep(2000);
    }

    @And("^select Kelurahan Field with data \"([^\"]*)\"$")
    public void selectKelurahanFieldWithData(String KelurahanField) throws InterruptedException {
        WebElement selectKelurahan = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        selectKelurahan.sendKeys(KelurahanField);
        selectKelurahan.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
    }

    @And("^input Tempat Lahir Field with valid data \"([^\"]*)\"$")
    public void inputTempatLahirFieldWithValidData(String TempatLahirField) throws InterruptedException {
        WebElement inputTempatLahir = webDriver.findElement(By.xpath("//input[@id='pemilih_tempat_lahir']"));
        inputTempatLahir.sendKeys(TempatLahirField);
        Thread.sleep(2000);
    }

    @Then("^user click Tanggal Lahir Field$")
    public void userClickTanggalLahirField() throws InterruptedException {
        WebElement ClickTanggalLahir = webDriver.findElement(By.xpath("//input[@id='pemilih_tgl_lahir']"));
        ClickTanggalLahir.click();
        Thread.sleep(2000);
    }

    @And("^input Tanggal Lahir Field with valid data \"([^\"]*)\"$")
    public void inputTanggalLahirFieldWithValidData(String TanggalLahirField) throws InterruptedException {
        WebElement inputTanggalLahir = webDriver.findElement(By.xpath("//input[@id='pemilih_tgl_lahir']"));
        inputTanggalLahir.sendKeys(TanggalLahirField);
        inputTanggalLahir.sendKeys(Keys.RETURN);
        inputTanggalLahir.sendKeys(Keys.ESCAPE);
        Thread.sleep(2000);
    }

    @And("^select Status Kawin with data \"([^\"]*)\"$")
    public void selectStatusKawinWithData(String StatusKawinWithData) throws InterruptedException {
        WebElement selectStatusKawin = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        selectStatusKawin.sendKeys(StatusKawinWithData);
        selectStatusKawin.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
    }

    @And("^select Caleg with data \"([^\"]*)\"$")
    public void selectCalegWithData(String CalegWithData) throws InterruptedException {
        WebElement selectCaleg = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        selectCaleg.sendKeys(CalegWithData);
        selectCaleg.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
    }

    @Then("^user click TPS Functionality field$")
    public void userClickTPSFunctionalityField() throws InterruptedException {
        WebElement ClickTPSFunctionality = webDriver.findElement(By.cssSelector("[aria-labelledby='select2-pemilih_tps_id-container']"));
        ClickTPSFunctionality.click();
        Thread.sleep(2000);
    }

    @And("^select TPS with data \"([^\"]*)\"$")
    public void selectTPSWithData(String TPSWithData) throws InterruptedException {
        WebElement selectTPS = webDriver.findElement(By.xpath("//input[@class='select2-search__field']"));
        selectTPS.sendKeys(TPSWithData);
        selectTPS.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
    }

    @Then("^click on button Simpan$")
    public void clickOnButtonSimpan() throws InterruptedException {
        WebElement clickOnButtonSimpan = webDriver.findElement(By.xpath("//button[@id='btn-simpan']"));
        clickOnButtonSimpan.click();
        Thread.sleep(2000);
    }

}
