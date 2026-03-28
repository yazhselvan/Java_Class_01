package Inheritance.QARealWorld;

public class BaseTest {
    //WebDriver driver;
    //BaseTest class will usually be inside a Config package
    String driver;

    void setUp(){
        /*
        driver = new ChromeDriver();
        driver initialization
        lauching browser
        initialize report
        timeout
         */
        System.out.println("Launching browser");
    }

    void tearDown(){
        /*
        driver.quit();
        driver.close();
        report.close()
         */
        System.out.println("Browser is closed");
    }
}
