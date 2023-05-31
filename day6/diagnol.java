package day6;

import java.util.Scanner;
import Day5.twodarray;
public class diagnol {
	
	public static void main(String[] args) {
		twodarray ip= new twodarray();
		Scanner sc= new Scanner(System.in);
		int[][] arr =ip.Create(sc.nextInt(),sc.nextInt());
		ip.Setvalues(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i][i];
		System.out.println(sum);
		sc.close();
	}
}
