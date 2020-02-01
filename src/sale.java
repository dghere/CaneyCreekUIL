import java.io.File;
import java.util.Scanner;


public class sale {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("sale.dat"));

		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double t = -1;
		if(a != Math.min(a, b))
		{
			t = a;
			a = b;
			b = t;
		}
		if(a != Math.min(a, c))
		{
			t = a;
			a = c;
			c = t;
		}
		if(b != Math.min(b,  c))
		{
			t = b;
			b = c;
			c = t;
		}
		//  sorted!
		System.out.printf("%.2f, %.2f, %.2f\n", a, b, c);
		
		System.out.printf("%.2f\n", (b + c + .5*a)*1.0825);
	}

}
