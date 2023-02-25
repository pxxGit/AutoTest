package Groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsClass03 {
    public void  teacher01(){
        System.out.println("GroupsClass03中的teacher01运行");
    }

    public void  teacher02(){
        System.out.println("GroupsClass03中的teacher02运行");
    }
}
