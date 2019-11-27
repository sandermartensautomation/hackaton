package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Popup extends BasePage {


    private By btnNext = By.xpath("//div[@class='popup-content']//button[@id='next']");

    public Popup(WebDriver driver){
        super(driver);
    }

    public void clickNext(){
        click(btnNext);
    }



}
