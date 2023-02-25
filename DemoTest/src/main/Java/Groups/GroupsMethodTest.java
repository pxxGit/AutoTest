package Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupsMethodTest {

    @Test(groups = "server")
    public void test01(){
        System.out.println("服务端组测试方法01");
    }

    @Test(groups = "server")
    public  void test02(){
        System.out.println("服务端组测试方法02");
    }

    @Test(groups = "client")
    public void test03(){
        System.out.println("客户端组测试方法010101");
    }

    @Test(groups = "client")
    public  void test04(){
        System.out.println("客户端组测试方法020202");
    }


    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("在服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("在服务端组运行之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("在客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("在客户端组运行之后运行的方法");
    }
}
