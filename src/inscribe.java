import java.io.File;
import java.util.Scanner;


public class inscribe {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("inscribe.dat"));

		
		while(in.hasNext())
		{
			int n = in.nextInt();
			char[][] mat = new char[n][n];
			
			for(int i = 0; i < n; i++)
			{
				char ch = (char)(i-n / 2 + 65);
				for(int r = 0; r < n; r++)
				{
					for(int c = 0; c < n; c++)
					{
						if(r == i || r == n-1-i || c == i || c == n-1-i)
							mat[r][c] = ch;
					}
				}
			}
						
			for(int r = 0; r < mat.length; r++)
			{
				for(int c = 0; c < mat[r].length; c++)
				{
					System.out.print(mat[r][c]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
