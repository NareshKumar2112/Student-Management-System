package Student;
import java.util.*;
import java.rmi.AccessException;
import java.sql.*;

public class ResultGenerator {
	
	private Connection con;
	
	ResultGenerator()
	{
		Allocatecourse();
	}
	
	public void Allocatecourse()
	{
		Database db=new Database();
		con=db.getConnection();
		try
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Marks m,Userinfo u where m.name=u.uname order by totalmark desc");
			String pre="",name="";
			int seat=0;
			while(rs.next())
			{
				pre=rs.getString(9);
				name=rs.getString(6);
				PreparedStatement ps=con.prepareStatement("select * from seats");
				int h=3;
				if(pre.equals("it"))
				{
					h=1;
				}
				else if(pre.equals("cse"))
				{
					h=2;
				}
				ResultSet rs1=ps.executeQuery();
				while(rs1.next())
				{
					seat=rs1.getInt(h);
				}
				StoreData(pre,name,seat);
		}
		}
		catch(Exception e)
		{
			System.out.println("ResultGenerator .java-->"+e);
		}
	}
	public void StoreData(String pre,String name,int seat) 
	{
		try
		{
		PreparedStatement ps1=con.prepareStatement("insert into result values(?,?,?)");
		ps1.setString(2,pre);
		ps1.setString(3,name);
		if(seat>0)
		{
			ps1.setString(1,pre);
			PreparedStatement ps2=con.prepareStatement("update seats set "+pre+" = ?");
			seat=seat-1;
			ps2.setInt(1,seat);
			ps2.executeUpdate();
		}
		else
		{
			ps1.setString(1,"-");
		}
		ps1.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("ResultGenerator.java-->"+e);
		}
	}
}
