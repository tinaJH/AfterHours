
package db;

import db.mongodb.MongoDBConnection;
import db.mysql.MySQLConnection;
public class DBConnectionFactory {
	// This should change based on the pipeline.
	private static final String DEFAULT_DB = "mysql";

	// This should change based on the pipeline.
	//private static final String DEFAULT_DB = "mongodb";


	// Create a DBConnection based on given db type.
	public static DBConnection getDBConnection(String db) {
		switch (db) {
		// You may try other dbs and add them here.
		case "mysql":
			return MySQLConnection.getInstance();
		// You may try other dbs and add them here.

		case "mongodb":
			return MongoDBConnection.getInstance();

		default:
			throw new IllegalArgumentException("Invalid db " + db);
		}
	}

	// This is overloading not overriding.
	public static DBConnection getDBConnection() {
		return getDBConnection(DEFAULT_DB);
	}
}
