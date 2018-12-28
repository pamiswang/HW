package star;
public class L4_3
{
	public static void main(String[] args)
	{
		int N = 5;
		for (int i = N; i >= 1; i--)
		{
			for (int j = 5; j >= i; j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
