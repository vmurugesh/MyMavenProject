package mymavenpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seltestcase {

    @Test
    public void testsel(){

        WebDriverManager.edgedriver().setup();
        WebDriver wd = new EdgeDriver();
        wd.manage().window().maximize();

        wd.get("https://opensource-demo.orangehrmlive.com/");

        wd.findElement(By.id("txtUserName")).sendKeys("Admin");
        wd.findElement(By.id("txtPassword")).sendKeys("admin123");
        wd.findElement(By.id("btnclick")).click();

        Assert.assertEquals(wd.getTitle(), "OrangeHRM");

        wd.close();
    }


}

