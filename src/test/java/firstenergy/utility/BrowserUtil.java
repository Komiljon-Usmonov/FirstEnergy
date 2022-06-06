package firstenergy.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtil {


    //  Performs a pause

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //hover over to the element on webpage
    public static void hoverOver(WebElement element){
        new Actions(Driver.getDriver()).moveToElement(element).pause(2000).perform();
    }


     // Scrolls down to an element using JavaScript


    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }



}
