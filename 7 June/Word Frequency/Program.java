import java.util.*;
public class Program {
   private static Scanner sc = new Scanner(System.in);
   private static Map<String, Integer> wordCount = new HashMap<>();
   private static void wordFrequency(String text){
       String[] arr = text.split(" ");
       for(int i = 0; i < arr.length; i++){
            if(wordCount.containsKey(arr[i])){
                wordCount.put(arr[i], wordCount.get(arr[i])+1);
            }else{
                wordCount.put(arr[i], 1);
            }
       }
       //Display Map
       for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
   }
   public static void main(String[] args){
       String text = sc.nextLine();
       wordFrequency(text);
   } 
}
