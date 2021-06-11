import java.util.*;

public class Program {
    
	private static Scanner sc = new Scanner(System.in);
    
	static int countDigits(long n)
    {
        
		int count = 0;
        
		while (n != 0) {
            
			n = n / 10;
            
			++count;
        
		}
        
		return count;
    
	}
    
	public static void main(String[] args) {
        
		long N = sc.nextInt();
        
		System.out.println(countDigits(N));
    
	}

}