import java.util.Random;
import java.util.Scanner;

public class L3_Array
{
	public static void main(String[] args)	//猜數字
	{
		int[] mathArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int A, B, N = 1, tempIndex, tempMath;
		String ans;
		Random ran = new Random();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < mathArray.length; i++) // 產生不重複亂數
		{
			tempIndex = ran.nextInt(10);
			tempMath = mathArray[i];
			mathArray[i] = mathArray[tempIndex];
			mathArray[tempIndex] = tempMath;
		}
		System.out.println("解答 " + mathArray[0] + "" + mathArray[1] + "" + mathArray[2] + "" + mathArray[3]);
		do
		{
			ans = String.format("%04d", scanner.nextInt()); // 輸入數字轉字串並補0
			System.out.println("第" + N + "次" + ans);
			N++;
			A = 0;
			B = 0;
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					if (i == j && Integer.valueOf(ans.substring(i, i + 1)) == mathArray[j])
					{
						A = A + 1;

					} else if (i != j && Integer.valueOf(ans.substring(i, i + 1)) == mathArray[j])
					{
						B = B + 1;
					}
				}
			}
			System.out.println(A + "A" + B + "B");
		} while (A != 4);
		System.out.println("猜對了");
		scanner.close();
	}
}