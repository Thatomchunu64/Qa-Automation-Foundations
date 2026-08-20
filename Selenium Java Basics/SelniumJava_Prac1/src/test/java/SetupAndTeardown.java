import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SetupAndTeardown {

    WebDriver driver;


    @BeforeTest
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }


    public void adminLogin() throws InterruptedException {
        System.out.println("Beginning admin login");

        driver.findElement(By.xpath("//*[@id=\"login-toggle\"]")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("login-email")).sendKeys("demonslayer@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Hashira@2026");
        Thread.sleep(2000);

        driver.findElement(By.id("login-submit")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[2]")
                )
        );

    }


    public void verifyUser(String email) throws InterruptedException {
        System.out.println("Starting verifyUser");

        Thread.sleep(2000);

        System.out.println("Trying to open menu");
        driver.findElement(By.xpath("//div[3]/div/button/span[3]")).click();//Menu dropdown
        System.out.println("Menu opened");


        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[4]/span[2]")).click();//admin nav
        Thread.sleep(2000);
        System.out.println("Navigated to admin");


        //Approvals tab
        System.out.println("nav to approvals tab");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[2]/nav/button[3]")).click();
        Thread.sleep(1000);

        System.out.println("search user");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[2]/div/div/input")).sendKeys(email);//search for username
        Thread.sleep(2000);

        //approve searched user
        System.out.println("approve searched user");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[3]/table/thead/tr/th[1]/input")).click();
        driver.findElement(By.xpath("//button[contains(.,'✓ Approve Selected (1)')]")).click();
        Thread.sleep(1000);

        System.out.println("User Approved");


    }


    @AfterTest
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }


}
