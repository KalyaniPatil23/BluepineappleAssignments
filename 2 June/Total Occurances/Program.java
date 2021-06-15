import java.util.*; 

public class Program {
    
	private static Scanner sc = new Scanner(System.in);
    
    
	public static void main(String[] args) {
        
		int N = sc.nextInt();
        
		int[] count = new int[10];
        
		while (N > 0) {
 
            
            
			int remainder = N % 10;
            
			count[remainder] = count[remainder] + 1;
            
            
            
			N = N / 10;
        
		}
        
		for(int i = 0; i<= 9; i++){
            
			System.out.println(i+" count : "+count[i]);
        
		}
    
	}


}