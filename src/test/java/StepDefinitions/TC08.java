package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC08 {
    Elements e = new Elements();
    @Then("I verify that all the required elements are displayed")
    public void iVerifyThatAllTheRequiredElementsAreDisplayed() {
        e.waitUntilVisible(e.userRole);
        Assert.assertTrue(e.userRole.isDisplayed());
        Assert.assertTrue(e.employeeName.isDisplayed());
        Assert.assertTrue(e.status.isDisplayed());
        Assert.assertTrue(e.username.isDisplayed());
        Assert.assertTrue(e.password.isDisplayed());
        Assert.assertTrue(e.passwordConfirm.isDisplayed());
    }
}
