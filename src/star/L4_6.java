package star;
public class L4_6
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

		for (int i = N - 1; i >= 1; i--)
		{
			for (int k = i; k <= N; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
