
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class eloss {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://heartmtdm.farmersinsurance.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/eClaims/AgentLoss/init.action");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Roadside Assistance / Towing")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Click here')])[2]")).click();
    driver.findElement(By.id("policySearchCriteria.policyNumber")).sendKeys("0169910995");
    driver.findElement(By.id("lossDate")).sendKeys("18/10/2011");
    new Select(driver.findElement(By.id("lossTime"))).selectByVisibleText("04:00");
    driver.findElement(By.id("rdoAMPMPM")).click();
    driver.findElement(By.id("btnSubmit")).click();
    driver.findElement(By.id("selectPolicy")).click();
    driver.findElement(By.id("newClaimImageBtn")).click();
    new Select(driver.findElement(By.id("lossDetermination.claimType"))).selectByVisibleText("Collision");
   Thread.sleep(1000);
    new Select(driver.findElement(By.id("lossDetermination.causeOfLoss"))).selectByVisibleText("Collision");
    driver.findElement(By.cssSelector("img.ui-datepicker-trigger")).click();
    driver.findElement(By.linkText("11")).click();
    new Select(driver.findElement(By.id("reportedTime"))).selectByVisibleText("03:00");
    driver.findElement(By.id("bestTimeFromAMPMPM")).click();
    driver.findElement(By.id("address")).sendKeys("no 420 kansas");
    driver.findElement(By.id("lossLocationDetails.crossStreet")).sendKeys("4 th cr st");
    new Select(driver.findElement(By.id("lossLocationDetails.locationType"))).selectByVisibleText("In home");
    driver.findElement(By.id("city")).sendKeys("kansas");
    new Select(driver.findElement(By.id("lossLocationDetails.state"))).selectByVisibleText("CA - California");
    driver.findElement(By.id("lossLocationDetails.zipCode")).sendKeys("45263");
    driver.findElement(By.xpath("(//input[@id='lossDetermination.lossDescriptionCollisionOptions'])[5]")).click();
    driver.findElement(By.id("lawEnforcementDetails.lawEnforcementYes")).click();
    new Select(driver.findElement(By.id("lawEnforcementDetails.departmentType"))).selectByVisibleText("Police Department");
    driver.findElement(By.id("lawEnforcementDetails.departmentName")).sendKeys("pol dept");
    driver.findElement(By.id("lawEnforcementDetails.reportNumber")).sendKeys("45632");
    driver.findElement(By.id("lawEnforcementDetails.badge")).sendKeys("pol563");
    new Select(driver.findElement(By.id("lawEnforcementDetails.state"))).selectByVisibleText("CA - California");
    driver.findElement(By.id("NextBtn")).click();
    new Select(driver.findElement(By.id("contactInfo.timeZone"))).selectByVisibleText("Mountain Time");
    new Select(driver.findElement(By.id("contactInfo.locationInVehicle"))).selectByVisibleText("Driver");
    driver.findElement(By.id("contactInfo.home_phone")).sendKeys("4526323623");
    driver.findElement(By.id("contactInfo.preferred")).click();
    driver.findElement(By.id("contactInfo.injuryDetails.injuryYes")).click();
    new Select(driver.findElement(By.id("contactInfo.injuryDetails.injuryType"))).selectByVisibleText("Crushing");
    new Select(driver.findElement(By.id("contactInfo.injuryDetails.injuredArea"))).selectByVisibleText("Head");
    driver.findElement(By.id("contactInfo.injuryDetails.injuryDescription")).sendKeys("broken head");
    driver.findElement(By.id("saveContact")).click();
    driver.findElement(By.id("yesBtn2")).click();
    driver.findElement(By.id("NextBtn")).click();
   // new Select(driver.findElement(By.id("contactInfo.timeZone"))).selectByVisibleText("Mountain Time");
    //new Select(driver.findElement(By.id("contactInfo.locationInVehicle"))).selectByVisibleText("Driver");
    //driver.findElement(By.id("contactInfo.home_phone")).sendKeys("4526323623");
    //driver.findElement(By.id("contactInfo.preferred")).click();
    //driver.findElement(By.id("contactInfo.injuryDetails.injuryNo")).click();
    //driver.findElement(By.id("saveContact")).click();
    //driver.findElement(By.id("yesBtn2")).click();
    driver.findElement(By.id("NextBtn")).click();
    driver.findElement(By.id("callerNew")).click();
    driver.findElement(By.id("NextBtn")).click();
    new Select(driver.findElement(By.id("vehicleInfo.driverName"))).selectByIndex(1);
    new Select(driver.findElement(By.id("vehicleInfo.vehicleType"))).selectByVisibleText("Car");
    new Select(driver.findElement(By.id("vehicleInfo.vehicleDamage.pointOfImpact"))).selectByVisibleText("Passenger Rear");
    driver.findElement(By.id("vehicleInfo.vehicleDamage.fire")).click();
    driver.findElement(By.id("vehicleInfo.vehicleDamage.flood")).click();
    driver.findElement(By.id("vehicleInfo.vehicleDamage.description")).clear();
    driver.findElement(By.id("vehicleInfo.vehicleDamage.description")).sendKeys("broken bummper");
    new Select(driver.findElement(By.id("vehicleInfo.nonVehicleDescription"))).selectByVisibleText("Power Pole");
    driver.findElement(By.id("vehicleInfo.nonVehicleDamageDescription")).sendKeys("damaged power pole");
    driver.findElement(By.id("vehicleInfo.vehicleLocation.locationName")).sendKeys("in home");
    new Select(driver.findElement(By.id("vehicleInfo.vehicleLocation.locationType"))).selectByVisibleText("Business");
    driver.findElement(By.id("vehicleInfo.vehicleLocation.locationAddress")).sendKeys("no 420 repair shop");
    driver.findElement(By.id("vehicleInfo.vehicleLocation.city")).sendKeys("knasa");
    new Select(driver.findElement(By.id("vehicleInfo.vehicleLocation.state"))).selectByVisibleText("AK - Alaska");
   // driver.findElement(By.id("vehicleInfo.vehicleLocation.zip")).sendKeys("425636");
    driver.findElement(By.id("vehicleInfo.vehicleLocation.phone")).sendKeys("(456)-323-6236");
    driver.findElement(By.id("vehicleInfo.vehicleLocation.zip")).sendKeys("42563");
    driver.findElement(By.cssSelector("#saveVehicle > img")).click();
    driver.findElement(By.id("saveVehicleYes")).click();
    driver.findElement(By.id("NextBtn")).click();
    driver.findElement(By.id("confirmBtn")).click();
    driver.findElement(By.id("yesBtnConfirm")).click();
    Thread.sleep(5000);
    assertTrue(driver.findElement(By.xpath("//*[@id='showClaimNo']/strong")).getText().contains("Claim"));
   String Claim = driver.findElement(By.xpath("//*[@id='showClaimNo']/strong")).getText();
    System.out.println(Claim);
    //Assert.assertEquals(driver.findElement(By.xpath("//*[@id='showClaimNo']/strong")).getText(),"Claim Number");
   // String Claim = driver.findElement(By.xpath("//*[@id='showClaimNo']/strong")).getText();
   // System.out.println(Claim);
  
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}