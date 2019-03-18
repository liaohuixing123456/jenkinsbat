package openbaidu;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class openbaidu {
	public static WebDriver driver;
	  public static String url;
	  @Test
	  public static void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		  driver = new ChromeDriver();
	    url = "https://www.baidu.com";
	    driver.get(url);
}}
