public class pzv {
  public static void main(String args[]){
    int number[] = {2,4,6,8,10,12,14,16,18,20};
    int key = 20;
    int index = linearSearch(number,key);
    if(index == -1){
      System.out.println("NOt found");
    }else{
      System.out.println(index);
    }
  }
  public static int linearSearch(int number[], int key){
    for(int i=0;i<number.length;i++){
      if(number[i]== key){
        return i;
      }
    }
    return -1;
  }
}
