package FunctionFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	 
	 String ename;
	 int salary;
	 Employee(String ename, int salary){
		 this.ename = ename;
		 this.salary = salary;
	 }
	 
	
}

public class Demo2 {
	
	//Pass the Employee obj and do some conditions and return the bonus
	
	public static void main(String[] args) {
		
		ArrayList<Employee> empobj = new ArrayList<Employee>();
		empobj.add(new Employee("Kani" ,20000));
		empobj.add(new Employee("Nivi" ,40000));
		empobj.add(new Employee("Loga" ,50000));
		empobj.add(new Employee("Sumi" ,15000));
		empobj.add(new Employee("Suba" ,35000));
		empobj.add(new Employee("Akash" ,60000));
		
		//create a bonus of salary for employees and return
		
		Function <Employee , Integer> f = e -> {
			int sal = e.salary;
			
			if(sal>= 10000 && sal<=20000) 
				return (sal * 10/100);
			else if(sal >20000 && sal<=30000)
				return (sal * 20/100);
			else if(sal>30000 && sal<=50000)
				return (sal * 30/100);
			else
				return (sal * 40/100);
			
		};
		
		Predicate<Integer> pr = b-> b>10000;
		
		
		for(Employee emp :empobj) {
			int bonus = f.apply(emp);  //Return bonus of every employees
			
			if(pr.test(bonus)) {  // if this condition is true then it will return the values
			
			System.out.println(emp.ename + " " + emp.salary + " Bonus is : " + bonus);
			}
			
			//If the bonus value is greater than 5000 then only i need to print the employees
		}
		
		

	}

}
