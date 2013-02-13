package sample.keiji;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyDBAccess {
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection connection;
	private Statement statement;
	private ResultSet resultset;

	//Constructor
	public MyDBAccess(String driver, String url, String user, String password){
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	//Constructor(without param)
	public MyDBAccess(){
		this.driver = "com.mysql.jdbc.Driver";
		this.url = "jdbc:mysql://localhost:3306/yukichi";
		this.user = "root";
		this.password = "development";
	}

	//Connect to DB
	public synchronized void open() throws Exception{
		Class.forName(driver);
		connection = DriverManager.getConnection(url,user,password);
		statement = connection.createStatement();
	}

	//Return ResultSet after Query executed
	public ResultSet getResultSet(String sql) throws Exception{

		if(statement.execute(sql)){
			return statement.getResultSet();
		}
		return null;
	}

	//Execute SQL statement
	public void execute(String sql) throws Exception {
		statement.execute(sql);
	}

	//Close DB
	public synchronized void close() throws Exception {
		if( resultset != null) resultset.close();
		if( statement != null) statement.close();
		if( connection != null) connection.close();
	}
}
