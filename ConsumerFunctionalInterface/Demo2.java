package ConsumerFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	
	String ename;
	int salary;
	String gender;
	
	Employee(String ename,int salary, String gender){
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
}

public class Demo2 {
	
	//1.Calculate Bonus - Function
	//2.Check bonus > 5000 - Predicate
	//3.Print the details of employee if bonus > 5000 - Consumer

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Thangakani" ,55000 , "Female"));  //Directly adding object
		al.add(new Employee("Akash" ,60000 , "Male"));
		al.add(new Employee("Nivetha" ,45000 , "Female"));
		al.add(new Employee("Kayal" ,80000 , "Female"));
		al.add(new Employee("Pravin" ,70000 , "Male"));
		al.add(new Employee("Alex" ,90000 , "Male"));
		
		//Function - to calculate bonus
		Function<Employee,Integer> f1 = e -> (e.salary * 10)/100;  //task 1
		
		//Predicate - Find bonus value is >7000 or not
		
		Predicate<Integer> p1 = b-> b>=7000;  //task 2 
		
		//Consumer - print the details of employee 
		
		Consumer<Employee> c1 = emp->{  //task 3
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		};
		
		for(Employee emp :al) {
			
			int bonus = f1.apply(emp);  //calculate bonus
			
			if(p1.test(bonus)) {  //Invoked predicate
				c1.accept(emp);   //invoked Consumer
				System.out.println( emp.ename + " bonus is : "+bonus);
			}
		}
		

	}

}
