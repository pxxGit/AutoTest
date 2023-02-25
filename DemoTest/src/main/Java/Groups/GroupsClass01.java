package Groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsClass01 {

    public void  student01(){
        System.out.println("GroupsClass01中的student01运行");
    }

    public void  student02(){
        System.out.println("GroupsClass01中的student02运行");
    }
}
