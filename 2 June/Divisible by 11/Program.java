
import java.util.*;


public class Program {
    
	private static Scanner sc = new Scanner(System.in);
    
    
	public static void main(String[] args) {
        
		int N = sc.nextInt();
        
		for(int i = 1; i < N; i++){
            
			int divisible = i*11;
            
			if(divisible <= N)              
				System.out.println(divisible);
            
		}        
	
	}

}