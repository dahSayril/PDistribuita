package it.unisa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DriverManagerConnectionPool {

	private static List <Connection> freeDbConnections;
	
	static {
		freeDbConnections = new LinkedList <Connection> ();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("DB driver non trovati! " + e.getMessage());
		}
	}
	
	private synchronized static Connection createDBConnection() throws SQLException {
		Connection newConnection = null;
		String db = "NoteMarket";
		String username = "root";
		String password = "Juventus10!";
		
		newConnection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/" + db
				+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				username, password);
	
		return newConnection;
	}
	
	public static synchronized Connection getConnection() throws SQLException {
		Connection connection;
		
		if(!freeDbConnections.isEmpty()) {
			connection = (Connection) freeDbConnections.get(0);
			freeDbConnections.remove(0);
			
			try {
				if(connection.isClosed())
					connection = getConnection();
			} catch (SQLException e) {
				connection.close();
				connection = getConnection();
			}
		} else { connection = createDBConnection(); }
		
		return connection;
	}
	
	public synchronized static void releaseConnection(Connection connection) throws SQLException {
		if(connection != null) freeDbConnections.add(connection);
	}
	
}