import java.util.*;
class Week_4_assignment{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the month as integer : ");
		int month = input.nextInt();
		if (month > 0 && month <= 12){
			if (month == 2){
				System.out.print("Input the day as integer : ");
				int day = input.nextInt();
				if (day > 0 && day <= 29){
					System.out.println("Winter");
				}else{
					System.out.println("Invalid input");
				}
			}else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
				System.out.print("Input the day as a integer : ");
				int day = input.nextInt();
				if (day > 0 && day <= 31){
					if((month == 12 && day >= 21) || (month == 3 && day <= 19) || (month == 1)){
						System.out.println("Winter");
					}else if ((month == 3 && day >= 20) || (month == 5)){
						System.out.println("Spring");
					}else if (month == 7 || month == 8){
						System.out.println("Summer");
					}else if (month == 10 || (month == 12 && day <= 20)){
						System.out.println("Autumn");
					}
				}else{
					System.out.println("Invalid input");
				}
			}else if (month == 4 || month == 6 || month == 9 || month == 11){
				System.out.print("Input the day as a integer : ");
				int day = input.nextInt();
				if (day > 0 && day <= 30){
					if ((month == 4) || (month == 6 && day <= 20)){
						System.out.println("Spring");
					}else if ((month == 6 && day >= 21) || (month == 9 && day <= 21)){
						System.out.println("Summer");
					}else if ((month == 9 && day >= 22) || month == 11){
						System.out.println("Autumn");
					}
				}else{
					System.out.println("Invalid input");
				}
			}else{
				System.out.println("Invalid input");
			}
		}else{
			System.out.println("\nInvalid input");
		}
	}
}
