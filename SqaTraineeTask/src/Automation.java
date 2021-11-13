import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:\\Software SQA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.phptravels.net/");

	}

}
