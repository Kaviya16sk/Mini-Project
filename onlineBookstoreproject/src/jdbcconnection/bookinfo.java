package jdbcconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
public class bookinfo 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","Kaviya@1607");
			Statement ss=(Statement) con.createStatement();
			ResultSet rs=ss.executeQuery("select * from bookinfo");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"	"+rs.getString(3)+" "+rs.getString(4)+"	");
			}
					
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}