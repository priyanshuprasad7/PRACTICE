public class pzq {
  public static void main(String args[]){
    floyos_triangle(5);

  }
  public static void floyos_triangle(int n){
    int p=1;
    for(int i=1;i<=n;i++){
      for(int j =1;j<=i;j++){
        System.out.print(p + " ");
        p++;
      }
      System.out.println();
    }

  }
}
