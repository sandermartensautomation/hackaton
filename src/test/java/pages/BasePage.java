package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected final WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    protected void clearAndType(By field, String text) {
        driver.findElement(field).click();
        driver.findElement(field).sendKeys(text);
    }

    protected void click(By element){
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        driver.findElement(element).click();
    }

    protected void getText(By element){
        driver.findElement(element).getText();
    }

    protected void getValue(By element){
        driver.findElement(element).getAttribute("value");
    }

}
