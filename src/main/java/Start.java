import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
class Start {
	static String base = "http://codestar.work:3000";
	
	public static void main(String[] data) throws Exception {
		test1();
		
	}
	public static void test1() throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get(base + "/user-login");
		Thread.sleep(5000);
		WebElement element;
		element = driver.findElement(By.name("email"));
		element.sendKeys("kookiatsuetrong@gmail.com");
		element = driver.findElement(By.name("password"));
		element.sendKeys("P@ssw0rd");
		element.submit();
		Thread.sleep(5000);
		String current = driver.getCurrentUrl();
		if (current.equals(base + "/user-home")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		driver.close();
	}
}
