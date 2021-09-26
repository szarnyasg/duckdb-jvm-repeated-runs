package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, InterruptedException {
        System.out.println("initializing");
        Connection con1 = DriverManager.getConnection("jdbc:duckdb:/tmp/my_database2");
        con1.close();
        System.out.println("closed");
        Thread.sleep(60000);
    }

}
