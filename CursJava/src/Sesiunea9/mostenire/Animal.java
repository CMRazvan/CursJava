package Sesiunea9.mostenire;

public class Animal {
    private int age;
    private String name;
    private String color;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void eat() {
        System.out.println("eating....");
    }

    public void sleep() {
        System.out.println("Sleep's...");
    }

    public void makenoise() {
        System.out.println("Ham Ham ham Ham....");
    }

    public void prezentation() {
        System.out.println("My animal name is " + name);
        System.out.println(name + " have " + age + " age.");
        System.out.println("and the color's is " + color);
    }
}
