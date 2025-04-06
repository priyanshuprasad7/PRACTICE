import java.util.Scanner;
public class pj {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number for the output");
    int num = sc.nextInt();
    sc.close();
    int sum= 0;
    int i = 1;
    while(i<=num){
        sum+=i;
        i++;
        // System.out.println("The sum of " + num + " " + "natural number is " + sum);
    }
    System.out.println("The sum of " + num + " " + "natural number is " + sum);
  }
}
