package Races;

public class People {
    private char indicator;
    private String name;
    private int age;
    String origini;

    public People(String name, int age, String origini, char indicator){
        this.name = name;
        this.age = age;
        this.origini = origini;
        this.indicator = indicator;
    }

    public char getIndicator() {
        return indicator;
    }
}


