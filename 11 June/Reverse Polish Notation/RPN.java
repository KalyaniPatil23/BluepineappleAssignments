import java.util.*;

public class RPN{
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    String str = sc.nextLine();
    String[] s = str.split(",");
    System.out.println(getRPN(s));
  }
  private static boolean isOperator(String x)
  {
    return x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/");
  }
  private static String getRPN(String[] s){
    Stack<String> stack = new Stack<>();

    for(int i = 0; i < s.length; i++){
      if (!isOperator(s[i]))
      {
        stack.push(s[i]);
      }else
      {
        String op1 = stack.peek();
        stack.pop();
        String op2 = stack.peek();
        stack.pop();
        stack.push("(" + op2 + s[i] + op1 + ")");
      }
    }
    String str = stack.peek();
  return str;
  }
  

}