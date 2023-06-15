package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class TC05 {

    Elements e = new Elements();
    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        }

    @When("Login as an admin")
    public void loginAsAnAdmin() {
        e.sendKeysFunction(e.loginUsername,"Admin");
        e.sendKeysFunction(e.loginPassword,"admin123");
        e.clickFunction(e.loginButton);
    }

    @And("Navigate to admin management page")
    public void navigateToAdminManagementPage() { e.clickFunction(e.adminButton);
    }

    @And("Click on add button")
    public void clickOnAddButton() { e.javaScpritClickFunction(e.addButton);
    }

    @When("Admin send a value in to the username field which is less than five characters")
    public void adminSendAValueInToTheUsernameFieldWhichIsLessThanFiveCharacters() {
        e.sendKeysFunction(e.username,"Ress");
    }

    @Then("Notification messages should be in red color displayed.")
    public void notificationMessagesShouldBeInRedColorDisplayed() {
        e.displaymessage.isDisplayed();
    }
}
