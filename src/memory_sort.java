import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class memory_sort implements Comparable{

	public String name = "";
	public int size = 0;
	public String speed = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("memory_sort.dat"));
		
		ArrayList<memory_sort> memlist = new ArrayList<memory_sort>();
		
		while(in.hasNext())
		{
			String line = in.nextLine();
			Scanner chop = new Scanner(line);
			chop.useDelimiter(",");

			memory_sort item = new memory_sort();
			item.name = chop.next();
			String s = chop.next();
			int si = Integer.parseInt(s.substring(0, s.indexOf("B")-1));
			
			if(s.contains("GB"))
			{
				si *= 1024;
			}
			item.size = si;
			s = chop.next();
			int spd = Integer.parseInt(s.substring(0, s.indexOf("M")));
			item.speed = s;//spd;
			
			memlist.add(item);
		}
		
		Collections.sort(memlist);
		String s;
		
		for(memory_sort m : memlist)
		{
			if(m.size >= 1024)
				s = "" + (m.size / 1024) + "GB";
			else
				s = m.size + "MB";
			
			System.out.printf("%s - (%s/%s)\n", m.name, s, m.speed);
		}
	}
	
	public int compareTo(Object cmp) {
		// TODO Auto-generated method stub
		
		memory_sort other = (memory_sort)cmp;
		
		int i = name.compareTo(other.name);
		if(i != 0) return i;
		
		i = other.size - size;
		if(i != 0) return i;
		
		return other.speed.compareTo(speed);//speed - other.speed;
	}

}
