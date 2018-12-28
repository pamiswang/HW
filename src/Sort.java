public class Sort
{

	public static void main(String[] args)
	{
		int[] array = { 5, 3, 2, 8, 1, 4 };
		System.out.println(sortArray(array));
	}

	public static int[] sortArray(int[] array)
	{
		int temp = 0; 
		if (array.length != 0)
		{
			for (int i = 0; i < array.length; i++)
			{
				if (array[i] % 2 == 1)
				{
					for (int j = i; j < array.length; j++)
					{
						if (array[j] % 2 == 1 & array[i] > array[j])
						{
							temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
			}
		}
		return array;
	}
}
