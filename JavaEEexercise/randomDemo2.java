import java.util.Random;
import java.util.Scanner;
//�����֣������Զ�����һ��1-100֮������֣�
//ʹ�ó���ʵ�ֲ³���������Ƕ���
public class randomDemo2 {
    public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int randomNum = r.nextInt(100) + 1;
		
		while(true){
			System.out.print("��������Ҫ�²�����ݣ�");
			int num = sc.nextInt();
			if(num > randomNum) {
				System.out.println("�´���");
			} else if(num < randomNum) {
				System.out.println("��С��");
			} else {
				System.out.println("��ϲ��������");
				break;
			}
		}
		
		System.out.println("��л����ʹ��");
    }
}