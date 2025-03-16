package SupplierFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {
	
	//Supplier - get()
	//It does't take any input from us, but it do something and return some output

	public static void main(String[] args) {
		
		Supplier<Date> s =()-> new Date();
		s.get();
		

	}

}
