import java.util.*;



public class Program {
    
	private static Scanner sc = new Scanner(System.in);
    
	private static boolean isPerfectNumber(int n){
        
		int sum = 1;
        
			for(int i = 2; i < n; i++){
	       
				if(n%i == 0)
		        
					sum += i;

        		}

        		if(sum == n)
		            return true;
       
            
			return false;
	}

    	public static void main(String[] args) {
               	
		int N = sc.nextInt();

        	for(int i = 1; i <= N; i++){

       		     if(isPerfectNumber(i))

                	System.out.println(i);

                }
    
      }
}
