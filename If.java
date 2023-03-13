public class If {
    public static void main(String[] args) {

        // boolean cond = 1 < 6;
        // System.out.println(cond);

        // int myInt = 15;

        // if (myInt < 10) {
        // System.out.println("Yes, it's true!");
        // } else if (myInt > 20) {
        // System.out.println("No, it's false!");
        // } else {
        // System.out.println("None of the above");
        // }

        int loop = 0;

        while (true) {
            System.out.println("Looping: " + loop);
            if (loop == 5) {
                break;

            }
            loop++;
            System.out.println("Running");
        }
    }
}
