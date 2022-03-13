public class continueDemo1 {
    public static void main(String[] args) {
        //电梯上行1-24层，4层不停
        for(int i =0; i <= 24; i++) {
			if(i == 4) {
				continue;
			}
            System.out.println(i+"层到了~");
        }
        
    }
}