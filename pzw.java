public class pzw {
  public static void main(String args[]){
    int number[] = {324,34352,532,4352,235,3425,3532,23535,25235};
    int value = findLargest(number);
    System.out.println("largest number is : " + value);
    int value2 = findSmallest(number);
    System.out.println("smallest number is : " + value2);
  }
  public static int findLargest(int number[]){
    int largest = Integer.MAX_VALUE;
    for(int i = 0; i<number.length;i++){
      if(largest<number[i]){
        largest = number[i];

      }
    }
    return largest;
  }
  public static int findSmallest(int number[]){
    int smallest = Integer.MAX_VALUE;
    for(int i= 0;i<number.length;i++){
      if(smallest>number[i]){
        smallest = number[i];
      }
    }
    return smallest;
  }
}
