import java.util.Scanner;

public class ptextension2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float total_amount= 0; 
    while (true) {
      System.out.println("choose the food from below");
      System.out.println(" 1. Burger");
      System.out.println(" 2. Samosa");
      System.out.println(" 3. Pizza");
      System.out.println(" 4. Egg roll");
      System.out.println(" 5. Paneer roll");
      System.out.println("Enter your food number: ");
      int input = sc.nextInt();
      float order_value = ordertracking(input);
      total_amount+=order_value;
        if(order_value == 0){
          System.out.println("invalid selection please try again here : ");
          continue;
        }
         
          System.out.println("Do you want to continue ordering ?");
          System.out.println("press 1 for continue , 2 for final total amount");
          int more_order = sc.nextInt();
          if(more_order == 2){
              break;
          }
       }
       System.out.println("your final amount to be paid is : " + total_amount);
       System.out.println("thanks for visiting us, Hope you like our food ");
       sc.close();
  }

  public static float ordertracking(int num){
  float price = 0;
  switch (num) {
    case 1:
      price = 50;
      break;
    case 2:
      price = 30;
      break;
    case 3:
      price = 300;
      break;
    case 4:
      price = 344;
      break;
    case 5 :
      price = 332;
      break;
    default:
    System.out.println("enter a valid input");
    break;
  }
  float tax =  0.18f * price;
  float total_price = price + tax ; 
  System.out.println("your price  is : " + price );
  System.out.println("your  gst is : " + tax );
  System.out.println("your total amount is : " + total_price);
  return total_price;
}
}
