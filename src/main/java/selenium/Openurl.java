package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Openurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\amira\\Downloads\\chromedriver\\chromedriver.exe");
 ChromeDriver chrome=new ChromeDriver();
chrome.get("https://www.facebook.com");
chrome.findElement(By.cssSelector("id"));
chrome.



	}
	}
