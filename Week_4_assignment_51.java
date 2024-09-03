import java.util.*;
class Week_4_assignment_51{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		try{
			System.out.print("Enter your age : ");
			float age = input.nextFloat();
			if (age > 0 && age <= 120){
				if (age > 65){
					System.out.println("Invalid input");
				}else if (65 >= age && age > 20){
					System.out.println("Adult");
				}else if(20 >= age && age > 13){
					System.out.println("Tenager");
				}else if (13 >= age && age > 1){
					System.out.println("child");
				}else{
					System.out.println("Infant");
				}
			}else{
				System.out.println("Invalid input");
			}
		}catch (Exception e){
			System.out.println("Invalid inputtt");
		}
	}
}
