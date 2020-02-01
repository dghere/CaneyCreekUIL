import java.io.File;
import java.util.Scanner;


public class point_collection {

	static int moves = 0;
	static int max_moves = 0;
	static int score = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("point_collection.dat"));
		
		//while(in.hasNext())
		{
			max_moves = in.nextInt();
			moves = 0;
			score = 0;
			in.nextLine();
			char[][] map = new char[8][8];
			
			System.out.println(max_moves);
			
			for(int r = 0; r < 8; r++)
			{
				String line = in.nextLine();
				for(int c = 0; c < 8; c++)
				{
					map[r][c] = line.charAt(c);
					if(map[r][c] == '-')
						map[r][c] = 48;
				}
			}
			
			int[] start = findStart(map);
			System.out.println("Starting at[r,c]: " + start[0] + ", " + start[1]);
			//map[start[0]][start[1]] = 'Q';
			printMap(map);
			System.out.println();
			System.out.println(solve(map, start[0], start[1]));
			
			
			
			
		}
	}
	
	public static void printMap(char[][] m)
	{
		for(int r = 0; r < 8; r++)
		{
			for(int c = 0; c < 8; c++)
			{
				System.out.print(m[r][c]);
			}
			System.out.println();
		}
	}
	
	
	
	public static int[] findStart(char[][] m)
	{
		int[] start = new int[2];
		for(int r = 0; r < 8; r++)
		{
			for(int c = 0; c < 8; c++)
			{
				if(m[r][c] == ('S'))
				{
					start[0] = r;
					start[1] = c;
					return start;
				}
			}
		}
		return start;
	}

	public static int solve(char[][] m, int r, int c)
	{
		//m[r][c] = '-';
		moves++;
		if(m[r][c] == '*')//moves > max_moves)
		{
			System.out.println("Found it!");
			return m[r][c];
		}
		m[r][c] = 'W';
		//if(moves > 25) return -99;
		System.out.printf("Checking %d, %d\n", r, c);
		
		if(m[r][c-1] != 'W')
		{
			//score += m[r-1][c];
			System.out.println("moving West");
			return /*score + */solve(m, r, c-1);
		}
		if(m[r-1][c] != 'W')
		{
			System.out.println("moving North");
			return /*score + */solve(m, r-1, c);
		}
		if(m[r+1][c] != 'W')
		{
			System.out.println("moving South");
			return /*score + */solve(m, r+1, c);
		}
		if(m[r][c+1] != 'W')
		{
			System.out.println("moving East");
			return /*score + */solve(m, r, c+1);
		}
		
		
		return 0;
	}
	
	public static boolean isNumber(int x)
	{
		return (x >= '0' || x <= '9');
	}
	

}
