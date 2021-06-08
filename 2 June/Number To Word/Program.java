import java.util.*;
public class Program{
    
private static String[] singleDigits = new String[] {
"Zero", "One", "Two","Three", "Four",
"Five", "Six", "Seven", "Eight", "Nine"
};
    
private static String[] twoDigits = new String[] {
"Ten","Eleven","Twelve",
"Thirteen","Fourteen", "Fifteen", "Sixteen",
"Seventeen", "Eighteen", "Nineteen"
};
    
private static String[] tenMultiple = new String[] {
"","","Twenty","Thirty","Forty",
"Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
};
    
private static String[] tensPower
 = new String[] { "","","Hundred", "Thousand", "Thousand", "Lakh", "Lakh", "Crore","Crore", "Abj", "Abj"};
            
    
private static void numberToWords(String num) {          
    int len = num.length(), x=0;          
    if (len == 0)   
    {          
        System.out.println("Nothing");             
        return;         
    }         
    System.out.print(String.valueOf(num) + ": ");        
    while(len != 0)
    {           
        if (len == 1)   { 
            System.out.println(singleDigits[num.charAt(0)-'0']);  
            return;              
        }
        else if(len == 2){
            if(num.charAt(x) - '0' == 1){
                System.out.println(twoDigits[num.charAt(x+1)-'0']);
            }
            else if(num.charAt(x+1) - '0' == 0){  
                System.out.println(tenMultiple[num.charAt(x)-'0']);               
            }else if(num.charAt(x)-'0' == 0 || num.charAt(x+1)-'0' == 0){}
            else{                    
                System.out.println(tenMultiple[num.charAt(x)-'0']+" "+singleDigits[num.charAt(x+1)-'0']);                
            }
            return;                
        }
        else if(len == 3){
            System.out.print(singleDigits[num.charAt(x)-'0']+" "+tensPower[2]+" ");
            x+=1;
            --len;
        }else{
            if(len%2 == 0){
                //one digit
                System.out.print(singleDigits[num.charAt(x) - '0']+" "+tensPower[len-1]+ " ");
                --len;
                ++x;
            }else{
                //two digit
                if(num.charAt(x) - '0' == 1){
                    System.out.print(twoDigits[num.charAt(x+1)-'0']+" "+tensPower[len-1]+" ");
                }
                else if(num.charAt(x+1) - '0' == 0){  
                    System.out.println(tenMultiple[num.charAt(x)-'0']+" "+tensPower[len-1]+" ");               
                }else if(num.charAt(x)-'0' == 0 || num.charAt(x+1)-'0' == 0){}
                else{                    
                    System.out.println(tenMultiple[num.charAt(x)-'0']+" "+singleDigits[num.charAt(x+1)-'0']+" "+tensPower[len-1]+" ");                
                }
                len = len -2;
                x = x + 2;
            }
        }
    }    
}
 
private static Scanner sc = new Scanner(System.in);     
    public static void main(String []args){          
    String number = sc.nextLine();         
    numberToWords(number);              
}

}