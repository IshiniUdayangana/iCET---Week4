import java.util.*;
class Week_4_assignment_52{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		
		try{
			System.out.print("Input X coordinate : ");
			double x = input.nextDouble();
			System.out.printw("Input Y coordinate : ");
			double y = input.nextDouble();
		
			if(x == 0 || y == 0){
				System.out.println("It does not belong to any of the four quadrant");
			}else if (x > 0 && y > 0){
				System.out.println("Quadrant I");
			}else if (x < 0 && y > 0){
				System.out.println("Quadrant II");
			}else if (x < 0 && y < 0){
				System.out.println("Quadrant III");
			}else{
				System.out.println("Quadrant IV");
			}
		}catch (Exception e){
			System.out.println("Invalid input");
		}
	}
}
