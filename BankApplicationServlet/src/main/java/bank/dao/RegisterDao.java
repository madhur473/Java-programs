package bank.dao;

import java.util.List;

import bank.model.Login;
import bank.model.Register;

public interface RegisterDao {
	int createRecord(List<Register> lst);
	boolean validateUser(List<Login> lstList);
	int deleteRecord(int accNumber);
	int updateRecord(List<Register> lst);
	List<Register> retriveRecord(int accNumber);
	List<Register> displayAll();
	
	
}
