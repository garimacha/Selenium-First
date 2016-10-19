import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigateToUrl {

    public static void main(String[] args){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com");
       // WebElement searchBox =

        WebElement searchbox= driver.findElement(By.name("q"));
                searchbox.sendKeys("Hello Darling");
        searchbox.submit();




    }
}
