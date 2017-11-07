package Sesiunea13;

import java.sql.Statement;

public class Angajat {
    int id;
    String name;
    String adress;
    double salariu;

    public Angajat(int id, String name, String adress, double salariu) {

    }

    public void inregistreaza(Statement stmt, String table) {
        String reg = "insert into " + table + "(pk_id,name,adresa,salariu) VALUES "+ this.id + " , '" + this.name + "' , '" + this.adress + "' , " + this.salariu ;
        System.out.println(reg);

    }
}
