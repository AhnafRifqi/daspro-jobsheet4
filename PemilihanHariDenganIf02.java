import java.util.Scanner;

public class PemilihanHariDenganIf02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();

        if (dayOfWeek >= 1 && dayOfWeek <= 7) {
            if (dayOfWeek <= 5) {
                System.out.println("It's a weekday ");
            } else {
                System.out.println("It's a weekend ");
            }
        } else {
            System.out.println("Invalid number ");
        }

        
    }
}