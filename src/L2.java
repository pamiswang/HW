import java.util.Random;

public class L2
{
	public static void main(String[] args)	//分數分組
	{
		int[] score = new int[20];
		Random ran = new Random();
		for (int i = 0; i < score.length; i++)
		{
			score[i] = ran.nextInt(101);
			System.out.print("score[" + i + "]=" + score[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < 100; i += 10)
		{
			System.out.print(i + "-" + (i + 10) + "  ");
			for (int j = 0; j < score.length; j++)
			{
				if (score[j] >= i && score[j] < (i + 10))
				{
					System.out.print(score[j] + "  ");
				}
			}
			System.out.println();
		}
	}
}
