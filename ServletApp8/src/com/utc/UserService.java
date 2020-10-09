package com.utc;
import java.sql.*;


public class UserService {

	
	Connection con=null;
	Statement st;
	ResultSet rs;
	String status="";
	
	public UserService() {
		
		try {
			System.out.println("register driver");
			Class.forName("org.postgresql.Driver");
			System.out.println("connection creation");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/registration","postgres","#Password");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String checkLogin(String uname,String upwd)
	{
		try {
			System.out.println("checking for login now");
			rs=st.executeQuery("select * from registered_users  where uname='"+uname+"' and upwd='"+upwd+"'");
			boolean b = rs.next();
			if(b==true)
			{
				status="success";
			}
			else
			{
				status="failure";
			}
			
			con.close();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	
	public String registration(String uname,String upwd,String uemail,String umobile)
	{
		try
		{
			System.out.println("registering now");
			rs=st.executeQuery("select * from registered_users where uname='"+uname+"'");
			boolean b=rs.next();
			if(b==true)
			{
				status="existed";
			}
			if(b==false)
			{
				st.executeUpdate("insert into registered_users  values('"+uname+"','"+upwd+"','"+uemail+"',"+umobile+")");
				status="success";
			}
			con.close();
		}
		catch(Exception e)
		{
			status="failure";
			e.printStackTrace();
		}
		
		return status;
		
	}

}
