import java.util.*;
class Coursework4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------------------------------");
		System.out.println("|               SALARY INFORMATION SYSTEM              |");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("\t[1] Calculate Income Tax");
		System.out.println("\t[2] Calculate Annual Bonus");
		System.out.println("\t[3] Calculate Loan Amount");
		
		System.out.print("\nEnter an option to continue : ");
		String option = input.next();
		
		if (option.equals("1")){
			System.out.println("\n\n--------------------------------------------------------");
			System.out.println("|                 Calculate Income Tax                 |");
			System.out.println("--------------------------------------------------------");
		
			System.out.print("\nInput Employee name    - ");
			String name = input.next();
			System.out.print("Input Employee salary  - ");
			double salary = input.nextDouble();
		
			double tax = 0;
		
			if (salary >= 0 && salary <= 100000){
				tax = 0;
			}else if (salary > 100000){
				if ((salary - 100000) >= 41667){
					tax += 2500;
					if ((salary - 100000) >= 83333){
						tax += 7500;
						if ((salary - 100000) >= 125000){
							tax += 15000;
							if ((salary - 100000) >= 166667){
								tax += 25000;
								if ((salary - 100000) >= 208333){
									tax += 37500;
									if((salary - 100000) >= 266667){
										tax += (salary - 350000) * 36 / 100;
									}
								}else{
									tax += (salary - 266667) * 30 / 100;
								}
							}else{
								tax += (salary - 225000) * 24 / 100;
							}
						}else{
							tax += (salary - 183333) * 18 / 100;
						}
					}else{
						tax += (salary - 141667) * 12 /100;
					}
				}else{
					tax += (salary-100000) * 6 / 100;
				}
				System.out.println("\nYou have to pay Income Tax per month : " + tax);
			}else{
				System.out.println("Invalid input!");
			}
		
			
		}else if (option.equals("2")){
				
			System.out.println("\n\n--------------------------------------------------------");
				System.out.println("|                Calculate Annual Bonus                |");
				System.out.println("--------------------------------------------------------");
				
				System.out.print("\nInput Employee name     - ");
				String name = input.next();
				System.out.print("Input Employee salary   - ");
				double salary = input.nextDouble();
				
				double bonus = 0;
				
				if (salary >= 0 && salary <= 100000){
					bonus = 5000;
				}else if (salary >= 100000){
					bonus += 5000;
					if (salary >= 199999){
						bonus += (99999* 10 / 100);
						if (salary >= 299999){
							bonus += 99999 * 15 / 100;
							if (salary >= 399999){
								bonus += 99999 * 20 / 100;
								if (salary >= 400000){
									bonus += (salary - 399999) * 35 / 100;
								}
							}else{
								bonus += (salary - 300000) * 20 / 100;
							}
						}else{
							bonus += (salary - 200000) * 15 /100;
						}
					}else{
						bonus += (salary - 100000) * 10 / 100;
					}
				}else{
					System.out.println("Invalid input");
				}
				
				System.out.println("\nAnnual bonus    - " + bonus);
			
		}else if (option.equals("3")){
			System.out.println("\n\n--------------------------------------------------------");
			System.out.println("|                Calculate Loan amount                 |");
			System.out.println("--------------------------------------------------------");
			
			System.out.print("\nInput Employee name      - ");
			String name = input.next();
			System.out.print("Input Employee salary    - ");
			double salary = input.nextDouble();
			
			double loan;
			if (salary >= 50000){
				double rate = 15.0 / 100;
				double monthly_installement = salary * 0.6;
				System.out.print("Input the number of years  - ");
				int years = input.nextInt();
				
				int months = years * 12;
				
				if (years > 0 && years <= 5){
					loan = monthly_installement * (1 - Math.pow((1 + (rate / 12)),-months)) / (rate / 12);
					System.out.printf("\nYou can get Loan Ammount : %.2f" ,loan);
				}else if(years > 5){
					System.out.println("\nMaxumum number of years should be 5. ");
				}else{
					System.out.println("\nInvalid input");
				}
			}else if (salary < 50000){
				System.out.println("\nSalary should greater than 50000");
			}else{
				System.out.println("\nInvalid input");
			}
		}else{
			System.out.println("\nInvalid input");
		}
	}
}
