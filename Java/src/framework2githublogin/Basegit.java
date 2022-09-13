package framework2githublogin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import framework1kitelogin.Utility;

public class Basegit {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void browseropen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Aniket\\Automation\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(Utilitygit.getproperty1("abc"));
	}
}
