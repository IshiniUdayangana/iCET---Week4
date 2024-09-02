import java.util.*;
class Week_4_assignment_50{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		try{
			System.out.print("Input degrees for angle 1 : ");
			int angle1 = input.nextInt();
			System.out.print("Input degrees for angle 2 : ");
			int angle2 = input.nextInt();
			System.out.print("Input degrees for angle 3 : ");
			int angle3 = input.nextInt();
			if (angle1 > 0 && angle2 > 0 && angle3 > 0 && angle1 < 180 && angle2 < 180 && angle3 < 180){
				int total = angle1 + angle2 + angle3;
				if (total == 180){
					System.out.println("It is a triangle");
				}else{
					System.out.println("It is not a triangle");
				}
			}else{
				System.out.println("Invalid degree range");
			}
		}catch (Exception e){
			System.out.println("Invalid input");
		}
	}
}
