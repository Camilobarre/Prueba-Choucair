import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practica {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/ChromeDriver/chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testGooglePAge() {
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.clear();
		searchbox.sendKeys("Hola Mundo");
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		assertequals("Hola Mundo", driver.getTitle());		
	}
	

	@After
	public void teardown() {
		driver.quit();
	}
	
	private void assertequals(String string, String title) {
		// TODO Auto-generated method stub
		
	}

	
}
