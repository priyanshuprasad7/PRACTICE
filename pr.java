import java.util.Scanner;

public class pr {
  public static void caculatesum(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of a ");
    int a = sc.nextInt();
    System.out.println("Enter the value of b ");
    int b = sc.nextInt();
    sc.close();
    int sum = a+b;
    System.out.println("The sum of " + a + " + " + b + " = " + sum);
  }
  public static void main(String args[]){
    caculatesum();
  }
}
