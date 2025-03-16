package ConsumerFunctionalInterface;

import java.util.function.Consumer;

public class Demo1 {
	
	//Consumer - accept() method
	//Consumer will always take one argument or one parameter it doesnt return any value for us, it just performs some operations it repeats output but it doesnt return any value for us 

	public static void main(String[] args) {
		
		Consumer<String> c = s-> System.out.println(s);
		
		c.accept("Thangakani");
		

	}

}
