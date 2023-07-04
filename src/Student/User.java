package Student;

import java.util.*;
import java.sql.*;
public class User extends Checker {

	Scanner s=new Scanner(System.in);
	Student st;
	
	User()
	{
		GetDetails();
	}
	
	
	public void GetDetails()
	{
		System.out.println("Enter Name");
		String Name=s.next();
		s.nextLine();
		
		System.out.println("Enter phoneNumber");
		String PhoneNo=s.next();
		
		System.out.println("Enter Emailid");
		String Email=s.next();
		
		System.out.println("Enter physics mark");
		int PhyMark=s.nextInt();
		
		System.out.println("Enter chemistry mark");
		int CheMark=s.nextInt();
		
		System.out.println("Enter maths mark");
		int MathsMark=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter the course preferences");
		String course=s.nextLine();
		
		if(isName(Name)&&isPhoneNumber(PhoneNo)&&isEmail(Email)&&isDept(course))
		{
			 st=new Student(Name,PhoneNo,Email,PhyMark,CheMark,MathsMark,course);
			 addDetails();
		}
		else
		{
			System.out.println("Enter the valid details");
			GetDetails();
			addDetails();
			System.exit(0);
		}
	}
	
	
	public void addDetails()
	{
		Database db=new Database();
		Connection con=db.getConnection();
		insertInfo(con);
		insertMark(con);
	}
	
	
	public void insertInfo(Connection con)
	{
		try
		{
			PreparedStatement ps1=con.prepareStatement("insert into Userinfo values(?,?,?,?)");
			
			ps1.setString(1,st.getName());
			ps1.setString(2,st.getPhoneNo());
			ps1.setString(3,st.getEmail());
			ps1.setString(4,st.getPre_course());
			System.out.println();
			ps1.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("user.java-->"+e);
		}
		
	}
	public void insertMark(Connection con)
	{
		try
		{
			PreparedStatement ps2=con.prepareStatement("insert into Marks values(?,?,?,?,?)");
			
			ps2.setInt(1,st.getPhyMark());
			ps2.setInt(2,st.getCheMark());
			ps2.setInt(3,st.getMathsMark());
			int total=st.getCheMark()+st.getPhyMark()+st.getMathsMark();
			ps2.setFloat(4,(total/3));
			ps2.setString(5,st.getName());
			ps2.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("user.java-->"+e);
		}
		
	}
	 
}
