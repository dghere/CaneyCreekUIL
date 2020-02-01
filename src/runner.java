import java.io.File;
import java.util.Scanner;


public class runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("runner.dat"));
		float miles = 0.0f;
		float hours = 0.0f;
		
		for(int i = 0; i < 5; i++)
		{
			miles += in.nextInt() / 5280.0f;
			hours += in.nextInt() / 60.0f;
			
		}
		System.out.printf("Your speed was %.3f miles per hour.\n", (miles/hours));
	}

}
