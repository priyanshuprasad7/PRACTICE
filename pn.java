import java.util.Scanner;

public class pn {
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
      // System.out.println("Enter a number here");
      // int number = sc.nextInt();
      for(int i = 0; i<=10;i++){
        if(i==5){
          continue; //or we can use break here, so when its value become 5 the loop will end and the result will be 1,2,3,4 only .
        }
        System.out.println(i);
      }
      System.out.println("i m out of the loop : ");
  }
  
}
