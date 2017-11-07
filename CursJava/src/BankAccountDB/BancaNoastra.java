package BankAccountDB;

import java.sql.*;
import java.util.Scanner;

//aici avem un proiect de banca cu baza de date
public class BancaNoastra {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Salut bine ai venit la Banca Noastra cu DB");

        int option;
        int count = 0;
        Scanner keyboardscan = new Scanner(System.in);
        do {

            System.out.println("---------------------------");
            System.out.println("Cu ce te putem ajuta?" +
                    "\n1.Creeaza Cont" +
                    "\n2.Verifica Cont" +
                    "\n3.Adauga Bani in cont" +
                    "\n4.Retrage Bani din cont" +
                    "\n5.Depoziteaza Bani" +
                    "\n6.Imprumuta Bani" +
                    "\n7.Iesi din aplicatie" +
                    "\n---------------------------" +
                    "\n-----------Ce Alegi--------" +
                    "\n---------------------------");
            option = keyboardscan.nextInt();
            if (option == 1) {
                System.out.println("Creez cont");
                System.out.println("Scrie Username:");
                String newUser = keyboardscan.next();
                System.out.println("Scrie Parola");
                int passForNewUser = keyboardscan.nextInt();
                createUserDB(newUser, passForNewUser);
            } else if (option == 2) {
                System.out.println("Verific Cont");
                System.out.println("Numele");
                String numeVerific = keyboardscan.next();
                System.out.println("Parola");
                String passVerific = keyboardscan.next();
                readVerificareContDB(numeVerific, passVerific);
            } else if (option == 3) {
                System.out.println("Adauga Bani in Cont");
                System.out.println("Cati Bani doresti sa depui?");
                int baniDepunere = keyboardscan.nextInt();
                System.out.println("In ce cont doresti sa depui ?");
                readDB();
                System.out.println("Alege id-ul Contului");
                int idUserCont = keyboardscan.nextInt();
                System.out.println("Introdu Parola");
                int passUserCont = keyboardscan.nextInt();
                updateBaniContDB(baniDepunere, idUserCont, passUserCont);
            } else if (option == 4) {
                System.out.println("Retrage Bani din Cont");
            } else if (option == 5) {
                System.out.println("Depoziteaza Bani in Cont");
            } else if (option == 6) {
                System.out.println("Imprumuta Bani de la Banca");
                System.out.println("Poti sa imprumuti:" +
                        "\n1)100 si platesti cu 10% mai mult" +
                        "\n2)500 si platesti cu 7.5% mai mult" +
                        "\n3)1000 si platesti cu 5% mai mult");
                System.out.println("Care Imprumut doresti?");
                int obImprumut = keyboardscan.nextInt();
                readDB();
                System.out.println("Alege id-ul Contului");
                int idUserCont = keyboardscan.nextInt();
                System.out.println("Introdu Parola");
                int passUserCont = keyboardscan.nextInt();
                imprumutClientDB(idUserCont, passUserCont, obImprumut);
            } else if (option == 7) {
                System.out.println("Multumim pentru alegerea facuta");
                option = 0;
            } else {
                System.out.println("NU AI ALES  OBTIUNE CORECTA! ALEGE DIN NOU");
                count++;
                if (count == 4) {
                    option = 0;
                    System.out.println("Pentru ca ai incercat de " + count + " si nu ai ales o obtiune corecta TE-AM DECONECTAT!!");
                }
            }

        } while (option != 0);
    }

    public static void createUserDB(String usernameUser, int passwordUser) throws SQLException, ClassNotFoundException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/BankAccount";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        Statement st = conn.createStatement();
        // 5. execute a query
        PreparedStatement pSt = conn.prepareStatement("INSERT INTO public.users(userusername, userpass)VALUES (?,?)");

        pSt.setString(1, usernameUser);

        pSt.setInt(2, passwordUser);


        //ResultSet rs = st.executeQuery("INSERT INTO public.users(userusername, userpass)VALUES ( '" + usernameUser.trim() + "', '" + passwordUser + "');");
        // 6. iterate the result set and print the values

        // 7. close the objects
        pSt.close();
        st.close();
        conn.close();

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

    public static void readVerificareContDB(String numeCont, String passCont) throws SQLException, ClassNotFoundException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/BankAccount";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        Statement st = conn.createStatement();
        // 5. execute a query SELECT iduser, userusername, usersold FROM public.users;
        ResultSet rs = st.executeQuery("SELECT * FROM public.users WHERE userusername='" + numeCont.trim() + "' AND userpass='" + passCont + "'");
