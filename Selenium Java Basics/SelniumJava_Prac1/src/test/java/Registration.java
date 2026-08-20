import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration extends SetupAndTeardown {

    @Test
    public void Signup() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("signup-toggle")).click();
        driver.findElement(By.id("register-firstName")).sendKeys("Prince");
        driver.findElement(By.id("register-lastName")).sendKeys("Vegeta");
        driver.findElement(By.id("register-email")).sendKeys("dragonball@gmail.com");
        driver.findElement(By.id("register-password")).sendKeys("Saiyan@26");
        driver.findElement(By.id("register-confirmPassword")).sendKeys("Saiyan@26");

        Thread.sleep(2000);
        Select groupSelect = new Select(driver.findElement(By.id("register-group")));
        groupSelect.selectByVisibleText("2nd Group 2026 (2026)");
        Thread.sleep(2000);

        driver.findElement(By.id("register-submit")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();//Accept something from an Alert
        Thread.sleep(1000);

        adminLogin();

        System.out.println("Admin login completed");

        verifyUser("dragonball@gmail.com");

        System.out.println("User verification completed");

        System.out.println("-------------------------------------");
        System.out.println("REGISTRATION TEST COMPLETE");

    }


}
