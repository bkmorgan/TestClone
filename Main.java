import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;


public class Main {

	public static void main(String[] args) {				
		new Thread(() -> {
			System.out.println("Printing form the Runnable");
			System.out.println("Line 2");
			System.out.println("Line 3");
		}).start(); 
		
		Employee John = new Employee("John Doe ", 30);
		Employee Tim = new Employee("Tim BeQuick ", 40);
		Employee Jack = new Employee("Jack BeNimble ", 22);
		Employee Snow = new Employee("Snow White ", 22);
		
		List<Employee> employeees = new ArrayList<>();
		employeees.add(John);
		employeees.add(Tim);
		employeees.add(Jack);
		employeees.add(Snow);
		
		// lamdas
		Collections.sort(employeees, (employee1, employee2) ->
		employee1.getName().compareTo(employee2.getName()));
		
//		Collections.sort(employeees, (Employee employee1, Employee employee2) ->
//			employee1.getName().compareTo(employee2.getName()));
		
//		Collections.sort(employees, new Comparator<Employees>() {
//			@Override
//			public int compare(Employee employee1, Employee employee2) {
//				return employee1.getName().compareTo(employee2.getName());
//			}
//		});
			
		for (Employee employee : employeees) {
			System.out.println(employee.getName());
		}
		
		//lambdas
		UpperConcat uc = (s1, s2) -> {
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;
		};
		
//		UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
//		String sillyString = doStringStuff(uc, employeees.get(0).getName(), employeees.get(1).getName());
//		System.out.println(sillyString);
		
		
		String sillyString = doStringStuff(uc, employeees.get(0).getName(), employeees.get(1).getName());
		System.out.println(sillyString);	
		
//		String sillyString = doStringStuff(new UpperConcat() {			
//			@Override
//			public String upperAndConcat(String s1, String s2) {
//				return s1.toUpperCase() + s2.toUpperCase();
//			}
//		},
//		employeees.get(0).getName(), employeees.get(1).getName());
//		System.out.println(sillyString);
		
	}
	
	public final static String doStringStuff(UpperConcat uc, String s1, String s2)  {
		return uc.upperAndConcat(s1, s2);
	}
}			
		
class Employee {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
		
}

interface UpperConcat {
	public String upperAndConcat(String s1, String s2);
}




//	// lamda with block of code, add {}
//	public static void main(String[] args) {				
//		new Thread(() -> {
//			System.out.println("Printing form the Runnable");
//			System.out.println("Line 2");
//			System.out.println("Line 3");
//		}).start();
//	}
//}

//	// one line of code
//	// compiler doesn't need a {} after lamda with only one line in method
//	public static void main(String[] args) {	
//		new Thread(() -> System.out.println("Printing form the Runnable")).start();
//	}
//}

//	// before lamdas
//	public static void main(String[] args) {
//	new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Printing from the Runnable");
//			}
//		}).start();
//	}
//}
	

//	// old way
//	public static void main(String[] args) {
//		new Thread(new CodeToRun()).start();
//	}	
//}
//
//class CodeToRun implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("Printing from the Runnable");
//	}
//}

