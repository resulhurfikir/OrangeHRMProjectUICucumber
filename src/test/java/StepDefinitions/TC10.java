package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.*;

public class TC10 {

    Elements e = new Elements();

    @And("I enter a value into the Password field which is less than 7 characters")
    public void iEnterAValueIntoThePasswordFieldWhichIsLessThanEightCharacters() {
        e.sendKeysFunction(e.password, "SamBay");
    }

    @Then("I verify that notification messages “Should have at least 7 characters” in red color displayed.")
    public void iVerifyThatNotificationMessagesShouldHaveAtLeastEightCharactersInRedColorDisplayed() {
        e.verifyContainsTextFunction(e.redErrorMessage,"Should have at least 7 characters");
    }
}
