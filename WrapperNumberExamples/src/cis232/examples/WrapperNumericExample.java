package cis232.examples;
import java.util.ArrayList;

public class WrapperNumericExample {
	
	public static void main(String[] args){
		int two = Integer.parseInt("2");
		
		System.out.printf("%d+%d=%d\n", two, two, two+two);
		
		System.out.println(Double.toString(50.2));
		System.out.println(Integer.toOctalString(255));
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(two);
		
		int five = numbers.get(0);
	}
}
