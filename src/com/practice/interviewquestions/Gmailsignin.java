//Set up Selenium Env and automate the login process of gmail login.


package com.practice.interviewquestions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Gmailsignin {

	public static void main(String[] args) {
		// Launch the chrome browser
				// WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

				// Create the object for chrome driver browser
				WebDriver driver = new ChromeDriver();

				// Opening the WebPage
				driver.get("https://www.google.com/gmail/");

				// Maximizing the Browser
				driver.manage().window().maximize();

				// Implicit wait specifies the amount of time the driver should wait when
				// searching for an element if it is not immediately present.
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				WebDriverWait wait = new WebDriverWait(driver, 20);

				// Sign in to google
				WebElement emailTextField = driver.findElement(By.xpath("//input[@type='email']"));
				emailTextField.sendKeys("Add ur Email");

				// Click on Next Button
				WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
				nextButton.click();

				// Enter Your Password
				WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='password']"));
				passwordTextField.sendKeys("Add your password");

				// Click on Next Button
				WebElement passwordNextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
				passwordNextButton.click();

				// Wait for the presence of Compose element on the page
				wait.until(ExpectedConditions.presenceOfAllElementLocatedBy(By.xpath("//div[contains(text(),'Compose')]")));

				// Close the driver
				driver.close();

			}

		}

		


