import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
//        wd.get("https://demoqa.com/");
        wd.navigate().to("https://demoqa.com/");
    }

    @Test
    public void TestOne(){

    }

    @AfterMethod
    public void postCondition(){

    }

}
