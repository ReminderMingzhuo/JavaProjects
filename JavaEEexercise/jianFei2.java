import java.util.Scanner;

//加标明号跳出指定循环

public class jianFei2 {
    public static void main(String[] args) {
		//不明确用户操作几次，使用死循环包裹业务逻辑
		//匹配到0的时候，使用break结束死循环
		lo: while(true) { //给这个循环起名字叫lo
				Scanner sc = new Scanner(System.in);
				System.out.println("请输入您想要查看的星期数");
				System.out.println("如无需继续查看，请输入0退出程序");
				int week = sc.nextInt();
				switch(week) {
					case 0 :
						System.out.println("感谢您的使用");
						break lo;
					case 1 : 
						System.out.println("跑步");
						break;
					case 2 :
						System.out.println("游泳");
						break;
					case 3 :
						System.out.println("慢走");
						break;
					case 4 :
						System.out.println("动感单车");
						break;
					case 5 :
						System.out.println("拳击");
						break;
					case 6 :
						System.out.println("爬山");
						break;
					case 7 :
						System.out.println("休息");
						break;
					default :
						System.out.println("wrong data");
						break;
        }
		}
        
    }
}