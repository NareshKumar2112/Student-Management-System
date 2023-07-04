package Student;

import java.util.*;

public class Student {

	private String Name;
	private String PhoneNo;
	private String Email;
	private int PhyMark;
	private int CheMark;
	private int MathsMark;
	private String Pre_course;
	
		Student(String Name,String PhoneNo,String Email,int PhyMark,int CheMark,int MathsMark,String Pre_course)
		{
		this.Name=Name;
		this.PhoneNo=PhoneNo;
		this.Email=Email;
		this.PhyMark=PhyMark;
		this.CheMark=CheMark;
		this.MathsMark=MathsMark;
		this.Pre_course=Pre_course;
		}
	
		public String getName() 
		{
			return Name;
		}
		
		public void setName(String name) 
		{
			Name = name;
		}
		
		public String getPhoneNo() 
		{
			return PhoneNo;
		}
		
		public void setPhoneNo(String phoneNo) 
		{
			PhoneNo = phoneNo;
		}
		
		public String getEmail() 
		{
			return Email;
		}
		
		public void setEmail(String email) 
		{
			Email = email;
		}
		
		public int getPhyMark() 
		{
			return PhyMark;
		}
		
		public void setPhyMark(int phyMark) 
		{
			PhyMark = phyMark;
		}
		
		public int getCheMark() 
		{
			return CheMark;
		}
		
		public void setCheMark(int cheMark) 
		{
			CheMark = cheMark;
		}
		
		public int getMathsMark() 
		{
			return MathsMark;
		}
		
		public void setMathsMark(int mathsMark) 
		{
			MathsMark = mathsMark;
		}
		public String getPre_course() {
			return Pre_course;
		}
		public void setPre_course(String pre_course) {
			Pre_course = pre_course;
		}
	}
	
	
