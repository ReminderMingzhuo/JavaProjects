import java.util.Scanner;

//�ӱ���������ָ��ѭ��

public class jianFei2 {
    public static void main(String[] args) {
		//����ȷ�û��������Σ�ʹ����ѭ������ҵ���߼�
		//ƥ�䵽0��ʱ��ʹ��break������ѭ��
		lo: while(true) { //�����ѭ�������ֽ�lo
				Scanner sc = new Scanner(System.in);
				System.out.println("����������Ҫ�鿴��������");
				System.out.println("����������鿴��������0�˳�����");
				int week = sc.nextInt();
				switch(week) {
					case 0 :
						System.out.println("��л����ʹ��");
						break lo;
					case 1 : 
						System.out.println("�ܲ�");
						break;
					case 2 :
						System.out.println("��Ӿ");
						break;
					case 3 :
						System.out.println("����");
						break;
					case 4 :
						System.out.println("���е���");
						break;
					case 5 :
						System.out.println("ȭ��");
						break;
					case 6 :
						System.out.println("��ɽ");
						break;
					case 7 :
						System.out.println("��Ϣ");
						break;
					default :
						System.out.println("wrong data");
						break;
        }
		}
        
    }
}