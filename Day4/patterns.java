package Day4;

public class patterns {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for(int j=0 ;j<10;j++) {
				if(i<5) {
				if(j>=5-i && j<=5+i)
				System.out.printf("*");
				else
					System.out.printf(" ");
				}
				else if(i>5)
				{
					if(j>=5-(10-i-1) && j<=5+(10-i-1))
						System.out.printf("*");
					else
						System.out.printf(" ");
				}
				
			}
			if(i==5)
				continue;
			System.out.println("");
		}
	}
}
