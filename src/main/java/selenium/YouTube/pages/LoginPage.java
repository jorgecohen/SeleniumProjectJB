package selenium.YouTube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static java.lang.Thread.sleep;

public class LoginPage {
    @FindBy(name = "identifier")
    WebElement userName;
    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
    WebElement nextBtn;
    @FindBy(name = "Passwd")
    WebElement pw;
    @FindBy(className = "VfPpkd-muHVFf-bMcfAe")
    WebElement showPw;
    @FindBy (xpath = "//*[@id=\"passwordNext\"]/div/button/span")
    WebElement nextBtn2;

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // User login flow
    public void login(String userText, String pwText) throws InterruptedException {
        sleep(1000);
        WebElement loginBtn = driver.findElement(By.cssSelector("a[href*='ServiceLogin']"));
        loginBtn.click();
        sleep(1000);
        userName.click();
        userName.clear();
        userName.sendKeys(userText);
        sleep(1000);
        nextBtn.click();
        sleep(1000);
        pw.click();
        pw.clear();
        pw.sendKeys(pwText);
        showPw.click();
        sleep(2000);
        nextBtn2.click();
    }
}