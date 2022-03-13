import java.util.Scanner;
public class ControlExercise2 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in the amount of money:");
		int money = sc.nextInt();
		if(money >= 1000) {
			System.out.println("Please type in the years:");
			int years = sc.nextInt();
			double result = 0;
			switch(years){
				case 1:
				    result = money * 1.0225;
					System.out.println("result:" + result);
					break;
				case 2:
				    result = money * 1.027;
					System.out.println("result:" + result);
					break;
				case 3:
				    result = money * 1.0325;
					System.out.println("result:" + result);
					break;
				case 5:
				    result = money * 1.036;
					System.out.println("result:" + result);
					break;
				default :
				    System.out.println("Please enter years = 1/2/3/5");
			}
		}
		else {
			System.out.println("Please type in the money>=1000");
		}
	}
	
	
}