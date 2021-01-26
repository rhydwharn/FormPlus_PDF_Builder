package OfflineCreate;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Create_Offline_PDF {

    private WebDriver driver;

    public void setUp() throws InterruptedException
    {
        String os = System.getProperty("os.name").toLowerCase();

        //choose the driver base on the operating system in use (MAC OS / Windows OS)
        if(os.contains("mac")){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        }
        else{
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        }

        //Instantiate the chrome driver
        driver = new ChromeDriver();
        //Enter the URL for test
        driver.get("https://pdf.formpl.us/");
        //Wait for 5secs
        Thread.sleep(5000L);
        //Maximize the window
        driver.manage().window().maximize();
        //Display the Title of the URL in Console
        System.out.println(this.driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        //Add Title
        driver.findElement(By.xpath("//input[@placeholder='Add PDF Title']")).sendKeys("Ridwan Test PDF");

        //Add Name input field
        driver.findElement(By.xpath("/html//div[@id='pdf-root']//span[.='Controls']")).click();
        driver.findElement(By.xpath("//p[text()='Short text']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[@class=' css-stevrt-ButtonIcon e5710yz2']//img)[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Full name");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter help text']")).sendKeys("First name first");
        Thread.sleep(3000);
        driver.findElement(By.className("control-toggle-label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(3000);

        //Add Email field
        driver.findElement(By.xpath("/html//div[@id='pdf-root']//span[.='Controls']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[text()='Email']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(@class,'email css-18dvil7-PageFieldWrapper')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//img[@src='data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTUiIGhlaWdodD0iMTUiIHZpZXdCb3g9IjAgMCAxNSAxNSIgZmlsbD0ibm9uZSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KPHBhdGggZD0iTTEwLjgzNDQgMS41NDMxNEMxMS4wMDY2IDEuMzcwOTQgMTEuMjExIDEuMjM0MzUgMTEuNDM2IDEuMTQxMTZDMTEuNjYxIDEuMDQ3OTYgMTEuOTAyMSAxIDEyLjE0NTYgMUMxMi4zODkxIDEgMTIuNjMwMyAxLjA0Nzk2IDEyLjg1NTMgMS4xNDExNkMxMy4wODAyIDEuMjM0MzUgMTMuMjg0NyAxLjM3MDk0IDEzLjQ1NjkgMS41NDMxNEMxMy42MjkxIDEuNzE1MzMgMTMuNzY1NyAxLjkxOTc2IDEzLjg1ODggMi4xNDQ3NEMxMy45NTIgMi4zNjk3MyAxNCAyLjYxMDg2IDE0IDIuODU0MzlDMTQgMy4wOTc5MSAxMy45NTIgMy4zMzkwNCAxMy44NTg4IDMuNTY0MDNDMTMuNzY1NyAzLjc4OTAxIDEzLjYyOTEgMy45OTM0NCAxMy40NTY5IDQuMTY1NjNMNC42MDU5MyAxMy4wMTY2TDEgMTRMMS45ODM0NCAxMC4zOTQxTDEwLjgzNDQgMS41NDMxNFoiIGZpbGw9IndoaXRlIiBzdHJva2U9IiNFODNDMjYiIHN0cm9rZS1saW5lY2FwPSJyb3VuZCIgc3Ryb2tlLWxpbmVqb2luPSJyb3VuZCIvPgo8L3N2Zz4K'])[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("control-toggle-label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(4000);

        //Add Name Phone number field
        driver.findElement(By.xpath("/html//div[@id='pdf-root']//span[.='Controls']")).click();
        driver.findElement(By.xpath("//p[text()='Phone Number']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[3]/div[2]/button[1]/img[@alt='button icon']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@placeholder='Enter country code']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter country code']")).sendKeys("+234");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(3000);

        //Add Email field
        driver.findElement(By.xpath("/html//div[@id='pdf-root']//span[.='Controls']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[text()='Long text']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[4]/div[2]/button[1]/img[@alt='button icon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Home Address");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter help text']")).sendKeys("Enter full address");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(3000);

        //Customize the PDF page
        driver.findElement(By.xpath("/html//div[@id='pdf-root']//span[.='Controls']")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//p[text()='Customise']")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//div[text()='Side']")).click();
        Thread.sleep(5000);


        //Download PDF File
        driver.findElement(By.xpath("//button[text()='Download PDF']")).click();

        //Display that the PDF was downloaded Successfully
        System.out.println("PDF Downloaded Successfully");

        Thread.sleep(5000);

        //Display successfully completed message
        System.out.println("Test completed, the chrome driver will quit now. Thanks");

        //Quit Chrome driver
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        Create_Offline_PDF CreatePDF = new Create_Offline_PDF();
        CreatePDF.setUp();
    }
}
