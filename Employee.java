package letsupgrade.java;

public class Employee {
	
	String name;
	int age;
	String city;
	
	public void display() {
		System.out.println("The name of the Employee is: " + name);
		System.out.println("The age of the Employee is: " + age);
		System.out.println("The city of the Employee is: " + city);
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Sherlock Holmes";
		emp1.age = 23;
		emp1.city = "London";
		
		Employee emp2 = new Employee();
		emp2.name = "James Bond";
		emp2.age = 24;
		emp2.city = "London";
		
		System.out.println("\nDetails of Employee-1:");
		emp1.display();
		System.out.println("\nDetails of Employee-2:");
		emp2.display();
	}
}