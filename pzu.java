import java.util.Scanner;

public class pzu{
  public static void main(String args[]){
    int marks[] = new int[4];
    Scanner sc  = new Scanner(System.in);
    for(int i = 0; i<marks.length; i++){
      System.out.println("enter the number here : ");
      marks[i] = sc.nextInt();
    }
    for (int i = 0; i<marks.length; i++){
      System.out.println("marks before update is " + marks[i]);
    }
    update(marks);
  }
  public static void update(int marks[]){
    for(int i = 0; i<marks.length; i++){
      marks[i] = marks[i] + 1;
      System.out.println(marks[i]);
    }
  }
}
