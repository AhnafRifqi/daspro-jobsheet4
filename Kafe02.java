import java.util.Scanner;

public class Kafe02 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coffeePrice = 12000;
        double teaPrice = 7000;
        double chocolatePrice = 20000;
        
        double sSizeMultiplier = 1.0;
        double mSizeMultiplier = 1.25;
        double lSizeMultiplier = 1.4;
        
        double memberDiscount = 0.1;

        System.out.print("Enter the item (coffee, tea, chocolate): ");
        String item = scanner.nextLine().toLowerCase();

        System.out.print("Enter the size (S, M, L): ");
        String size = scanner.nextLine().toUpperCase();

        System.out.print("Are you a member (yes/no): ");
        String isMember = scanner.nextLine().toLowerCase();

        double price = 0;
        switch (item) {
            case "coffee":
                price = coffeePrice;
                break;
            case "tea":
                price = teaPrice;
                break;
            case "chocolate":
                price = chocolatePrice;
                break;
            default:
                System.out.println("Invalid item.");
                return;
        }

        switch (size) {
            case "S":
                price *= sSizeMultiplier;
                break;
            case "M":
                price *= mSizeMultiplier;
                break;
            case "L":
                price *= lSizeMultiplier;
                break;
            default:
                System.out.println("Size is not available");
                return;
        }

        if (isMember.equals("yes")) {
            price *= (1 - memberDiscount);
        }
        
        System.out.println("Total price: " + price);

    }
}
    

