package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.*;

public class TC03 {

    Elements e = new Elements();

    @And("I enter a required value in to the password field and different value in to the confirm password field")
    public void iEnterARequiredValueInToThePasswordFieldAndDifferentValueInToTheConfirmPasswordField() {
        e.sendKeysFunction(e.password, "SamBay123.");
        e.sendKeysFunction(e.passwordConfirm,"SamBay123");
    }

    @Then("I verify that notification messages “Passwords do not match” in red color displayed.")
    public void iVerifyThatNotificationMessagesPasswordsDoNotMatchInRedColorDisplayed() {
        e.verifyContainsTextFunction(e.redErrorMessage,"Passwords do not match");
    }
}
