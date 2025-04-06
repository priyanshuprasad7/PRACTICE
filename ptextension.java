import java.util.Scanner;
public class ptextension {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float totalAmount = 0;  // To keep track of the total order amount

        while (true) {
            System.out.println("Please select the food from the menu: ");
            System.out.println(" 1. Burger");
            System.out.println(" 2. Samosa");
            System.out.println(" 3. Pizza");
            System.out.println(" 4. Egg roll");
            System.out.println(" 5. Paneer roll");
            System.out.println("Enter your food number: ");
            int input = sc.nextInt();

             // Calculate the price based on user input
            float price = order(input);
            if (price == 0) {
                System.out.println("Invalid selection. Please try again.");
                continue;  // Skip to the next iteration if invalid input
            }
            totalAmount += price;

            // Ask if the user wants to continue ordering or finalize the order
            System.out.println("Do you want to continue ordering?");
            System.out.println("1 for continue, 2 for final order");
            int num = sc.nextInt();

            if (num == 2) {
                break;  // Exit the loop if the user wants to finalize the order
            }
        }

        System.out.println("Final total amount: " + totalAmount);
        sc.close();  // Close the scanner after all operations
    }

    public static float order(int num) {
        float price = 0;
        switch (num) {
            case 1:
                price = 150;
                break;
            case 2:
                price = 40;
                break;
            case 3:
                price = 299;
                break;
            case 4:
                price = 80;
                break;
            case 5:
                price = 70;
                break;
            default:
                System.out.println("Enter a valid number from above");
                return 0;  // Return 0 if the input is invalid
        }
        // Calculate the total price with GST
        float gst = price * 0.18f;
        float finalPrice = price + gst;

        System.out.println("Your item cost: " + price);
        System.out.println("GST (18%): " + gst);
        System.out.println("Total amount for this item: " + finalPrice);

        return finalPrice;
    }
}

