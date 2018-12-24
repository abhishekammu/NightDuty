package service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import dao.LoginDao;

public class LoginService {
	public Map guardlogin(int personid)
	{
		LoginDao d=new LoginDao();
		return d.guardlogin(personid);
		
		
		
	}
	
      public List guardlogin1(int personid)
      {
    	  
    	  LoginDao d1= new LoginDao();
    	  return (List) d1.guardlogin1(personid);
}
      public int saveTimesheet(int id,int location,String date,String timein,String timeout,String remarks,int status)
      {
    	  
    	  LoginDao d2=new LoginDao();
              return  d2.saveTimesheet(id, location, date, timein, timeout, remarks, status);
      
      
      }
      
      
}