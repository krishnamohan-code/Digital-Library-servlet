package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import utility.ConnectionManager;

public class UserDao  implements UserDaoInterface{

	@Override
	public int signup(User user) {
	
		      String Insert_User_Details ="insert into users(name,email,phonenumber,password) values(?,?,?,?)";
		      
		      int result=0;
		      try
		      {
		    	  Connection connection= ConnectionManager.getConnection();
		    	  PreparedStatement preparestatement =connection.prepareStatement(Insert_User_Details);
		    	  preparestatement.setString(1, user.getName());
		    	  preparestatement.setString(2, user.getEmail());
		    	  preparestatement.setString(3, user.getPhonenumber());
		    	  preparestatement.setString(4, user.getPassword());
		    	 result= preparestatement.executeUpdate();
		      }
		      catch (Exception e) {
			      e.printStackTrace();
			}
		
		return result;
	}
//login table from data base
	
	@Override
	public boolean loginUser(User user) {
		
		
		String select="select * from users where email=? and password=?";
		
		boolean status=false;
		try
		{
			Connection connection =ConnectionManager.getConnection();
			PreparedStatement preparestatement=connection.prepareStatement(select);
			
			preparestatement.setString(1, user.getEmail());
			preparestatement.setString(2, user.getPassword());
			ResultSet result_set =preparestatement.executeQuery();
			status =result_set.next();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}




	
	
	

}
