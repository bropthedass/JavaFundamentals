package Encapsulation;

public class Plant {

    public static final int ID = 7;
    private String name;

    public String getData() {
    String data = "some stuff" + calculateGrowthForeCast();
    return data;
    }

    private int calculateGrowthForeCast() {
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
