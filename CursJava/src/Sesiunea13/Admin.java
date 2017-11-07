package Sesiunea13;

import java.sql.*;

public class Admin {
    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:postgresql://localhost/Administratie";
        String user = "postgres";
        String password = "1234";

        try {
            Connection myConn = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("Connectat");
            Statement myStmt = myConn.createStatement();


//            Statement myStat = myConn.createStatement();
//            String crTable= " CREATE TABLE angajatNou(" +
//                    "pk_id int PRIMARY KEY NOT NULL," +
//                    "nume char(60)," +
//                    "adresa char(120)," +
//                    "salariu real)";
//            myStat.executeUpdate(crTable);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nu merge");
        }

    }
}
