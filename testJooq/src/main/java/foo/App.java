package foo;

import java.io.ObjectInputStream.GetField;
import java.sql.*;
//import org.jooq.*;

/**
 * Hello world!
 * 
 */
public class App {

	

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Connection co = getConnection();
		//DSLContext database = DSL.using(conn, SQLDialect.MYSQL);
	}
	
	private static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:8888/idm",
					"root",
					"root");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
