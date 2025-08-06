package com.example;

import org.junit.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        GooglePage google = new GooglePage(driver);
        google.openGoogle();
        google.search("Selenium WebDriver tutorial");
    }
}
