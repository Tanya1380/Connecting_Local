import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class VerifySearch {

	
	
	public static void main(String[] args) { 
	// Set the path to the chromedriver executable 
	 
	// Initialize a new ChromeDriver instance 
	WebDriver driver = new ChromeDriver(); 
	// Navigate to the webpage 
	driver.get("https://www.demo.opencart.com"); 
	//Searching in the search box
	driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Search Box");
	System.out.println("Search Box Clicked");
	// Close the browser 
	//driver.quit(); 
} 
}