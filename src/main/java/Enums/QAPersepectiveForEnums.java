package Enums;

//Why object creation for class that implements interface is not recommended?
//ChromeDriver driver = new ChromeDriver(); --> Tight coupling
//ChromeDriver implements WebDriver
//Loose Coupling --> Interface objectName = new classname();


enum Browser{
    CHROME, SAFARI, FIREFOX, OPERA;
}
public class QAPersepectiveForEnums {
    //WebDriver driver = new ChromeDriver();
    public String getDriver(Browser browser){
          //WebDriver
        switch (browser){
            case CHROME:
                return "ChromeDriver";
                        //new ChromeDriver();

            case FIREFOX:
                return "FireFoxDriver";
                        //new FireFoxDriver();

            case SAFARI:
                return "SafariDriver";

            default:
                return "Invalid Browser object";
        }
    }

    static void main() {
        QAPersepectiveForEnums q = new QAPersepectiveForEnums();
        String driver = q.getDriver(Browser.CHROME);
        System.out.println(driver);
    }
}
