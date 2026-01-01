package two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCExampleCreateTable {
	public static void main(String[] args) {
		// Database connection parameters
        String url = "jdbc:postgresql://localhost:5432/css"; // replace 'css' with your database name
        String user = "postgres"; // replace with your PostgreSQL username
        String password = "sql"; // replace with your PostgreSQL password

        // SQL statement to create a table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS employees ("
                + "id SERIAL PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "department VARCHAR(50), "
                + "salary NUMERIC(10,2)"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
               Statement stmt = conn.createStatement()) {

               // Execute the SQL statement
               stmt.executeUpdate(createTableSQL);
               System.out.println("Table 'employees' created successfully!");

           } catch (SQLException e) {
               e.printStackTrace();
           }
        //java -cp .;two\postgresql-42.7.3.jar two.JDBCExampleCreateTable
	}
}
