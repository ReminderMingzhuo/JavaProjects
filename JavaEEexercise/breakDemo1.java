public class breakDemo1 {
    public static void main(String[] args) {
        //模拟20岁工作到80岁，60岁退休
        for(int i =20; i <= 80; i++) {
			if(i == 60) {
				break; //stop the loop
			}
            System.out.println(i+"岁在上班~");
        }
        
    }
}