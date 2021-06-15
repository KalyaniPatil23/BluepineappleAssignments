import java.util.*;

public class Program{
  private static Scanner sc = new Scanner(System.in);
  private static Vector<String> reversePolishNotation(String[] str){
    Stack<String> stack = new Stack<>();
    Vector<String> v = new Vector<>();
    //int x=0, y=0;
    String x="", y="";
    for(int i = 0; i < str.length;i++){
      if (!str[i].equals("+") && !str[i].equals("-") && !str[i].equals("*") && !str[i].equals("/")) {
          stack.push(str[i]);
          continue;
      }else{
            String choice = str[i];            if(choice.equals("-")){
                if(v.isEmpty()){
                  x = stack.pop();
                  v.add(x);
                  v.add("-");
                  y = stack.pop();
                  v.add(y);
                }else{
                  v.add("-");
                  x = stack.pop();
                  v.add(x);
                }
            }else if(choice.equals("+")){
                if(v.isEmpty()){
                  x = stack.pop();
                  v.add(x);
                  v.add("+");
                  y = stack.pop();
                  v.add(y);
                }else{
                  v.add("+");
                  x = stack.pop();
                  v.add(x);
                }
            }else if(choice.equals("*")){
                if(v.isEmpty()){
                  x = stack.pop();
                  v.add(x);
                  v.add("*");
                  y = stack.pop();
                  v.add(y);
                }else{
                  v.add("*");
                  x = stack.pop();
                  v.add(x);
                }
            }else if(choice.equals("/")){
                if(v.isEmpty()){
                  x = stack.pop();
                  v.add(x);
                  v.add("/");
                  y = stack.pop();
                  v.add(y);
                }else{
                  v.add("/");
                  x = stack.pop();
                  v.add(x);
                }
            }else{
              continue;
            }
      }
    }
    return v;
  }
  public static void main(String[] args){
    String str = sc.nextLine();
    String[] s = str.split(",");
    Vector<String> v = reversePolishNotation(s);
    for(String string : v){
      System.out.print(string+" ");
    }
  }
}