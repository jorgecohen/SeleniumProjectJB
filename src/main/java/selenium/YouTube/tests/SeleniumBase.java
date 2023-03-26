package selenium.YouTube.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBase {


    public ChromeDriver SeleniumInIt(String url) {

        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*"); //fix for chrome driver version 111
        WebDriverManager.chromedriver();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        return driver;
    }
    public void seleniumClose(ChromeDriver driver) {
        driver.close();
    }
}
