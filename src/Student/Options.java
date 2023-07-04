package Student;

import java.util.*;

public class Options {

	public int n;
	public Scanner s;
	public String password;
	public String UserPassword;
	Options()
	{
		s=new Scanner(System.in);
		password="Naresh@2003";
		ChooseOptions();
	}
	public void ChooseOptions()
	{
		while(true)
		{
			System.out.println("Enter 1 to add user details");
			System.out.println("Enter 2 to get details about college");
			System.out.println("Enter 3 to check your data is exist or not");
			System.out.println("Enter 4 to get the result and seat allocation");
			System.out.println("Enter 0 to exit");
			n=s.nextInt();
			while(n>0&&n<=4)
			{
				if(n==1)
				{
					User u=new User();
				}
				else if(n==2)
				{
					College clg=new College();
				}
				else if(n==3)
				{
					Validator vd=new Validator();
				}
				else if(n==4)
				{
					if(check())
					{
						SeatAllocator sa=new SeatAllocator();
						System.out.println("Seat Alloaction process is end.");
						System.out.println("Thank you for all.");
						System.exit(0);
					}
				}
				break;
			}
			if(n==0||n>4)
			{
				System.out.println("Thankyou");
				break;
			}
		}
		}
		public boolean check()
		{
			System.out.println("please enter the password");
			s.nextLine();
			UserPassword=s.nextLine();
			if(password.equalsIgnoreCase(UserPassword.trim()))
			{
				System.out.println("correct");
				return true;
			}
			else
			{
				return false;
			}
		}
}
