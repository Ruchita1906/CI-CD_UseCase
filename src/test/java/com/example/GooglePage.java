package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogle() {
        driver.get("https://www.google.com");
    }

    public void search(String query) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(query);
        searchBox.submit();
    }
}
