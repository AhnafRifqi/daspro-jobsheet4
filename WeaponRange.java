import java.util.Scanner;

public class WeaponRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weapon range (in meters): ");
        int range = scanner.nextInt();

        if (range <= 5) {
            System.out.println("This weapon is a melee weapon.");
        } else if (range > 5 && range <= 1000) {
            System.out.println("This weapon is a ranged weapon.");
        } else {
            System.out.println("Invalid range.");
        }

    
    }
}