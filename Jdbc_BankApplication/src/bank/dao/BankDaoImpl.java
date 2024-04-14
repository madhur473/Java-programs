package bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import bank.entity.Account;

public class BankDaoImpl implements BankDao {
	private int i;
	private int cnt;
	private Connection con;
	private PreparedStatement pstate;
	private ResultSet result;

	@Override
	public int createRecord(List<Account> lst) {
		i=0;
		cnt=0;
		con=DBConnection.myConnection();
		for(Account acc:lst)
		{
			System.out.println(acc.getAccNumber()+"\t"+acc.getCustName());
			
			try {
				pstate=con.prepareStatement("insert into bank values(?,?,?)");
				pstate.setInt(1, acc.getAccNumber());
				pstate.setString(2,acc.getCustName());
				pstate.setFloat(3,acc.getAccBal());
				i=pstate.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			cnt++;
			if(i>0) {
				System.out.println(cnt+" object save");
			}
		}
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteRecord(int accNumber) {
	
		con=DBConnection.myConnection();
		
		try {
			pstate=con.prepareStatement("delete from bank where acc_number=?");
			pstate.setInt(1,accNumber);
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
	public int updateRecord(List<Account> lst) {
		con=DBConnection.myConnection();
		
		for(Account acc:lst)
		{
			try {
				pstate=con.prepareStatement("update bank set acc_bal=? where acc_number=?");
				pstate.setInt(2,acc.getAccNumber());
				pstate.setFloat(1, acc.getAccBal());
				i=pstate.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			cnt++;
			if(i>0) {
				System.out.println(cnt+"Object save");
			}
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<Account> retriveRecord(int accNumber) {
		List<Account> lst=null;
		con=DBConnection.myConnection();
		
		try {
			pstate=con.prepareStatement("select * from bank where acc_number=?");
			pstate.setInt(1,accNumber);
			result=pstate.executeQuery();
			lst=new ArrayList<Account>();
			if(result.next())
			{
				lst.add(new Account(result.getInt(1),result.getString(2),result.getFloat(3)));
			}
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
		return lst;
	}
	@Override
	public List<Account> displayAll() {
		List<Account> lst=null;
		con=DBConnection.myConnection();
		
		Statement state=null;
		ResultSet result=null;
		String str="Select * from bank";
		
		lst=new LinkedList<Account>();
		
		try {
			state=con.createStatement();
			result=state.executeQuery(str);
			while(result.next())
			{
				System.out.println("Hii "+result.getInt(1));
				
				lst.add(new Account(result.getInt(1),result.getString(2),result.getFloat(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
	//Jdbc code...

}
