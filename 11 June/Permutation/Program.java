import java.util.*;

public class Program{
  public static void main(String[] args){
    int[] array = {1, 2, 3};
    getPermutaions(array, 0);
  }
  private static void getPermutaions(int[] array, int pos){
    if(pos >= array.length - 1){   
      System.out.print("[");  
      for(int i = 0; i < array.length - 1; i++){  
        System.out.print(array[i] + ", ");  
      }  
      if(array.length > 0)   
        System.out.print(array[array.length - 1]);  
        
      System.out.println("]");  
      return;  
    }  
    for(int i = pos; i < array.length; i++){   
          
      int temp = array[pos];  
      array[pos] = array[i];  
      array[i] = temp;  
  
      getPermutaions(array, pos+1);  
  
      temp = array[pos];  
      array[pos] = array[i];  
      array[i] = temp;  
    }
  }
}