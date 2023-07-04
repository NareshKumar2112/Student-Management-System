package Student;

import java.util.*;
import java.util.regex.Pattern;

public class Checker {

	public boolean isPhoneNumber(String number)
	{
		return Pattern.matches("[789]{1}[0-9]{9}",number);
	}
	public boolean isName(String name)
	{
		return Pattern.matches("[a-zA-Z ]+",name);
	}
	public boolean isEmail(String email)
	{
		return Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9]+@[a-zA-Z0-9.-_]+.([a-zA-Z0-9]+.)+",email);
	}
	public boolean isDept(String dept)
	{
		dept=dept.toLowerCase();
		return (dept.equals("cse")||dept.equals("it")||dept.equals("ece"));
	}
	
}
