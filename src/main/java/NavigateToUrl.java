import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by garich01 on 10/18/2016.
 */
public class NavigateToUrl {

    public static void main(String[] args){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com");



    }
}
