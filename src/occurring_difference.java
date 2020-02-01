import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class occurring_difference {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("occurring_difference.dat"));
		
		while(in.hasNext())
		{
			String line = in.nextLine();
			Scanner chop = new Scanner(line);
			ArrayList<Integer> nums = new ArrayList<Integer>();

			while(chop.hasNextInt())
				nums.add(chop.nextInt());
			
			int maxOccur = Integer.MIN_VALUE;;
			int minOccur = Integer.MAX_VALUE;;
			int cnt = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			//for(int c : nums)
			//	System.out.println(c);
			int prev = -1;
			for(int i = 0; i < nums.size(); i++)
			{
				//cnt++;
				if(nums.get(i) == prev)
					continue;
				
				for(int j = 0; j < nums.size(); j++)
				{
					if(nums.get(i) == nums.get(j))
						cnt++;
				}
				//System.out.printf("val: %d occur: %d\n", nums[i], cnt);
				if(cnt > maxOccur)
				{
					maxOccur = cnt;
					max = nums.get(i);
				}
				if(cnt < minOccur)
				{
					minOccur = cnt;
					min = nums.get(i);
				}
				cnt=0;
				prev = nums.get(i);
			}
			System.out.printf("The difference is %d\n", max - min);
		}
	}

}
