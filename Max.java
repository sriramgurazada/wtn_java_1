import java.io.*;
import java.util.*;
public class Max { 
      
    final static int N = 3; 
    final static int  M = 3; 
  
    
    static int findMax(int mat[][]) 
    { 
  
        
int max = Integer.MIN_VALUE; 
	
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < M; j++) { 
                if (mat[i][j] > max) { 
                    max = mat[i][j]; 
                } 
            } 
        } 
  
        return max ;
    } 
  
      public static void main(String args[]) 
    { 

        int[][] mat=new int[3][3];  
        Scanner sc=new Scanner(System.in);
	for(int i=0;i<N;i++)
	{
	for(int j=0;j<M;j++)
	{
		mat[i][j]=sc.nextInt();
	}
	}
        System.out.println(findMax(mat)) ; 
    
    } 
} 