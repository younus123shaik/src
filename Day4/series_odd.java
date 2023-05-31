package Day4;

public class series_odd {
public static void main(String[] args) {
	for(int i=1;i<10;i++)
	{
		for(int j=1;j<10;j++)
		{
			for(int k=1;k<10;k++)
			{
				if(i+j==11 && j+k==8 && i+k==5)
					System.out.println(i+" "+j+" "+k);
			}
		}
		
	}
}
}
