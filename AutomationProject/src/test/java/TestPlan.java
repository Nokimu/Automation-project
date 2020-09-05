import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeEach
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test
        public void we_Do_Qa() throws IOException {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterGoogleSearch();
        webForm.clickGoogleSearch();
        webForm.clickSearchResult();
        webForm.clickOnInteractions();
        webForm.clickDroppableButton();
        webForm.takeScreenshot("C\\");
        webForm.dragAndDrop();
        webForm.widgetsButton();
        webForm.tooltipButton();
        webForm.hover();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test public void cheese_Search(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterGoogleSearchCheese();
        webForm.clickGoogleSearch();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void orangeHRM(){
        driver.get(Utils.ORANGEHRM_PAGE);
        WebForm webForm = new WebForm(driver);
        webForm.loginButton();
        webForm.recruitmentDropdown();
        webForm.candidatesButton();
        //print out the number of candidates
        webForm.addButton();
        webForm.firstName();
        webForm.lastName();
        webForm.emailField();
        webForm.datePicker();
        //Select current date
        webForm.saveCandidateButton();
        //Use Junit Assert to check if the number of candidates is increased by 1.
        //Select the freshly created candidate
        webForm.moreOptions();
        webForm.deleteCandidateButton();
        //Use Junit assert to check if the number of candidates decreased by 1
        webForm.accountOptions();
        webForm.logoutButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
