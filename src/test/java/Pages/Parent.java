package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

public class Parent {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(15));
    JavascriptExecutor js = (JavascriptExecutor)GWD.getDriver();

    public void sendKeysFunction(WebElement element, String text)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"No Such TEXT");
    }

    public void classContainsAttirbuteAssert(WebElement element,String attirbute){
        Assert.assertTrue(element.getAttribute("class").contains(attirbute));
    }


    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void javaScpritClickFunction(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        js.executeScript("arguments[0].click();",element);
    }

    public void waitUntilInVisible(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitTextToBePresent(WebElement element,String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));


    }
    public void waitTextNotToBePresent(WebElement element,String text){
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(element,text)));
    }
    public int findWebElementNumberOnPage(List<WebElement> element){

        return element.size();
    }
}