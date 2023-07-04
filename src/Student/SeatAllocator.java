package Student;

import java.util.*;
import java.sql.*;

public class SeatAllocator {

	private Connection con;
	
	SeatAllocator()
	{
		ResultGenerator rs=new ResultGenerator();
		displayResult();
	}
	
	
	public void displayResult()
	{
		try
		{
			Database db=new Database();
			con=db.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from result");
			while(rs.next())
			{
				String name=rs.getString(3);
				String pre=rs.getString(2);
				String finalSeat=rs.getString(1);
				
				System.out.print(name);
				
				for(int i=name.length();i<15;i++)
				{
					System.out.print(" ");
				}
				
				System.out.print(pre);
				
				for(int i=pre.length();i<7;i++)
				{
					System.out.print(" ");
				}
				
				System.out.print(finalSeat);
				
				for(int i=pre.length();i<7;i++)
				{
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("SeatAlloaction.java-->"+e);
		}
	}
}
