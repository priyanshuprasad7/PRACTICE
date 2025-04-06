public class pzz {
  public static void main(String args[]){
    int number[] = {2,4,6,8,10,12,14};
    arrayPair(number);

  }
  public static void arrayPair(int number[]){
    int totalPair =0;
    for(int i = 0;i<number.length;i++){
      int curr = number[i];
      for(int j = i+1;j<number.length;j++){
        System.out.print("(" + curr + "," + number[j] + ")");
        totalPair ++;
      }
      System.out.println();
    }
    System.out.println("total pair is " + totalPair);
  }
}
