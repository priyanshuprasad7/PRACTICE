import java.util.Scanner;
public class pm {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number here : ");
      int num = sc.nextInt();
      int lastdigit;
      int rev=0;
      while(num>0){
        lastdigit = num % 10;
         rev= ( rev *10)+ lastdigit;
         num= num/10;
        }
        System.out.print(rev);
  }
}
