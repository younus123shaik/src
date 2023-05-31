package Day4;
import java.util.Scanner;
public class square {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int sq=0;
	for (int i = 1; i <= n; i++) {
		sq+=n;
		
	}
	System.out.println(sq);
	System.out.println(sq*n);
	sc.close();
}
}
