import java.sql.*;

public class DBUtil {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    private static final String DATABASE_NAME = "POSSystem";
    private static final String URL = "jdbc:mysql://localhost:3306/"+DATABASE_NAME;
    private static final String ProductDescription = "ProductDescription";

    public static String getDatabaseName() {
        return DATABASE_NAME;
    }

    public static String getProductDescription() {
        return ProductDescription;
    }

    private static Connection conn = null;
    static{
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }
}