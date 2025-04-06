import java.util.Scanner;

public class pv {
  public static int factorial (int number){
    int fact = 1 ;
    if(number ==0 ){
      return 1;
    }else{
      for(int i=1; i<=number;i++){
        fact*=i;
      }
      return fact;
  }
}
  public static float  bc(int n, int r){
    int nfact= factorial(n);
    int rfact = factorial(r);
    int nrfact = factorial(n-r);

    float binomialcofficent= nfact/(rfact*nrfact);
    return binomialcofficent;

}
public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the value of n in  binomial coefficient : ");
  int num = sc.nextInt();
  System.out.println("Enter the value of r in the binomial coefficient : ");
  int r= sc.nextInt();
  float ans = bc(num,r);
  System.out.println("The answer is " + ans);

}

}
