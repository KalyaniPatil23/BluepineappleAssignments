import java.util.*;


public class Program{
    
	private static boolean isPalindrome(String word){
        
        
		int i = 0, j = word.length() - 1;
        
		while(i <= j){
            
			if(word.charAt(i) != word.charAt(j))
                
				return false;
            
			++i;
            
			--j;
        
		}
        
		return true;
    
	}
    
	private static Scanner sc = new Scanner(System.in);
     
	public static void main(String []args){
        
		String word = sc.next();
        
		if(isPalindrome(word)){
            
			System.out.println("Palindrome");
        
		}else{
            
			System.out.println("Not Palindrome");
        
		}
     
	}

}