package com.example.demo2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

public class SeleniumExample {
    public static void main(String[] args) {
        // Setup ChromeDriver for Selenium
//        System.setProperty("webdriver.chrome.driver", "D:/demo2/libs/ChromeDriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode (no UI)
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the target URL
            driver.get("https://picarto.tv/chatpopout/panel/public");

            // Wait for the content to load (you may need to add explicit waits)
            Thread.sleep(5000); // Wait 5 seconds for ReactJS to load content (adjust as needed)

            // Find elements by CSS selectors, XPath, etc.
            String pageContent = driver.getPageSource();  // Gets the full HTML content

            // Extract specific information
            System.out.println(pageContent); // Print the page source or parse the content

            // Example: Extracting a specific element
//            String elementText = driver.findElement(By.cssSelector(".some-class")).getText();
//            System.out.println(elementText);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Close the browser
        }
    }

    public static String getHTML() {
        // Setup ChromeDriver for Selenium
        // Setup ChromeDriver for Selenium
//        System.setProperty("webdriver.chrome.driver", "D:/demo2/libs/ChromeDriver");
        String pageContent = new String();  // Gets the full HTML content

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode (no UI)
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the target URL
            driver.get("https://picarto.tv/chatpopout/Zolvatory/public");

            // Wait for the content to load (you may need to add explicit waits)
            Thread.sleep(5000); // Wait 5 seconds for ReactJS to load content (adjust as needed)


            // Find elements by CSS selectors, XPath, etc.
            pageContent = driver.getPageSource();



            // Extract specific information
//            System.out.println(pageContent); // Print the page source or parse the content

            // Example: Extracting a specific element
//            String elementText = driver.findElement(By.cssSelector(".some-class")).getText();
//            System.out.println(elementText);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Close the browser
        }
        return pageContent;
    }
}