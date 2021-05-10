package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowserTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.x-cart.com/");

        String Title = driver.getTitle();
        System.out.println(Title);
        System.out.println(Title.length());

        boolean VerifyTitle = Title.equals("X-Cart | The Last Ecommerce Platform You Will Ever Need");
        boolean VerifyTitleContains = Title.contains("ever Need");
        System.out.println(VerifyTitle);
        System.out.println(VerifyTitleContains);

        driver.close();


    }

}
