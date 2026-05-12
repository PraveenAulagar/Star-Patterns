package in.pa.pattern.daimond;
class PatternFive
{
	public static void diamondPattern(int n)
	{
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if((i+j>=n+1&&j-i<=n-1)&&(i+j<=n*3-1&&i-j<=n-1))
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
public class Daimond {
	
	public static void main(String[] args) {
		
		PatternFive.diamondPattern(9);
	}

}
