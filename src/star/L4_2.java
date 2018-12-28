package star;
public class L4_2
{
	public static void main(String[] args)
	{
		int N = 5;
		for (int i = 1; i <= N; i++)
		{
			for (int j = i; j < N; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
