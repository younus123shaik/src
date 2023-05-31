package Day5;
import java.util.*;
public class jaggedarray {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int arr[][]=new int[4][];
	
		for(int i=0;i<arr.length;i++)
		{
			String s[]= input.nextLine().split(" ");
			arr[i]=new int[s.length];
			for(int j=0;j<s.length;j++)
			{
				 arr[i][j]=Integer.parseInt(s[j],10);
			}
		}
		System.out.println(arr[2][3]);
		for(int[] i:arr)
			System.out.println(Arrays.toString(i));
	}

}
