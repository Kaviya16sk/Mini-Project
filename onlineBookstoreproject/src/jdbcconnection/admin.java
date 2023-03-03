package jdbcconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	
	        String username, password;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter username:");//username:user
	        username = s.nextLine();
	        System.out.print("Enter password:");//password:user
	        password = s.nextLine();
	        if(username.equals("user") && password.equals("user"))
	        {
	            System.out.println("Authentication Successful");
	        }
	        else
	        {
	            System.out.println("Authentication Failed");
	        }
	        try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","Kaviya@1607");
				Statement ss=(Statement) con.createStatement();
				ResultSet rs=ss.executeQuery("select * from bookstock");
				while(rs.next())
				{
					System.out.println(rs.getString(1)+"||"+rs.getString(2)+"||"+rs.getString(3)+"||"+rs.getString(4)+"	");
				}
						
			} catch (Exception e) {
				System.out.println(e);
			}
	    }
	

	}


