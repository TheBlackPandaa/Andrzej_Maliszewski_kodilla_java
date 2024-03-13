package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//*[@data-cookiebanner=\"accept_button\"]")).click();

        driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();

        Thread.sleep(1000);

        Select birthDay = new Select(driver.findElement(By.xpath("//*[@name=\"birthday_day\"]")));
        birthDay.selectByValue("1");

        Select birthMonth = new Select(driver.findElement(By.xpath("//*[@name=\"birthday_month\"]")));
        birthMonth.selectByValue("6");

        Select birthYear = new Select(driver.findElement(By.xpath("//*[@name=\"birthday_year\"]")));
        birthYear.selectByValue("1996");
    }
}
