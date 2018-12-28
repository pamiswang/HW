package star;
public class L4_4
{
	public static void main(String[] args)
	{
		int N = 5;
		for (int i = 1; i <= N; i++)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i ; k <=  N ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
