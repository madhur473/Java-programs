package bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection myConnection() {
		Connection con=null;
		try {

			//C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\pjdbc14.jar
			Class.forName("oracle.jdbc.OracleDriver");
			//C:\oraclexe\app\oracle\product\10.2.0\server\NETWORK\ADMIN\\tnsnames.ora
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","4730");
			System.out.println("Connection to DATABASE"+con);
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;	
	}
}
