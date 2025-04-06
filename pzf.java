import java.util.Scanner;

public class pzf {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the decimal number to get converted in to binary : ");
    int num = sc.nextInt();
    dectobin(num);
    sc.close();


  }
  public static void dectobin(int num){
    int lastdigit;
    int bin = 0;
    int pow=0;
    while(num>0){
      lastdigit = num %2;
      bin = bin + lastdigit * (int)Math.pow(10,pow);
      num/=2;
      pow++;
    }
    System.out.println(bin);
  }
}
