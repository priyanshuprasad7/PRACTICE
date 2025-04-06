public class pzp {
  public static void main(String args[]){
    inverted_pyramid(4);

  }
public static void inverted_pyramid(int value){
  for(int i=1;i<=value;i++){
    for(int j=1;j<=value-i;j++){
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
}
}
