import java.util.Scanner;

public class po {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    do{
      System.out.println("Enter your number here");
      int num = sc.nextInt();
      if(num % 10 == 0){
      System.out.println(num);
        break;
      }
    }while(true);
  }
}
