import java.util.*;

public class Program {
    
	private static Scanner sc = new Scanner(System.in);
    
	private static void checkAlphabate(char ch){
        
		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 112))
            
			System.out.println("Alphabate");
        
		else
            
			System.out.println("Not Alphabate");
    
	}
    
	public static void main(String[] args) {
        
		char ch = sc.next().charAt(0);
        
		checkAlphabate(ch);
    
	}

}