class Employee {
 public String getRole() {
     return "Employee";
 }
}

class Manager extends Employee {
 @Override
 public String getRole() {
     return "Manager";
 }
}

class Developer extends Employee {
 @Override
 public String getRole() {
     return "Developer";
 }
}

public class EmployeeManagement {
	 public static void main(String[] args) {

	        Employee emp1 = new Manager();
	        Employee emp2 = new Developer();
	        System.out.println("emp1's role: " + emp1.getRole()); 
	        System.out.println("emp2's role: " + emp2.getRole());;  
	
	 }
}
