package in.pa.pattern.butterFly;

class PatternTwo
{
	public static void butterFlyPattern(int n)
	{
		for(int i =1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if((i>=j&&i+j<=n*2)||(i<=j&&i+j>=n*2))
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
public class ButterFly {
	
	public static void main(String[] args) {
		
		PatternTwo.butterFlyPattern(5);
	}

}
