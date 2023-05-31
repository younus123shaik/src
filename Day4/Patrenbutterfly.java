package Day4;

public class Patrenbutterfly {
	public static void main(String[] args) {
		int i=0;
		boolean flag=false;
		while(i>=0)
		{
			if(i>=5 || flag) {
				i-=2;
				flag=true;
			}
			for(int j=0;j<10;j++)
			{
				
					if((j<=i || j>=9-i ))
						System.out.print("*");
					else
					System.out.printf(" ");
				
			}
			i++;
			System.out.println(" ");
			
		
		}
	}
}
