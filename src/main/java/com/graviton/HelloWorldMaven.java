package com.graviton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldMaven {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Maven!");

       // System.setProperty("webdriver.gecko.driver", "C:\\Users\\JDX\\OneDrive\\Desktop\\Driver\\geckodriver.exe");

      WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new ChromeDriver();

       // WebDriver driver = new FirefoxDriver();
        driver.get("https://apache.org/");
        Thread.sleep(500);

        driver.get("https://brakebread.com/");
        Thread.sleep(500);

        System.out.println("Hello Selenium!");

        driver.get("http://heatclinic.shiftedtech.com/");
        Thread.sleep(500);

       driver.get("https://www.equationmn.com/account/login?return_url=%2Faccount");
       Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div/div/div/header/h1")).click();
        Thread.sleep(500);

        driver.quit();

    }
}
