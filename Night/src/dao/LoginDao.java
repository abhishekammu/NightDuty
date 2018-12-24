package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginDao {
	public Map<String, Comparable> guardlogin(int personid)
	{
		util.MySql a = new util.MySql();
		Connection con =  a.conect();
		Map obj=null;
		try {
			// Connection con= null;
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Guards where gid='" + personid + "'");
	
			if (rs.next()) {
				obj=new HashMap();
				obj.put("gid", rs.getInt(1));
				obj.put("fname", rs.getString(2));
				obj.put("lname", rs.getString(3));
				obj.put("desig", rs.getString(4));
				obj.put("mobile",rs.getInt(5));
				obj.put("manager",rs.getInt(6));	
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return obj;
	}
	public List guardlogin1(int personid)
	{
		System.out.println("Enter to dao");
		util.MySql a = new util.MySql();
		System.out.println("Enter to dao1");
		Connection con =  a.conect();
		System.out.println("Enter to dao2");
		List obj=new ArrayList();
		System.out.println("Enter to dao3");
		try {
			System.out.println("10");
			// Connection con= null;
			java.sql.Statement stmt = con.createStatement();
			System.out.println(personid);
			ResultSet rs = stmt.executeQuery("select * from Timesheet where gid='" + personid + "'");
			
			System.out.println("20");
			while(rs.next()) {
				Map m=new HashMap();
				m.put("date", rs.getDate(1));
				System.out.println("1");
				m.put("gid", rs.getInt(2));
				System.out.println("2");
				m.put("locid", rs.getInt(3));
				System.out.println("3");
				m.put("timein", rs.getTime(4));
				System.out.println("4");
				
				m.put("timeout",rs.getTime(5));
				System.out.println("5");
				m.put("remarks",rs.getString(6));
				System.out.println("6");
				m.put("status", rs.getString(7));
				
				
				System.out.println("7");
				obj.add(m);
				
				
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return obj;
	}
public int saveTimesheet(int id,int location,String date,String timein,String timeout,String remarks,int status)


{
	System.out.println("id ===>>. "+ id);
	System.out.println("location ===>>. "+ location);
	System.out.println("Date ===>> "+ date);
	System.out.println("timein ===>> "+ timein);
	System.out.println("timeout ===>> "+ timeout);
	System.out.println("status ===>>> "+remarks);
	util.MySql a = new util.MySql();
	Connection con =  a.conect();
	try {
		System.out.println("10");
		java.sql.Statement stmt = con.createStatement();
		String sqlQuery = "INSERT INTO `Timesheet`(`date`, `gid`, `locid`, `timein`, `timeout`, `remarks`, `status`) VALUES (STR_TO_DATE('"+date.trim()+"' ,'%Y-%m-%d') ,"+id+","+location+", STR_TO_DATE('"+date.trim()+" "+timein.trim()+"','%Y-%m-%d %H:%i'), STR_TO_DATE('"+date.trim()+" "+timeout.trim()+"','%Y-%m-%d %H:%i'),'"+remarks+"',"+status+")";
		return stmt.executeUpdate(sqlQuery);
		
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	return 0;
}

}
