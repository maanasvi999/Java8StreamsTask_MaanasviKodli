import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("mba");
		list.add("mabbaa");
		list.add("mca");

		list = list.stream().filter(s -> s.startsWith("m")).filter(s -> s.length() == 3).collect(Collectors.toList());

		for(String elem : list)
			System.out.println(elem);

	}

}
