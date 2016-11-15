package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

	
	public Connection getConnection() {

		String connectionUrl = "jdbc:postgresql://127.0.0.1:5432/mie";
		String connectionUser = "postgres";
		String connectionPassword = "Sd661443";

		Connection connection = null;

		try {

			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}


}
