package selenium.YouTube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class PlayerPage {
    @FindBy(css = "#button-shape > button > yt-touch-feedback-shape > div > div.yt-spec-touch-feedback-shape__fill")
    WebElement optionsBtn;
    @FindBy(css = "#items > ytd-menu-service-item-renderer:nth-child(2) > tp-yt-paper-item")
    WebElement addToPlaylistBtn;
    @FindBy(id = "guide-icon")
    WebElement guideBtn;
    @FindBy(id = "logo-icon")
    WebElement homeBtn;
    @FindBy(xpath = "//yt-formatted-string[text()='Selenium']")
    WebElement seleniumPlaylistBtn;

    public WebDriver driver;
    public PlayerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //add videos to playlist
    public void addToPlaylist() throws InterruptedException {
        optionsBtn.click();
        addToPlaylistBtn.click();
        List<WebElement> playlists = driver.findElements(By.id("checkboxContainer"));
        playlists.get(1).click();
        WebElement exitButton = driver.findElement(By.cssSelector("yt-icon[icon='close']"));
        exitButton.click();
    }
    //Return to home page
    public void returnHomePage() {
        homeBtn.click();
    }
    //Move to playlist page
    public void moveToPlaylistPage() {
        guideBtn.click();
        seleniumPlaylistBtn.click();
    }
}
