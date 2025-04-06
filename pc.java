import java.util.*;
public class pc {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your income : ");
    int income = sc.nextInt();
    float tax;
    if(income<500000){
      tax=0;
    }else if(income>=500000 && income<=1000000){
      tax = (int)(income*(0.2));
    }else{
      tax= (int)(income *(0.3));
    }
    System.out.println("your taxable amount is :" + tax); 
    sc.close();
  }
  
}
