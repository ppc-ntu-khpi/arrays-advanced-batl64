package ex;
import java.util.Arrays;
/**
 * ������������� ����
 * @author 1
 *
 */
public class Main {
	/**
	 * ����� � ����� ������������ �������.
	 * @param N ������� ����� � �������� �������.
	 * @param x ��������� ����� ���������.
	 */
    public static void calculation(int N, int x) {
    	 int [][] matrix = new int[N][N];
    	 short n=0;
    	 /*���������� �������*/
         for(int[] row:matrix) {
        	 for(int i:row) 
        		 Arrays.fill(row,n,++n,x++);   
        	 n=0;    
        	 }

         for(int[] row:matrix)
             System.out.println(Arrays.toString(row));
    }
}