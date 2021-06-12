import java. util.*;
public class Program{
  private static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args){
    int r1, c1, r2, c2;
    // get input from user
    System.out.println("Enter First Matrix");
    System.out.println("Enter no. of Rows :-");
    r1 = sc.nextInt();
    System.out.println("Enter no. of columns :- ");
    c1 = sc.nextInt();
    int[][] A = new int[r1][c1];
    for(int row = 0 ; row < r1; row++){
      for(int col = 0; col < c1; col++){
        A[row][col] = sc.nextInt();
        
      }
    }
    System.out.println("Enter Second Matrix");
    System.out.println("Enter no. of Rows :-");
    r2 = sc.nextInt();
    System.out.println("Enter no. of columns :- ");
    c2 = sc.nextInt();
    int[][] B = new int[r2][c2];
    for(int row = 0 ; row < r2; row++){
      for(int col = 0; col < c2; col++){
        B[row][col] = sc.nextInt();
       
      }
    }
    int[][] M = new int[r1][c2];
    if(r2 != c1){
      System.out.println("Multiplication not Possible");
    }else{
      for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c2; j++) {
          for (int k = 0; k < r2; k++)
              M[i][j] += A[i][k] * B[k][j];
        }
      }
    }
            
    for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
  }
  
}