class Machine {
    private String name;
    private int code;

    public Machine() {
 
        this("Arnie", 0);
        System.out.println("Constructor Running");

    }

    public Machine(String name) {
        System.out.println("Second constructor running");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("third constructor running");
        this.name = name;
        this.code = code;

    }
}

public class Constructors {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        // Machine m2 = new Machine("Bertie");
        // Machine m3 = new Machine("Bertie",20);
    }
}
