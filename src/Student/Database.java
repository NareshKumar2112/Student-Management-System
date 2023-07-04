package Student;

import java.sql.*;
import java.util.*;

public class Database {

	private Connection con;
	Database()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","adhav1405");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public Connection getConnection()
	{
		return con;
	}
	
}
