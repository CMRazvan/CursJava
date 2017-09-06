package BankAccountDB;

import java.sql.*;
import java.util.Scanner;

//aici avem un proiect de bacnca cu baza de date
public class BancaNoastra {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Salut bine ai venit la Banca Noastra cu DB");
        System.out.println("---------------------------");
        System.out.println("Cu ce te putem ajuta?" +
                "\n1.Creeaza Cont" +
                "\n2.Verifica Cont" +
                "\n3.Adauga Bani in cont" +
                "\n4.Retrage Bani din cont" +
                "\n5.Depoziteaza Bani" +
                "\n6.Imprumuta Bani" +
                "\n7.Iesi din aplicatie" +
                "\n---------------------------");
        Scanner keyboard = new Scanner(System.in);
        //readDB();

    }

    public static void insertDB() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/postgres";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        PreparedStatement pSt = conn.prepareStatement("INSERT INTO USERS (NAME, PASSWORD) VALUES (?,?)");
        pSt.setString(1, "ionel");
        pSt.setString(2, "password1");
        // 5. execute a prepared statement
        int rowsInserted = pSt.executeUpdate();
        // 6. close the objects
        pSt.close();
        conn.close();
    }
    public static void readDB() throws SQLException, ClassNotFoundException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/postgres";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        Statement st = conn.createStatement();
        // 5. execute a query
        ResultSet rs = st.executeQuery("SELECT * FROM public.\"Angajati\"");
        // 6. iterate the result set and print the values
        System.out.println("| ID     |   Nume           ");
        while (rs.next()) {
            System.out.print("| ");
            System.out.print(rs.getString("id").trim());
            System.out.print("      |   ");
            System.out.println(rs.getString("nume").trim());

        }
        // 7. close the objects
        rs.close();
        st.close();
        conn.close();
    }
    public static void updateDB() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/postgres";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        PreparedStatement pSt = conn.prepareStatement("UPDATE USERS SET NAME=?, PASSWORD=? WHERE PK_USER=?"); //so we have 3 params
        pSt.setString(1, "ionelcondor");
        pSt.setString(2, "password1");
        pSt.setLong(3, 1);
        // 5. execute a prepared statement
        int rowsUpdated = pSt.executeUpdate();
        // 6. close the objects
        pSt.close();
        conn.close();
    }
    public static void deleteDB() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/postgres";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        PreparedStatement pSt = conn.prepareStatement("DELETE FROM USERS WHERE PK_USER=?");
        pSt.setLong(1, 1);
        // 5. execute a prepared statement
        int rowsDeleted = pSt.executeUpdate();
        System.out.println(rowsDeleted + " rows were deleted.");
        // 6. close the objects
        pSt.close();
        conn.close();
    }
}
