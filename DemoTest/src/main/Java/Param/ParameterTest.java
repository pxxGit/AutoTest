package Param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"testName","testAge"})
    public void parameterTest01(String testName , int testAge){
        System.out.println(testName+" , "+testAge);
    }
}
