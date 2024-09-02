import java.util.*;
class Week_4_Assignment_48{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input the month as Integer : ");
		int month = input.nextInt();
		if (month > 0 && month <= 12){
			System.out.print("Input the day as Integer : ");
			int day = input.nextInt();
			if (month == 2 && day <= 29 && day > 0){
				if (day <= 18){
					System.out.println("Aquarius");
				}else{
					System.out.println("Pisces");
				}
			}else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 0 && day <= 31){
				if (month == 1 && day >= 20){
					System.out.println("Aquarius");
				}else if (month == 1){
					System.out.println("Capricornus");
				}else if (month == 3 && day <= 20){
					System.out.println("Pisces");
				}else if (month == 3){
					System.out.println("Aries(Ram)");
				}else if (month == 5 && day <= 20){
					System.out.println("Taurus");
				}else if (month == 5){
					System.out.println("Gemini");
				}else if (month == 7 && day <= 22){
					System.out.println("Cancer");
				}else if (month == 7 || (month == 8 && day <= 22)){
					System.out.println("Leo");
				}else if (month == 8){
					System.out.println("Virgo");
				}else if (month == 10 && day <= 23){
					System.out.println("Libra");
				}else if (month == 10){
					System.out.println("Scorpius");
				}else if (month == 12 && day <= 21){
					System.out.println("Sagittarius");
				}else if (month == 12){
					System.out.println("Capricornus");
				}
			}else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 0 && day <= 30){
				if (month == 4 && day <= 19){
					System.out.println("Aries(Ram)");
				}else if (month == 4){
					System.out.println("Taurus");
				}else if (month == 6 && day <= 21){
					System.out.println("Gemini");
				}else if (month == 6){
					System.out.println("Cancer");
				}else if (month == 9 && day <= 22){
					System.out.println("Virgo");
				}else if (month == 9){
					System.out.println("Libra");
				}else if (month == 11 && day <= 21){
					System.out.println("Scorpius");
				}else if (month == 11){
					System.out.println("sagittarius");
				}
			}else{
				System.out.println("Invalid day");
			}
		}else{
			System.out.println("Invalid month");
		}
	}
}
