//Association

class Employee
{
    private String empname;
    private String empid;
    public void fill(String en,String eid){ empname=en; empid=eid; }
    public void show(){ System.out.println("EmpName: "+empname+" EmpId: "+empid); }
}
class Organization
{
    Employee emp[]=new Employee[3];
    public void fill(){
        for(int i=0;i<3;i++)
        {
            emp[i]=new Employee();
            emp[i].fill("EmpName"+i,"  EmpId"+i);
        }
    }
    public void show(){
        for(int i=0;i<3;i++)
        {
            emp[i].show();
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
      Organization o1=new Organization();
      o1.fill();
      o1.show();
    }
}

/*
Output:
EmpName: EmpName0   EmpId:   EmpId0
EmpName: EmpName1   EmpId:   EmpId1
EmpName: EmpName2   EmpId:   EmpId2
*/
