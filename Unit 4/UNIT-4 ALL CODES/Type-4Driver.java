//Example of Type4 Database Driver:
/*
Before running this code: There should be a table present in MYSQL database that should have the name Table1
In Table1 there should be two columns 1st columns should contain usernames and
2nd column should contain passwords.
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MyDBtype4Test 
{
    public static void main(String arg[])
    {
        Connection con=null;
        try
        {
            Scanner sc=new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("com.mysql.cj.jdbc.Driver"); //for mysql 8.0 onwards
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            Statement stmt=con.createStatement();
            String sql="";
            for(int i=1;i<=3;i++)
            {
                System.out.println("Enter Username: ");
                String un=sc.next();
                System.out.println("Enter Password: ");
                String ps=sc.next();
                sql="INSERT INTO Table1 VALUES('"+un+"','"+ps+"')";
                stmt.execute(sql);
            }
            System.out.println("=====Database Contents=====");
            sql="SELECT * FROM Table1";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String un2=rs.getString(1);
                String ps2=rs.getString(2);
                System.out.println("Username: "+un2+" Password: "+ps2);
            }
        }catch(Exception ex){System.err.println(""+ex);}
        finally{try{con.close();}catch(Exception ex){}}
    }
}
