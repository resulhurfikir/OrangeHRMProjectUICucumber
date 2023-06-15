package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.*;

public class TC06 {
    Elements e = new Elements();
    static String str;

    @When("I got the previously taken username")
    public void IGotThePreviouslyTakenUsername() {
        e.waitUntilVisible(e.userList);
        str = e.lastTakenUsername.getText();
    }

    @Then("I write already taken username")
    public void IWriteAlreadyTakenUsername() {
        e.sendKeysFunction(e.username, str);
    }

    @And("Already exist notification messages should be displayed in red")
    public void AlreadyExistNotificationMessagesShouldbeDisplayedinRed() {
        e.waitUntilVisible(e.usernameMessage);
        e.classContainsAttirbuteAssert(e.usernameMessage, "error");
        e.verifyContainsTextFunction(e.usernameMessage, "Already");
    }
}
