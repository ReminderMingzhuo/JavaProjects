import java.util.Random;
import java.util.Scanner;
//猜数字，程序自动生成一个1-100之间的数字，
//使用程序实现猜出这个数字是多少
public class randomDemo2 {
    public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int randomNum = r.nextInt(100) + 1;
		
		while(true){
			System.out.print("请输入您要猜测的数据：");
			int num = sc.nextInt();
			if(num > randomNum) {
				System.out.println("猜大了");
			} else if(num < randomNum) {
				System.out.println("猜小了");
			} else {
				System.out.println("恭喜，猜中了");
				break;
			}
		}
		
		System.out.println("感谢您的使用");
    }
}