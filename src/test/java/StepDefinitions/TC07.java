package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC07 {

    Elements e = new Elements();
    @Then("I verify that add button is displayed")
    public void iVerifyThatAddButtonIsDisplayed() {
        e.waitUntilVisible(e.addButton);
        Assert.assertTrue(e.addButton.isDisplayed());
    }
}
