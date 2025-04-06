public class pzy {
  public static void main(String args[]){
    int number[] = {2,4,6,8,10,12,14};
    reverseArray(number);
    for(int i = 0; i<number.length;i++){
      System.out.print( " "+ number[i]);
    }
  }
  public static void reverseArray(int number[]){
    int start = 0;
    int last = number.length - 1;
    while(start<=last){
      int temp = number[last];
      number[last] = number[start];
      number[start] = temp;
      start ++;
      last --;
    }
  }
}
