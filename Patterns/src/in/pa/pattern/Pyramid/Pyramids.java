package in.pa.pattern.Pyramid;
class PatternFour
{
	public static void upSide(int n)
	{
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(i+j>=n+1&&j-i<=n-1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void downSide(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(i<=j&&i+j<=n*2)
					System.out.print(" *");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void rightSide(int n)
	{
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((i>=j&&i+j<=n*2)?" *":"  ");
			}
			System.out.println();
		}
	}
	
	public static void leftSide(int n)
	{
		for(int i=1;i<=n*2;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((i+j>=n+1&&i-j<=n-1?" *":"  "));
			}
			System.out.println();
		}
	}
}
public class Pyramids {
	public static void main(String[] args) {
		
		//PatternFour.upSide(5);
		//PatternFour.downSide(5);
		//PatternFour.rightSide(5);
		PatternFour.leftSide(7);
	}

}
