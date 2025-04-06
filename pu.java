import java.util.Scanner;

public class pu {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find the factroial of it   :  ");
    int num = sc.nextInt();
    sc.close();
    int f = factorial(num);
    System.out.println("The factorial of " + num + " is " + f) ;
      
    
  }
  public static int factorial (int number){
    int fact = 1 ;
    if(number ==0 ){
      return 1;
    }else{
      for(int i=1; i<=number;i++){
        fact*=i;
      }
      return fact;
    }
  }

}
