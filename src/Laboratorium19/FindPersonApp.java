package Laboratorium19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class FindPersonApp {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final String DB_USER = "muzychka";
    private static final String DB_PASS = "Taras2021";
    private static final String DB_NAME = "muzychka";
    private static final int DB_PORT = 1433;

    private static final String SQL = "SELECT * FROM Person.Contact where LastName like ?";

    public static void main(String[] args) {
        FindPersonApp fap = new FindPersonApp();

        try (Connection con = fap.connect();
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery(SQL);
        ) {

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " ");
                System.out.println(rs.getString("LastName") + " ");
                System.out.println(rs.getString("EmailAddress"));
            }

        } catch (SQLException  e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }

    Connection connect() throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(DB_USER);
        ds.setPassword(DB_PASS);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        ds.setDatabaseName(DB_NAME);
        ds.setTrustServerCertificate(true);
        return ds.getConnection();
    }
}
