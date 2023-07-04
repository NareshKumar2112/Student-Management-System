package Student;

import java.util.Scanner;
import java.sql.*;

public class Validator {

	private String Name;
	Scanner s=new Scanner(System.in);
	
	Validator()
	{
		display();
	}
	
	void display()
	{
		System.out.println("Enter the Name");
		Name=s.nextLine();
		try
		{
			Database db=new Database();
			Connection con=db.getConnection();
			PreparedStatement ps1=con.prepareStatement("select * from Userinfo where uname=?");
			ps1.setString(1,Name);
			ResultSet rs=ps1.executeQuery();
			boolean flag=true;
			while(rs.next())
			{
				flag=false;
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			if(flag)
			{
				System.out.println("Sry data is not available");
			}
		}
		catch(Exception e)
		{
			System.out.println("validator.java-->"+e);
		}
		
	}
}
