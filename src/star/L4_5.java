package star;
public class L4_5
{
	public static void main(String[] args)
	{
		int N = 5;
		for (int i = 1; i <= N; i++)
		{

			for (int j = N; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
