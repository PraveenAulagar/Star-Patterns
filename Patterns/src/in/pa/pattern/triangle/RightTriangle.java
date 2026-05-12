package in.pa.pattern.triangle;
class Patterns
{
	public static void Right(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void RightInverted(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for( int j=1;j<=n;j++)
			{
				System.out.print((i+j<=n+1)?" *":"  ");
			}
			System.out.println();
		}
	}
}
public class RightTriangle {
	
	public static void main(String[] args) {
		
		//Patterns.Right(5);
		Patterns.RightInverted(5);
	}
}
