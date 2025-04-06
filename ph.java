import java.util.Scanner;

public class ph {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number between 1 to 7");
    int num=sc.nextInt();
    switch(num) {
      case 2:
      System.out.println("monday");
        break;
      case 3:
      System.out.println("tuesday");
      break;
      case 4:
      System.out.println("wednesday");
      break;
      case 5:
      System.out.println("thrusday");
      break;
      case 6:
      System.out.println("friday");
      break;
      case 7:
      System.out.println("saturday");
      break;
      case 1:
      System.out.println("sunday");
      break;
      default:
      System.out.println("write a valid number between 1 to 7");
        break;
    }
  }
}
