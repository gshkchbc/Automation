import org.openqa.selenium.WebDriver;

public class DriverManager {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getdriver(){

        return driver.get();
    }
    public static void setdriver(WebDriver driverref){

        driver.set(driverref);
    }

    public static void unload(){

        driver.remove();
    }
}
