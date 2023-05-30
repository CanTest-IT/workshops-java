package it.canTest;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.pl");
        try {
            //to sie wykona zawsze
            driver.findElement(By.cssSelector(".cokolwiek")).click();
        }catch(NotFoundException nfe){
            //to sie wykona jesli poleci wyjatek
            System.out.println("Nie bylo dziada!"+nfe);
        }finally {
            //to sie wykona zawsze
            driver.quit();
        }

        
        
    }
}
