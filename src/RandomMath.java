import java.util.Random;
import java.util.TreeSet;

public class RandomMath
{
	public static void main(String[] args)
	{
		// makeMath mm = new makeMath();
		System.out.println(makeMath(1000, 20));
	}

	public static String makeMath(int N, int M)
	{
		Random ran = new Random();
		String math = "";
		TreeSet<String> result = new TreeSet<>();
		if (M > N)
		{
			M = N;
		}
		do
		{
			math = String.format("%0" + String.valueOf(N).length() + "d", ran.nextInt(N) + 1);
			result.add(math);
		} while (result.size() < M);
		System.out.println(result.size());
		return result.toString();
	}

}
