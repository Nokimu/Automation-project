import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebForm extends PageObject {

    private final String SEARCH_QUERY = "demoqa";
    private final String SEARCH_CHEESE = "cheese";
    private final String FIRST_NAME = "QA";
    private final String LAST_NAME = "Automation";
    private final String EMAIL = "QAAutomation@gmail.com";

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    private WebElement googlesearch_field;

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")
    private WebElement googlesearch_button;

    @FindBy(id = "result-stats")
    private WebElement searchResults;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")
    private WebElement click_link;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[5]")
    private WebElement demoqa_interactions;

    @FindBy(xpath = "//*[@id=\"item-4\"]")
    private WebElement droppable_button;

    @FindBy(xpath = "//*[@id=\"draggable\"]")
    private WebElement drag_me;

    @FindBy(xpath = "//*[@id=\"droppable\"]")
    private WebElement drop_me;


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div")
    private WebElement widgetsdropdown_button;

    @FindBy(xpath = "//*[@id=\"item-6\"]")
    private WebElement tooltip_button;

    @FindBy(xpath = "//*[@id=\"texToolTopContainer\"]/a[1]")
    private WebElement hover;

    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    private WebElement login_button;

    @FindBy(xpath = "//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/a/span[2]")
    private WebElement recruitment_dropdown;

    @FindBy(xpath = "//*[@id=\"menu_recruitment_viewCandidates\"]/span[2]")
    private WebElement candidates_button;

    @FindBy(xpath = "//*[@id=\"addItemBtn\"]/i")
    private WebElement add_button;

    @FindBy(xpath = "//*[@id=\"addCandidate_firstName\"]")
    private WebElement firstname_field;

    @FindBy(xpath = "//*[@id=\"addCandidate_lastName\"]")
    private WebElement lastname_field;

    @FindBy(xpath = "//*[@id=\"addCandidate_email\"]")
    private WebElement email_field;

    @FindBy(xpath = "//*[@id=\"applied_date\"]")
    private WebElement datepicker;

    @FindBy(xpath = "//*[@id=\"applied_date_root\"]/div/div/div/div/div[2]")
    private WebElement datePickerTable;

    @FindBy(xpath = "//*[@id=\"saveCandidateButton\"]")
    private WebElement save_button;

    @FindBy(xpath = "//*[@id=\"fromToOf\"]/div")
    private WebElement candidates_number;

    //select candidate

    @FindBy(xpath = "//*[@id=\"ohrmList_Menu\"]/i")
    private WebElement moreoptions_button;

    @FindBy(xpath = "//*[@id=\"deleteItemBtn\"]")
    private WebElement deletecandidate_button;

    @FindBy(xpath = "//*[@id=\"account-job\"]/i")
    private WebElement accountoptions_button;

    @FindBy(xpath = "//*[@id=\"logoutLink\"]")
    private WebElement logout_button;

    public WebForm(WebDriver driver){
        super(driver);
    }
    
    //Elements for first test
    public void enterGoogleSearch(){
        this.googlesearch_field.sendKeys(SEARCH_QUERY);
    }

    public void clickGoogleSearch(){
        this.googlesearch_button.click();
    }

    public void clickSearchResult(){
        this.click_link.click();
    }

    public void clickOnInteractions(){
        this.demoqa_interactions.click();
    }

    public void clickDroppableButton(){
        this.droppable_button.click();
    }
    
    public void dragAndDrop(){
        Actions act = new Actions(driver);
        act.dragAndDrop(drag_me, drop_me).build().perform();
    }

    public void takeScreenshot(String pathname) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\"));
    }

    public void widgetsButton(){
        this.widgetsdropdown_button.click();
    }

    public void tooltipButton(){
        this.tooltip_button.click();
    }

    public void hover(){
        Actions action = new Actions(driver);
        action.moveToElement(hover).click().build().perform();
    }

    //Elements for second test
    public void enterGoogleSearchCheese(){
        this.googlesearch_field.sendKeys(SEARCH_CHEESE);
    }

     public void searchResultsNumber(){
        this.searchResults.getText();
    }

    //Elements for third test
    public void loginButton(){
        this.login_button.click();
    }

    public void recruitmentDropdown(){
        this.recruitment_dropdown.click();
    }

    public void candidatesButton(){
        this.candidates_button.click();
    }

    public void addButton(){
        this.add_button.click();
    }

    public void firstName(){
        this.firstname_field.sendKeys(FIRST_NAME);
    }

    public void lastName(){
        this.lastname_field.sendKeys(LAST_NAME);
    }

    public void emailField(){
        this.email_field.sendKeys(EMAIL);
    }

    public void datePicker(){
        this.datepicker.click();
    }

    //public void datePickerTable(){
    //    this.datePickerTable.click();
    //}

    public void saveCandidateButton(){
        this.save_button.click();
    }

    public void candidatesNumber(){
        this.candidates_number.getText();
    }

    //check candidate number +1

    //select candidate

    public void moreOptions(){
        this.moreoptions_button.click();
    }

    public void deleteCandidateButton(){
        this.deletecandidate_button.click();
    }

    //check candidate number -1

    public void accountOptions(){
        this.accountoptions_button.click();
    }

    public void logoutButton(){
        this.logout_button.click();
    }
}