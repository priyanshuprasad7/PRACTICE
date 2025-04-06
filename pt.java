import java.util.Scanner;

public class pt {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    float price = 0;
    System.out.println("please select the food from the menu : ");
    System.out.println(" 1. Burger");
    System.out.println(" 2. Samosa ");
    System.out.println(" 3. Pizza");
    System.out.println(" 4. Egg roll");
    System.out.println(" 5. paneer roll");
    System.out.println("Enter your food number : ");
    int input = sc.nextInt();
    switch (input) {
      case 1:
        price =150;
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
       System.out.println("Enter a valid number form above ");
        break;
      }
        float getamount = price * 0.18f;
        float finalprice = price + getamount;

        System.out.println("your amount is " + price);
        System.out.println("Gst 18 % " + getamount);
        System.out.println("Total amount is "  + finalprice);

  }
}
