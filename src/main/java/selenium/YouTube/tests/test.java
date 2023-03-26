package selenium.YouTube.tests;

import static java.lang.Thread.sleep;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.YouTube.pages.LoginPage;
import selenium.YouTube.pages.PlaylistPage;
import selenium.YouTube.pages.SearchPage;
import selenium.YouTube.pages.PlayerPage;

public class test {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.SeleniumInIt("https://www.youtube.com/");
        SearchPage searchPage = new SearchPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PlayerPage playerPage = new PlayerPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        sleep(2000);
        loginPage.login("saharcohen1992", "Sc1992!!");
        sleep(2000);
        searchPage.search("ash bonjuk bay");
        sleep(1000);
        playerPage.addToPlaylist();
        sleep(500);
        playerPage.returnHomePage();
        sleep(1000);
        searchPage.search("כנפיים (Live)");
        sleep(1000);
        playerPage.addToPlaylist();
        sleep(500);
        playerPage.returnHomePage();
        sleep(1000);
        searchPage.search("טונה ויסמין מועלם - סהרה");
        sleep(1000);
        playerPage.addToPlaylist();
        sleep(500);
        playerPage.returnHomePage();
        sleep(1000);
        searchPage.search("רז פרי - היום אני שמח");
        sleep(1000);
        playerPage.addToPlaylist();
        sleep(500);
        playerPage.returnHomePage();
        sleep(1000);
        searchPage.search("לב בוגרשוב");
        sleep(1000);
        playerPage.addToPlaylist();
        sleep(500);
        playerPage.moveToPlaylistPage();
        sleep(1000);
        playlistPage.startPlaylist();
        sleep(20000);
        base.seleniumClose(driver);
    }
}