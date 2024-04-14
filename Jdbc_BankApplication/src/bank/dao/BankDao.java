package bank.dao;
import java.util.List;
import bank.entity.*;

public interface BankDao {
	
	int createRecord(List<Account> lst);
	int deleteRecord(int accNumber);
	int updateRecord(List<Account> lst);
	List<Account> retriveRecord(int accNumber);
	List<Account> displayAll();

}
