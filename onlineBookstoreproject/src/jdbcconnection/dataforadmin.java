package jdbcconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;
public class dataforadmin {
	public static void main(String[] args) {    
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
				ResultSet rs=ss.executeQuery("select * from adminlogin");
				while(rs.next())
				{
					System.out.println(rs.getString(1)+"||"+rs.getString(2));
				} 
	      	try 
			
			{
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","Kaviya@1607");
				Statement ss2=(Statement) con2.createStatement();
				ResultSet rs2=ss2.executeQuery("select * from cartinfo");
				while(rs2.next())
				{
					System.out.println(rs2.getString(1)+" | "+rs2.getString(2)+" | "+rs2.getString(3));
				}
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","Kaviya@1607");
					Statement ss1=(Statement) con1.createStatement();
					ResultSet rs1=ss1.executeQuery("select * from bookstock");
					while(rs1.next())
					{
						System.out.println(rs1.getString(1)+"||"+rs1.getString(2)+"||"+rs1.getString(3)+"||"+rs1.getString(4)+"||"+rs1.getString(5));
					}
							
				} catch (Exception e)
				{
					System.out.println(e);
				}
			
						
			} catch (Exception e)
	      	{
				System.out.println(e);
			}
		
	} catch (Exception e)
	        {
		System.out.println(e);
	}



}
	 }
	 

