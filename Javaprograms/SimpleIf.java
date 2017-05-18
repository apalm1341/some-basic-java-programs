import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number == 0)
        System.out.println("HiFive");
        

        if (number == 1)
        System.out.println("HiEven");
    }
}