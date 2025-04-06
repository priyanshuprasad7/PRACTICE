import java.util.Scanner;

public class pzo {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of rows and columans, enter rows number and press enter");
    int a= sc.nextInt();
    int b= sc.nextInt();
    hollowo_rectangle(a,b);
  }

  public static void hollowo_rectangle(int rows,int columns){
    for(int i=1;i<=rows;i++){
      for(int j=1;j<=columns;j++){
        if(i==1 || i==rows || j==1 || j==columns){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
