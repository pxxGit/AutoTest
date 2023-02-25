package Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite    //测试套件之前的内容执行
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件执行啦");
    }

    @AfterSuite     //测试套件之后的内容执行
    public void afterSuite(){
        System.out.println("afterSuite测试套件执行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest执行");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest执行");
    }
}
