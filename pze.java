import java.util.Scanner;

public class pze{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your binary number here : ");
    int bi = sc.nextInt();
    int a= bintonum(bi);
    System.out.println(a);

  }
  public static int bintonum(int binary){
    int lastdigit;
    int deci=0;
    int pow= 0;
    while(binary > 0){
      lastdigit = binary %10;
      deci= deci + (int)(lastdigit * (Math.pow(2,pow)));
      pow++;
      binary/=10;
    }
    return deci;
  }
}