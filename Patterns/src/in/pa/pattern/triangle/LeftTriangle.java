package in.pa.pattern.triangle;
class patternThree
{
	public static void Left(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void LeftInverted(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((i<=j)?" *":"  ");
			}
			System.out.println();
		}
	}
}
public class LeftTriangle {
	
	public static void main(String[] args) {
		
		//patternThree.Left(5);
		patternThree.LeftInverted(5);
	}

}
