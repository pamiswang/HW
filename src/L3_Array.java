import java.util.Random;
import java.util.Scanner;

public class L3_Array
{
	public static void main(String[] args)	//�q�Ʀr
	{
		int[] mathArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int A, B, N = 1, tempIndex, tempMath;
		String ans;
		Random ran = new Random();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < mathArray.length; i++) // ���ͤ����ƶü�
		{
			tempIndex = ran.nextInt(10);
			tempMath = mathArray[i];
			mathArray[i] = mathArray[tempIndex];
			mathArray[tempIndex] = tempMath;
		}
		System.out.println("�ѵ� " + mathArray[0] + "" + mathArray[1] + "" + mathArray[2] + "" + mathArray[3]);
		do
		{
			ans = String.format("%04d", scanner.nextInt()); // ��J�Ʀr��r��ø�0
			System.out.println("��" + N + "��" + ans);
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
		System.out.println("�q��F");
		scanner.close();
	}
}