package selenium.YouTube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static java.lang.Thread.sleep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PlaylistPage {
    public WebDriver driver;
    public PlaylistPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Playing the playlist
    public void startPlaylist() throws InterruptedException {
        sleep(1000);
        WebElement play = driver.findElement(By.cssSelector("span.style-scope.ytd-thumbnail-overlay-hover-text-renderer"));
        sleep(1000);
        play.click();
    }

}
