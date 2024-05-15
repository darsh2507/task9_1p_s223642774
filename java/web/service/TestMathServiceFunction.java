package web.service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;


public class TestMathServiceFunction {
	
	 private WebDriver driver; 
	 @Test
	    public void testLoginSuccess() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://localhost:8080/login");
	        WebElement usernameInput = driver.findElement(By.id("username"));
	        WebElement passwordInput = driver.findElement(By.id("passwd"));
	        WebElement dobInput = driver.findElement(By.id("dob"));
	        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
	        usernameInput.sendKeys("ahsan");
	        passwordInput.sendKeys("ahsan_pass");
	        dobInput.sendKeys("1990-01-01"); 
	        submitButton.click();
	        String currentUrl = driver.getCurrentUrl();
	        assertTrue(currentUrl.endsWith("/q1"));
	    }
	  
	 public void testAdditionWithValidInput() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	        driver.get("http://localhost:8080/login");
	        WebElement number1Input = driver.findElement(By.id("number1"));
	        WebElement number2Input = driver.findElement(By.id("number2"));
	        WebElement resultInput = driver.findElement(By.id("result"));
	        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
	        number1Input.sendKeys("5");
	        number2Input.sendKeys("3");
	        submitButton.click();
	        String expectedResult = "8.0";
	        assertEquals(expectedResult, resultInput.getAttribute("value"));
	        String currentUrl = driver.getCurrentUrl();
	        assertTrue(currentUrl.endsWith("/q2"));
		 
	    }
	 
	 public void testSubstractionWithValidInput() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	        driver.get("http://localhost:8080/q2");
	        WebElement number1Input = driver.findElement(By.id("number1"));
	        WebElement number2Input = driver.findElement(By.id("number2"));
	        WebElement resultInput = driver.findElement(By.id("result"));
	        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
	        number1Input.sendKeys("5");
	        number2Input.sendKeys("3");
	        submitButton.click();
	        String expectedResult = "2.0";
	        assertEquals(expectedResult, resultInput.getAttribute("value"));
	        String currentUrl = driver.getCurrentUrl();
	        assertTrue(currentUrl.endsWith("/q3"));
	    }
	 
	 public void testMultiplywithValidInput()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	        driver.get("http://localhost:8080/q3");
	        WebElement number1Input = driver.findElement(By.id("number1"));
	        WebElement number2Input = driver.findElement(By.id("number2"));
	        WebElement resultInput = driver.findElement(By.id("result"));
	        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
	        number1Input.sendKeys("5");
	        number2Input.sendKeys("3");
	        submitButton.click();
	        String expectedResult = "15.0";
	        assertEquals(expectedResult, resultInput.getAttribute("value"));
	        String currentUrl = driver.getCurrentUrl();
	        assertTrue(currentUrl.endsWith("/q3"));
	 }
	 
	 
}
