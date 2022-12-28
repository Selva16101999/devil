import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Frames\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		// Find the Xpath of the frame
		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));

		// switch to the frame
		driver.switchTo().frame(frame);

		driver.findElement(By.name("fldLoginUserId")).sendKeys("12345");

		driver.quit();

	}

}
