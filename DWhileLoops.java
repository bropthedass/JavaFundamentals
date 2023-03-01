import java.util.Scanner;

public class DWhileLoops {
    public static void main(String[] args) {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            value = sc.nextInt();
        }while(value !=5);
        System.out.println("GOT 5!");
    }
}
