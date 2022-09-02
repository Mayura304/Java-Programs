package actionclass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\software Testing\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("India");
		List<WebElement> sugestions = driver.findElements(By.xpath("//*[@class='pcTkSc']//span[text()='india']"));
		Thread.sleep(2000);
		for(WebElement sugest:sugestions)
		{
			String each_sugest = sugest.getText();
			System.out.println(each_sugest);
			if(each_sugest.contains("India Post"))
			{
				sugest.click();
				break;
			}
		}

	}

}
