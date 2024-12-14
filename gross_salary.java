package HW_Day4;

import java.util.Scanner;

public class gross_salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your gross salary:");
		int salary = sc.nextInt();
		double gross;
		if(salary <= 10000 && salary >= 5000) {
			gross = salary + (0.4 * salary);
			System.out.println("Your salary is: "+gross);
		}else if(salary >= 10000 && salary <= 50000) {
			gross = salary + (0.5 * salary);
			System.out.println("Your salary is: "+gross);
		}else {
			System.out.println("Invalid salary");
		}
	}

}