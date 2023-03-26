package selenium.YouTube.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static java.lang.Thread.sleep;

public class SearchPage {
    @FindBy(name = "search_query")
    WebElement searchField;
    @FindBy(id = "search-icon-legacy")
    WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"container\"]/ytd-toggle-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")
    WebElement sort;
    @FindBy(xpath = "//ytd-video-renderer[1]")
    WebElement firstVideo;

    public WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Search user flow
    public void search(String searchText) throws InterruptedException {
        searchField.click();
        searchField.clear();
        searchField.sendKeys(searchText);
        searchBtn.click();
        sleep(2000);
        firstVideo.click();
    }
}

