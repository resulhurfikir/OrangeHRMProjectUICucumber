package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class TC04 {
    Elements e = new Elements();

    @And("I enter an invalid name in to the Employee name field")
    public void iEnterAnInvalidNameInToTheEmployeeNameField() {
        e.sendKeysFunction(e.employeeName,"Ress61");
    }

    @Then("I verify that notification messages “no records found” and “invalid” in red color displayed.")
    public void iVerifyThatNotificationMessagesNoRecordsFoundAndInvalidInRedColorDisplayed() {
        e.waitTextToBePresent(e.selectEmployeeName, "No Records Found");
        Assert.assertTrue(e.selectEmployeeName.getText().contains("Found"));
        e.clickFunction(e.selectEmployeeName);
        Assert.assertTrue(e.displaymessage.isDisplayed());
    }
}
