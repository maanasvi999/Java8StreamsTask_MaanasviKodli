import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamTask1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(50, 123, 1, 34,10000);
		OptionalDouble average = list.stream()
									 .mapToInt(number -> number.intValue())
									 .average();
		System.out.println("Average of all: " + average.getAsDouble());
	}

}
