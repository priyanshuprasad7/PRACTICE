import java.util.Scanner;

public class ps {
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number to find it is even or odd : ");
    int number = sc.nextInt();
    sc.close();
    String value =((number % 2 )==0)?"even":"odd";
    System.out.println("The number is " + value);
  }
}
