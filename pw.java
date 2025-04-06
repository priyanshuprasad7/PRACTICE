import java.util.Scanner;

public class pw{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
     int marks[]= new int[53];
    marks[0]= sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    marks[23]= sc.nextInt();
    System.out.print(marks[0]);
    System.out.print(marks[0]);
    System.out.print(marks[1]);
    System.out.println(marks[2]);
    marks[23] = marks[23] + 1;
    System.out.println(marks[23]);
    System.out.println(marks.length);
    

   
  }
}