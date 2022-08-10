import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class StepImplementation extends BaseTest {


  /*  @Step(" <cssCookie> ile Cookie Kapatilir")
    public void shutDownCookie(String cssCookie) {
        driver.findElement(By.cssSelector(cssCookie)).click();
    }
*/
    @Step("<id> id li elemente tıkla")
    public void clickById(String id) {
        driver.findElement(By.id(id)).click();
        System.out.println("Elemente tıklandı ...");

    }


    @Step("<css> css li elemente tıkla")
    public void clickByCss(String css) {
        driver.findElement(By.cssSelector(css)).click();
        System.out.println("Elemente tıkladı ...");

    }


    @Step("<x> saniye kadar bekle")
    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(1000 * x);

    }


    @Step("<jsCss> kaydırmak ve tıklamak için css li elemente git")
    public void clickByJsCss(String jsCss) {
        WebElement n = driver.findElement(By.cssSelector(jsCss));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", n);

    }

    @Step("<key> css li element <text> değerini  içerdiğini kontrol et")
    public void CheckElement(String key, String text) {
     driver.findElement(By.cssSelector(key)).getText().equals(text);
    }

    @Step("<key> css li element <text> değeri girilir")
    public void sendKeyElement(String key, String text) {
        driver.findElement(By.id(key)).sendKeys(text);
    }

}


