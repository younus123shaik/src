package day6;

import Day5.twodarray;
import java.util.*;

public class reflectarray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		twodarray ip= new twodarray();
		System.out.println("Enter no. of rows : ");
		int r= sc.nextInt();
	    System.out.println("Enter no. of col : ");
	    int c= sc.nextInt();
	    int[][] mat1=ip.Create(r,c);
		
		int[][] mat2=ip.Create(r,c);
		sc.nextLine();
		System.out.println("Enter matrix 1: ");
		ip.Setvalues(mat1);
		
		System.out.println("Enter matrix 2: ");
		
		
		int[][] mat3= ip.Create(r, c);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("Result of Addition matrix is :");
		for(int[] i:mat3)
			System.out.println(Arrays.toString(i));
	}
}
