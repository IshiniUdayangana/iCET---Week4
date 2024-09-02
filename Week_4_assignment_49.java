import java.util.*;
class Week_4_assignment_49{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.print("Input basic salary : ");
			double salary = input.nextDouble();
			double grossSalary = salary;
			if (salary >= 0){
				if (salary <= 10000){
					grossSalary += salary * 20.0 / 100 + salary * 60.0 / 100;
				}else if (salary <= 20000){
					grossSalary += salary * 25.0 / 100 + salary * 70.0 / 100;
				}else{
					grossSalary += salary * 30.0 / 100 + salary * 75.0 / 100;
				}
			}else{
				System.out.println("\nInvalid input");
			}
			System.out.printf("Gross Salary = %.2f", grossSalary);
		}catch(Exception e){
			System.out.println("\nInvalid input");
		}
	}
}
