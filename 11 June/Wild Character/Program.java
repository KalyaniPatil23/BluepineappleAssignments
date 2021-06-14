import java.util.*;

public class Program{
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Enter string :- ");
    String string = sc.nextLine();
    System.out.println("Enter pattern :- ");
    String pattern = sc.nextLine();
    Vector<String> v = getSubStrings(string, pattern);
    for(String s: v){
      System.out.println(s);
    }
    //System.out.println(string+" "+pattern);
  }
  private static Vector<String> getSubStrings(String s, String p){
    Vector<String> v = new Vector<>();
    char[] arr = s.toCharArray();
    char[] pat = p.toCharArray();
    int i = 0;
    String sub = "";
    for(int j=0; j < arr.length; j++){
      if(pat[i] == '?'){
        sub += arr[j];
        i++;
        
      }else if(pat[i] == '*'){
          while(arr[j] != pat[i+1]){
            sub = sub + arr[j];
            j++;
            if(j >= arr.length){
              sub="";
              break;
            }
          }
          v.add(sub);
          sub="";
      }
      else{
        if(pat[i] == arr[j]){
          sub += arr[j];
          i++;
        }
      }
      if(i >= p.length()){
        v.add( sub);
        sub="";
          i = 0;
      }
    }
    return v;
  }
}