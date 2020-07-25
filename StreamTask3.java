import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTask3 {

	public static void main(String args[])
	{
		List<String> list=new ArrayList<String>();
		list.add("world");
		list.add("mom");
		list.add("hello");
		list.add("madam");
		list.add("dad");

		list = getPalindromes(list);
		for(String elem : list)
			System.out.println(elem);
	}

	static List<String> getPalindromes(List<String> wordList)
	{
		List<String> ansList = new ArrayList<String>();
		for(String string : wordList)
		{
			String s = string.replaceAll("\\s+", "").toLowerCase();
			if( IntStream.range(0,s.length()/2).noneMatch(j -> s.charAt(j)!= s.charAt(s.length()-j-1)))
				ansList.add(string);
		}
		return ansList;
	}

}
