// 1.Load the JDBC driver: First, you need to load the appropriate JDBC driver for the database you're connecting to. This step is specific to the database you're using.

// Load the JDBC driver 
// Class.forName("com.mysql.cj.jdbc.Driver");

// 2.Establish a connection: After loading the JDBC driver, you need to establish a connection to the database.

// String url = "jdbc:mysql://localhost:3306/mydatabase";
// String username = "username";
// String password = "password";
// Connection connection = DriverManager.getConnection(url, username, password);

// 3. Create a Statement: Once the connection is established, you create a statement object that will be used to execute SQL queries.

// // Create a statement
// Statement statement = connection.createStatement();

// Execute SQL queries: You can now use the statement object to execute SQL queries like SELECT, INSERT, UPDATE, DELETE, etc.

// // Execute a query
// ResultSet resultSet = statement.executeQuery("SELECT * FROM my_table");

// Close the connection and statement: After you're done with your database operations, it's important to close the connection and statement to release resources.

// Close the ResultSet
// resultSet.close();
// Close the Statement
// statement.close();
// Close the Connection
// connection.close();
