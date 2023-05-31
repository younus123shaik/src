package Day3;
import java.util.Scanner;
public class input {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int tot=0;
	int ip;
	while(true){
		ip=sc.nextInt();

		if(ip>0)
		tot+=ip;
		else
			break;
		
	}
	sc.close();
		System.out.println(tot);
	
}
}