//        PreparedStatement pSt = conn.prepareStatement("SELECT * FROM public.users WHERE userusername=? AND userpass=?");
//        pSt.setString(1, numeCont);
//        pSt.setInt(2, passCont);
        // 5. execute a prepared statement
        //int rowsUpdated = pSt.executeUpdate();
        // 6. iterate the result set and print the values
        System.out.println("| ID     |   Nume                      |   Sold            |   Depozit         |   Imprumut     | Status Cont");
        while (rs.next()) {
            int sold = rs.getInt("usersold");
            int depozit = rs.getInt("userdepozit");
            int imprumut = rs.getInt("userimprumut");
            int finalSold = sold - imprumut + depozit;
            System.out.print("| ");
            System.out.print(rs.getString("iduser"));
            System.out.print("      |   ");
            System.out.print(rs.getString("userusername"));
            System.out.print("      |   ");
            System.out.print(rs.getString("usersold"));
            System.out.print("      |   ");
            System.out.print(rs.getString("userdepozit"));
            System.out.print("            |     ");
            System.out.print(rs.getString("userimprumut"));
            System.out.print("|");
            System.out.println(finalSold);

        }
        // 7. close the objects
        rs.close();
        st.close();
        conn.close();
    }

    public static void readDB() throws SQLException, ClassNotFoundException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/BankAccount";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        Statement st = conn.createStatement();
        // 5. execute a query SELECT iduser, userusername, usersold FROM public.users;
        ResultSet rs = st.executeQuery("SELECT * FROM public.users order by iduser asc");
        // 6. iterate the result set and print the values
        System.out.println("| ID     |   Nume");
        while (rs.next()) {
            System.out.print("| ");
            System.out.print(rs.getString("iduser"));
            System.out.print("      |   ");
            System.out.println(rs.getString("userusername"));
            //System.out.print("      |   ");
            //System.out.println(rs.getString("usersold"));

        }
        // 7. close the objects
        rs.close();
        st.close();
        conn.close();
    }

    public static void updateBaniContDB(int baniDepun, int idUser, int passUser) throws ClassNotFoundException, SQLException {

        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/BankAccount";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        Statement st = conn.createStatement();
        // 5. execute a query
        ResultSet rs = st.executeQuery("SELECT * FROM public.users where iduser=" + idUser);
        // 6. iterate the result set and print the values
        int countpasserr = 0;
        while (rs.next()) {

            rs.getInt("iduser");
            int userStaticPass = rs.getInt("userpass");
            rs.getString("userusername");
            int soldusercont = rs.getInt("usersold");

            if (userStaticPass == passUser) {
                // 4. create a query statement
                int totalbani = soldusercont + baniDepun;
                PreparedStatement pSt = conn.prepareStatement("UPDATE public.users SET usersold=? WHERE iduser=?");
                pSt.setInt(1, totalbani);
                pSt.setInt(2, idUser);
                // 5. execute a prepared statement
                int rowsUpdated = pSt.executeUpdate();
                // 6. close the objects
                pSt.close();
                conn.close();

                System.out.println("Ai avut in cont " + soldusercont + " si ai mai adaugat contului tau: " + baniDepun + " si ai un total de " + totalbani);
            } else {
                System.out.println("Parola Gresita");
                countpasserr++;
            }
        }
        // 7. close the objects
        rs.close();
        st.close();
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

    public static void imprumutClientDB(int idUser, int passUser, int imprumutOpt) throws ClassNotFoundException, SQLException {
        int baniImprumutati = 0;
        double taxaImprumut = 0;
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");
        // 2. define connection params to db
        final String URL = "jdbc:postgresql://localhost/BankAccount";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";
        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // 4. create a query statement
        Statement st = conn.createStatement();
        // 5. execute a query
        ResultSet rs = st.executeQuery("SELECT * FROM public.users where iduser=" + idUser);
        // 6. iterate the result set and print the values

        double baniImprumutatiPrimit = 0;
        if (imprumutOpt == 1) {
            baniImprumutati = 100;
            taxaImprumut = 0.1;
            baniImprumutatiPrimit = baniImprumutati - (baniImprumutati * taxaImprumut);
        } else if (imprumutOpt == 2) {
            baniImprumutati = 500;
        } else if (imprumutOpt == 3) {
            baniImprumutati = 1000;
        }
        while (rs.next()) {
            rs.getInt("iduser");
            int userStaticPass = rs.getInt("userpass");
            rs.getString("userusername");
            int soldusercont = rs.getInt("usersold");
            double newSold = soldusercont + baniImprumutatiPrimit;
            if (userStaticPass == passUser) {
                // 4. create a query statement
                PreparedStatement pSt = conn.prepareStatement("UPDATE public.users SET userimprumut=?,usersold=? WHERE iduser=?");
                pSt.setInt(1, baniImprumutati);
                pSt.setDouble(2, newSold);
                pSt.setInt(3, idUser);
                // 5. execute a prepared statement
                int rowsUpdated = pSt.executeUpdate();
                // 6. close the objects
                pSt.close();
                conn.close();
                System.out.println("Ai facut un imprumut de :" + baniImprumutati);
            } else {
                System.out.println("Imprumutul tau nu a reusit te rog mai incearca");

            }
        }

        // 7. close the objects
        rs.close();
        st.close();
        conn.close();


    }
}
