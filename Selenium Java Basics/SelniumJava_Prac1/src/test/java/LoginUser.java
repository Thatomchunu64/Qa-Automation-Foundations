import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class LoginUser extends SetupAndTeardown {

    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("login-email")).sendKeys("dragonball@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Saiyan@26");
        Thread.sleep(1000);

        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[2]")).isDisplayed();
        Thread.sleep(2000);
        System.out.println("LOGIN TEST SUCCEEDED");


    }
}
