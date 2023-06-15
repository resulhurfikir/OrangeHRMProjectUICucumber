package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements extends Parent {

    public Elements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(css = "[name='username']")
    public WebElement loginUsername;

    @FindBy(css = "[name='password']")
    public WebElement loginPassword;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//ul[@class='oxd-main-menu']/li)[1]")
    public WebElement adminButton;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addButton;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    public WebElement userRole;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[3]")
    public WebElement selectRoleESS;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    public WebElement status;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[2]")
    public WebElement selectStatusEnable;

    @FindBy(css = "p[class='oxd-userdropdown-name']")
    public WebElement employeeNameIcin;

    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[1]")
    public WebElement employeeName;

    @FindBy(xpath = "(//div[@class='oxd-autocomplete-wrapper']/div[@role='listbox']/div)[1]")
    public WebElement selectEmployeeName;

    @FindBy(css = "span[class*='message']")
    public WebElement usernameMessage;

    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[2]")
    public WebElement username;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//input)[1]")
    public WebElement password;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//input)[2]")
    public WebElement passwordConfirm;

    @FindBy(css = "button[type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[ @class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement displaymessage;

    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[1]")
    public WebElement usernameSearchBox;

    @FindBy(css = "button[type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='oxd-table-cell oxd-padding-cell']/div)[2]")
    public WebElement searchResult;

    @FindBy(css = "div[class='oxd-table-cell-actions']>button")
    public WebElement searchDeleteIcon;

    @FindBy(xpath = "(//div[@class='orangehrm-modal-footer']/button)[2]")
    public WebElement searchDeleteConfirmButton;

    @FindBy(xpath = "//*[text()='No Records Found']")
    public WebElement searchDeleteConfirmMessage;

    @FindBy (css="[class='oxd-autocomplete-wrapper']>div")
    public List<WebElement> dropboxmessage;

    @FindBy(xpath = "(//div/div[@role='cell'])[2]")
    public WebElement lastTakenUsername;

    @FindBy(xpath = "(//div/div[@role='rowgroup'])[2]")
    public WebElement userList;

    @FindBy(xpath = "//span[contains(@class, 'error-message')]")
    public WebElement redErrorMessage;

    @FindBy(xpath = "//span[contains(@class, 'error-message')]")
    public List<WebElement> allRedErrorMessage;

    @FindBy(xpath = "//span[contains(@class,'password-chip')]")
    public WebElement passwordChip;

    @FindBy(xpath = "//h6[contains(@class,'main-title') and text()='Add User']")
    public WebElement addUserTitle;
}