import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","G:\\Software SQA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.phptravels.net/");
		driver.findElement(By.xpath("//li[3]//span[2]")).click();
		driver.findElement(By.xpath("//div[3]/form/div/div/div[1]/div/div/div/span/span[1]/span/span[1]")).click();
		driver.findElement(By.xpath("//span/input")).sendKeys("\"Johor Bahru\"");
		driver.findElement(By.xpath("//span//li[4]")).click();
		driver.findElement(By.xpath("//div[3]/form/div/div/div[2]//input")).click();
		driver.findElement(By.xpath("//section[2]")).click();
		driver.findElement(By.xpath("//div[3]/form//a")).click();
		driver.findElement(By.xpath("//div[3]/form/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]/i")).click();
		driver.findElement(By.xpath("//form//button")).click();
		driver.findElement(By.xpath("//li[6]//a[. = 'Details']")).click();
		driver.findElement(By.xpath("//div[3]/button")).click();
		driver.findElement(By.xpath("//div[2]/div/div/div[1]/div/div/input")).sendKeys("Antar");
		driver.findElement(By.xpath("//div/div/div[1]/div[1]/div[2]/div/div/div[2]//input")).sendKeys("Alam");
		driver.findElement(By.xpath("//div/div[3]/div/div/input")).sendKeys("rafiulantar@gmail.com");
		driver.findElement(By.xpath("//div/div[4]/div/div/input")).sendKeys("01731776465");
		driver.findElement(By.xpath("//div/div[5]//input")).sendKeys("Dhaka");
		driver.findElement(By.xpath("//div[6]/div/div/div/span/span/span")).sendKeys("Bangladesh");
		driver.findElement(By.xpath("//span//li")).click();
		driver.findElement(By.xpath("//div[7]/div/div/div/span/span/span")).sendKeys("Bangladesh");
		driver.findElement(By.xpath("//span//li")).click();
		driver.findElement(By.xpath("//div[2]/div[2]/div/div[2]/input")).sendKeys("Rafiul");
		driver.findElement(By.xpath("//div[2]/div[2]/div/div[3]/input")).sendKeys("Alam");
		driver.findElement(By.xpath("//ul/div[2]//input")).click();
		driver.findElement(By.xpath("//div[4]/div/div//label")).click();
		driver.findElement(By.xpath("//div[5]//button")).click();
		
	}

}
