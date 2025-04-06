import java.util.Scanner;

public class pzd {
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number to find it is a prime number or not ");
    int n = sc.nextInt();
    sc.close();
    System.out.println(isprime(n));
  }


public static boolean isprime(int n){
  boolean isprime= true;
  for(int i=2; i<n;i++){
    if(n%i==0){
      isprime = false;
      System.out.println(i + " ");
    }
  }
  return isprime;
}
}
