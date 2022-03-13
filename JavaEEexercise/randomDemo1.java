import java.util.Random;

public class randomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
		for(int i = 1;i <= 10; i++) {
			int num = r.nextInt(10) + 1; //1-10
			System.out.println(num);
		}
        
    }
}