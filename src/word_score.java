import java.io.File;
import java.util.Scanner;


public class word_score {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			String vowels = "aeuio";
			
			Scanner in = new Scanner(new File("word_score.dat"));
			
			while(in.hasNext())
			{
				String line = in.nextLine();
				int max_score = -1;
				String max_word = "";
				Scanner ls = new Scanner(line);
				while(ls.hasNext())
				{
					String word = ls.next();
					word = word.toLowerCase();
				
					int score = word.length() / 2;
					for(int i = 0; i < word.length(); i++)
					{
						if(vowels.contains("" + word.charAt(i)))
							score++;
						if(word.charAt(i) == 'z')
							score += 2;
						if(word.charAt(i) == 'x' || word.charAt(i) == 'q')
								score += 3;
					}
					if(score > max_score)
					{
						max_score = score;
						max_word = word;
					}
				}
				System.out.println(max_word + " - " + max_score);
				ls.close();
				
			}
			in.close();
	}

}
