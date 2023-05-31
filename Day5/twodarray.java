package Day5;
import java.util.*;
public class twodarray {
	public  int[][] Create(int r,int c)
	{
		int[][] arr= new int[r][c];
		return arr;
	}
	
	public void Setvalues(int[][] arr) {
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			String s[]=sc.nextLine().split(" ");
			for(int j=0;j < s.length;j++)
			{
				arr[i][j]=Integer.parseInt(s[j], 10);
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		
	
	}
}
