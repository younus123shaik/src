package day6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import Day5.array;

public class reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		sc.nextLine();
		String[] s=sc.nextLine().split(" ");
		for(int i=0;i<n;i++)
		Array.set(arr,n-1-i,Integer.parseInt(s[i]) );

		   System.out.print(Arrays.toString(arr));
	}
}
