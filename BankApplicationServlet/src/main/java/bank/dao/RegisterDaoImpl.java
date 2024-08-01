package bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bank.model.Login;
import bank.model.Register;

public class RegisterDaoImpl implements RegisterDao{
	int i=0;
	private Connection con=null;
	private PreparedStatement pstate;
	private ResultSet result;
	
	@Override
	public int createRecord(List<Register> lst) {
		
		int i=0;
		Connection con=DBConnection.myConnection();
		Register rmodel=lst.get(0);
		
		try {
			PreparedStatement pstate=con.prepareStatement("Insert into bankWeb values(?,?,?,?,?)");
			pstate.setInt(1, rmodel.getAccNumber());
			pstate.setString(2, rmodel.getAccFname());
			pstate.setString(3, rmodel.getAccUname());
			pstate.setString(4, rmodel.getAccPassword());
			pstate.setFloat(5, rmodel.getAccBal());
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteRecord(int accNumber) {
		Connection con=DBConnection.myConnection();
		int i=0;

		try {
			PreparedStatement pstate=con.prepareStatement("delete from bank where acc_number=?");
			pstate.setInt(1, accNumber);
			i=pstate.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updateRecord(List<Register> lst) {
		Connection con=DBConnection.myConnection();
		con=DBConnection.myConnection();
		for(Register b:lst)
		{
			try {
				PreparedStatement pstate=con.prepareStatement("update bank set acc_bal=? where acc_number=?");
				pstate.setInt(2, b.getAccNumber());
				pstate.setFloat(1, b.getAccBal());
				int result=pstate.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public List<Register> retriveRecord(int accNumber) {
		List<Register> lst=null;
		Connection con=DBConnection.myConnection();
		
		try {
			PreparedStatement pstate=con.prepareStatement("Select * from bank where acc_Number=?");
			pstate.setInt(1, accNumber);
			result=pstate.executeQuery();
			lst=new ArrayList<Register>();
			if(result.next())
			{
				System.out.println("Result found.....");
				lst.add(new Register(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getFloat(5)));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public List<Register> displayAll() {
	    List<Register> lst = new ArrayList<>();
	    Connection con = DBConnection.myConnection();
	    ResultSet result = null; // Initialize ResultSet
	    
	    try {
	        PreparedStatement pstate = con.prepareStatement("SELECT * FROM bank");
	        result = pstate.executeQuery();
	        
	        while (result.next()) {
	            // Create a new Register object for each record and add it to the list
	            lst.add(new Register(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getFloat(5)));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        // Close ResultSet, PreparedStatement, and Connection
	        try {
	            if (result != null) result.close();
	            if (pstate != null) pstate.close();
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    return lst;
	}


	public boolean validateUser(List<Login> lstLogin) {
			boolean b=false;
			
			Connection con=DBConnection.myConnection();
			
			Login lobj=lstLogin.get(0);
			
			try
			{
				PreparedStatement pstate=con.prepareStatement("select * from bank where ACC_USERNAME=? and ACC_PASSWORD=?");
				pstate.setString(1, lobj.getUserName());
				pstate.setString(2, lobj.getPassword());
				ResultSet result=pstate.executeQuery();
				if(result.next())
				{
					b=true;
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
					
			return b;
	}	
}
