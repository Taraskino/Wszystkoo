package Spotkanie4.JDBC;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.sql.*;
import java.text.NumberFormat;

public class HomeBudget {
        private static final String DB_HOST = "morfeusz.wszib.edu.pl";
        private static final String DB_USER = "muzychka";
        private static final String DB_PASS = "Taras2021";
        private static final String DB_NAME = "muzychka";
        private static final int DB_PORT = 1433;

        private static final String INSERT_ENTRY_SQL = "INSERT INTO budget.BudgetEntris(EntryName, Amount) VALUES (?, ?)";
        private static final String GET_SUM_SQL = "SELECT SUM(Amount) AS sum FROM budget.BudgetEntris";


    public static void main(String[] args) {
        BudgetEntry budgetEntry = new BudgetEntry();
        budgetEntry.setEntryName(args[0]);
        budgetEntry.setAmount(new BigDecimal(args[1]));

        HomeBudget homeBudget = new HomeBudget();
        try (Connection con = homeBudget.connect(DB_USER, DB_PASS, DB_NAME);
             Statement stmt = con.createStatement()){
            PreparedStatement ps = con.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1, budgetEntry.getEntryName());
            ps.setBigDecimal(2, budgetEntry.getAmount());
            ps.execute();

            BigDecimal balance;
            ResultSet rs = stmt.executeQuery(GET_SUM_SQL);
            if(rs.next()) {
                balance = rs.getBigDecimal("sum");
            } else {
                balance = BigDecimal.ZERO;
            }

            System.out.print("Zapisano! kwota: " + currencyFormat(budgetEntry.getAmount()));
            System.out.print(", nazwa: " + budgetEntry.getEntryName());
            System.out.println(", saldo: " + currencyFormat(balance));

        }catch (SQLException e){
            System.out.println("Coś poszło nie tak... " + e.getMessage());
        }
    }
    Connection connect(String userName, String passWord, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(userName);
        ds.setPassword(passWord);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        ds.setDatabaseName(dbName);
        ds.setTrustServerCertificate(true);

        return ds.getConnection();
    }
    public static String currencyFormat(BigDecimal n){
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
