import java.io.File;
import java.util.Scanner;


public class herons {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("herons.dat"));
		
		
		int lines = in.nextInt();
		in.nextLine();
		System.out.println(lines);
		for(int i = 0; i < lines; i++)
		{
			String line = in.nextLine();
			Scanner chop = new Scanner(line);
			chop.useDelimiter(",");
			double a = Double.parseDouble(chop.next());
			double b = Double.parseDouble(chop.next());
			double c = Double.parseDouble(chop.next());
			
			double s = (a + b + c) / 2;
			double A = Math.sqrt(s * (s-a)*(s-b)*(s-c));
			
			System.out.printf("%.3f\n", A);
			
		}

	}

}
