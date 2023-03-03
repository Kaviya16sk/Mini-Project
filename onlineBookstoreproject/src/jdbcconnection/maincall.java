package jdbcconnection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.jdbc.Statement;
public class maincall {
	public void userinformation()
	{
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
			System.out.println("****LOGIN DETAILS FOR USER****");
			ResultSet rs=ss.executeQuery("select * from logininfo");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"||"+rs.getString(2)+"||"+rs.getString(3)+"||"+rs.getString(4)+"||"+rs.getString(5));
			} 
      	try 
		
		{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","Kaviya@1607");
			Statement ss2=(Statement) con2.createStatement();
			System.out.println("****BOOK CATEGORY DETAILS FOR USER****");
			ResultSet rs2=ss2.executeQuery("select * from bookcateogry");
			while(rs2.next())
			{
				System.out.println(rs2.getString(1)+" | "+rs2.getString(2)+" | "+rs2.getString(3));
			}
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","Kaviya@1607");
				Statement ss1=(Statement) con1.createStatement();
				System.out.println("****BOOK DETAILS FOR ADMIN****");
				ResultSet rs1=ss1.executeQuery("select * from bookinfo");
				while(rs1.next())
				{
					System.out.println(rs1.getString(1)+"||"+rs1.getString(2)+"||"+rs1.getString(3)+"||"+rs1.getString(4));
				}
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore","root","Kaviya@1607");
					Statement ss3=(Statement) con3.createStatement();
					System.out.println("****CART DETAILS FOR USER****");
					ResultSet rs3=ss3.executeQuery("select * from shoppingcart");
					while(rs3.next())
					{
						System.out.println(rs3.getString(1)+"||"+rs3.getString(2)+"||"+rs3.getString(3)+"||"+rs3.getString(4)+"||"+rs3.getString(5));
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
		} catch (Exception e)
		{
			System.out.println(e);
		}

    }

public void  admin()
{
	String username, password;
    Scanner s1 = new Scanner(System.in);
    System.out.print("Enter username:");//username:user
    username = s1.nextLine();
    System.out.print("Enter password:");//password:user
    password = s1.nextLine();
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
		System.out.println("****LOGINDETAILS****");
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
		System.out.println("****CARTDETAILS FOR ADMIN****");
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
			System.out.println("****STOCKDETAILS FOR ADMIN****");
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

	public static void main(String[] args) {
		
		System.out.println("Welcome to online Bookstore");	
		Scanner scan = new Scanner(System.in);
		
	//	System.out.println("N");
		
		maincall mc=new maincall();
		mc.userinformation();
		mc.admin();
	

	}

}
