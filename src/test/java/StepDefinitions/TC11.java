package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.*;

public class TC11 {
    Elements e = new Elements();

    @Then("I write password but all uppercase")
    public void iWritePasswordButAllUppercase() {
        e.sendKeysFunction(e.password, "ISTANBUL");
    }

    @And("I verify contains lower-case message displayed and message color in red")
    public void iVerifyContainsMessageDisplayedAndMessageColorInRed() {
        e.verifyContainsTextFunction(e.usernameMessage, "lower-case");
        e.classContainsAttirbuteAssert(e.usernameMessage, "error");
    }
}
