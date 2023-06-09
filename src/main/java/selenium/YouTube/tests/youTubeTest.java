package selenium.YouTube.tests;

import static java.lang.Thread.sleep;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.YouTube.pages.LoginPage;
import selenium.YouTube.pages.PlaylistPage;
import selenium.YouTube.pages.SearchPage;
import selenium.YouTube.pages.PlayerPage;
public class youTubeTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver = base.SeleniumInIt("https://www.youtube.com/");
        SearchPage searchPage = new SearchPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        PlayerPage playerPage = new PlayerPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        loginPage.login("saharcohen1992", "Sc1992!!");
        searchPage.search("ash bonjuk bay");
        playerPage.addToPlaylist();
        playerPage.returnHomePage();
        searchPage.search("יוניקורן");
        playerPage.addToPlaylist();
        playerPage.returnHomePage();
        searchPage.search("טונה ויסמין מועלם - סהרה");
        playerPage.addToPlaylist();
        playerPage.returnHomePage();
        searchPage.search("רז פרי - היום אני שמח");
        playerPage.addToPlaylist();
        playerPage.returnHomePage();
        searchPage.search("תיק קטן");
        playerPage.addToPlaylist();
        playerPage.moveToPlaylistPage();
        playlistPage.startPlaylist();
        sleep(10000); //sleep time to play the playlist
        base.seleniumClose(driver);
    }
}