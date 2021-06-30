import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class StepImplementation extends  BaseTest{

    @Step("<id> id li elemente tıkla")
    public void clickById(String id){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.id(id))));
        appiumDriver.findElement(By.id(id)).click();

    }

    @Step("<xpath> xpath li elemente tıkla")
    public void clickByXpath(String xpath){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.xpath(xpath))));
        appiumDriver.findElement(By.xpath(xpath)).click();

    }
    @Step("<id> accessibilityId li elemente tıkla")
    public void  sendKeysToAccessibilityId(String id){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElementByAccessibilityId(id)));
        appiumDriver.findElementByAccessibilityId(id).click();
    }

    @Step("<id> id li elemente <key> degerini yaz")
    public void  sendKeys(String id, String key){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.id(id))));
       appiumDriver.findElement(By.id(id)).sendKeys(key);

    }

    @Step("<xpath> xpath li elemente <key> değerini yaz")
    public void  sendCssKeys(String xpath, String key){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.xpath(xpath))));
        appiumDriver.findElement(By.xpath(xpath)).sendKeys(key);

    }

    @Step("<x> kadar bekle")
    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(1000*x);
    }

}
