package googl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String URL=("https://www.google.com/");
		driver.navigate().to(URL);
		driver.navigate().refresh();
		// TODO Auto-generated method stub

	}

}
