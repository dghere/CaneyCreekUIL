import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class food_supply {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("food_supply.dat"));
		in.useDelimiter(",");
		while(in.hasNext())
		{
			int needed = in.nextInt();
			String barrels = in.nextLine();
			Scanner chop = new Scanner(barrels);
			chop.useDelimiter(",");
			int weeks = 0;
			int bsupp = 0;
			
			while(chop.hasNextInt())
			{
				bsupp += chop.nextInt();
				if(bsupp >= needed)
				{
					weeks++;
					bsupp = 0;
				}
								
			}
			System.out.println(weeks);
			chop.close();
		}
		in.close();
	}

}
