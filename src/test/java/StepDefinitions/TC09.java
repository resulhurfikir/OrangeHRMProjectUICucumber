package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.*;

public class TC09 {
    @Then("Verify “Add User” heading is displayed")
    public void verifyAddUserHeadingIsDisplayed() {
        Elements e=new Elements();
        e.waitUntilVisible(e.addUserTitle);
        e.addUserTitle.isDisplayed();
    }
}
