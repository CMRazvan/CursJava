package Sesiunea9.incapsulare;

public class backyard {
    public static void main(String[] args) {
        Caine roy = new Caine();
        roy.setAge(2);
        roy.setName("Margel");
        roy.setColor("Red");

        int ageOfRoy = roy.getAge();
        String colorRoy = roy.getColor();
        String NameRoy = roy.getName();

        roy.prezentation();
        roy.makenoise();
        roy.eat();
        roy.sleep();
    }
}
