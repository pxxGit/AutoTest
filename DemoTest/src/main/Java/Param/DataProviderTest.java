package Param;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "dataTest")
    public void dataProviderTest(String testName,int testAge){
        System.out.println(testName+","+testAge);
    }

    @DataProvider(name = "dataTest")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
                {"阿珍",18},
                {"阿强",20},
                {"阿达",33},
        };
        return o;
    }


//    public static void main(String[] args) {
//        System.out.println("==============================");
//    }






}
