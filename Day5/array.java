package Day5;
import java.util.*;
public class array {
	public static int linearsearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==key)
				return i;
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[4];
		String s[]= sc.nextLine().split(" ");
		for (int i = 0; i < s.length; i++) {
			arr[i]=Integer.parseInt(s[i], 10);
		}
		int key=3;
		System.out.println(linearsearch(arr,key));
		//System.out.println(Arrays.toString(arr));
		//System.out.println(arr[4]);
		sc.close();
	}
}
