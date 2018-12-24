package com.sample;

import java.sql.ResultSet;


public class New {
	public static void main(String[] args)
	{
		util.MySql a= new util.MySql();
		a.conect();
		
		try {
			//Connection con= null;
		java.sql.Statement stmt = ((java.sql.Connection) a.conect()).createStatement();  
		ResultSet rs=stmt.executeQuery("select * from Guards");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		a.conect().close();  
		}
	catch(Exception e){ System.out.println(e);}  
		 

		
		
		
	}
}





