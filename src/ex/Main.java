package ex;
import java.util.Arrays;
/**
 * Універсальний клас
 * @author 1
 *
 */
public class Main {
	/**
	 * Метод в якому обчислюється матриця.
	 * @param N кількість рядків і стовпців матриці.
	 * @param x початкове число відрахунку.
	 */
    public static void calculation(int N, int x) {
    	 int [][] matrix = new int[N][N];
    	 short n=0;
    	 /*Заповнення матриці*/
         for(int[] row:matrix) {
        	 for(int i:row) 
        		 Arrays.fill(row,n,++n,x++);   
        	 n=0;    
        	 }

         for(int[] row:matrix)
             System.out.println(Arrays.toString(row));
    }
}