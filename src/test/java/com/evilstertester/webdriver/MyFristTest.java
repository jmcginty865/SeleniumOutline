package com.evilstertester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jennifermcginty on 7/19/17.
 */
public class MyFristTest {

    @Test
    public void startWebDriver(){

        System.setProperties("webdriver.gecko.driver", "/User/jennifermcginty/Downloads/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://www.google.com");

        Assert.assertTrue("Title should start with google",
                driver.getTitle().startsWith("Google"));


    }
}
