package FunctionFunctionalInterface;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		
		//peFunction interface takes one parameter(any type) as argument and return one value which is of any tym
		
		//Example -1 pass one argument and return square of this argument
		
		Function<Integer,Integer> f = n-> n*n;
		
		System.out.println(f.apply(10));
		
		System.out.println(f.apply(5));
		
		System.out.println(f.apply(2));
		
		//Example -2 pass string as argument and return length of the string
		
		Function <String,Integer> f1 = s-> s.length();
		System.out.println(f1.apply("Thangakani"));

	}

}
