public class L1
{
	public static void main(String[] args)		//99­¼ªk
	{
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++)
			{
				System.out.print(   j +"x" + i +"=" + String.format("%02d", i*j) +"    ");				
			}			
			System.out.println( );	
		}
	}

}
