package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        this.driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
    }

    @AfterEach
    public void teardown() {
        this.driver.quit();
    }

    @Order(1)
    @Test
    public void shouldTestTitleOfHomePage() {
        driver.get("https://selenium.dev");
        String title = driver.findElement(By.xpath("//*[@id=\"td-cover-block-0\"]/div/div/div/div/h1")).getText();
        Assertions.assertEquals("Selenium automates browsers. That's it!", title);
    }

    @Order(2)
    @Test
    public void shouldTestTitleOfDownloadsPage() {
        driver.get("https://www.selenium.dev/downloads/");
        String title = driver.findElement(By.xpath("//*[@id=\"td-cover-block-0\"]/div/div/div/div/h1")).getText();
        Assertions.assertEquals("Downloads", title);
    }

    @Order(3)
    @Test
    public void shouldTestTitleOfSeleniumProjectsPage() {
        driver.get("https://www.selenium.dev/projects/");
        String title = driver.findElement(By.xpath("//*[@id=\"td-cover-block-0\"]/div/div/div/div/h1")).getText();
        Assertions.assertEquals("Selenium Projects", title);
    }
}
