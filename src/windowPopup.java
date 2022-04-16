import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://the-internet.herokuapp.com");
//		driver.findElement(By.xpath("//a[contains(text(), 'Basic Auth')]")).click();
	
		driver.get("http://admin:admin@the-internet.herokuapp.com");
		driver.findElement(By.linkText("Basic Auth")).click();
		System.out.println(driver.findElement(By.cssSelector("p")).getText());

	}

}