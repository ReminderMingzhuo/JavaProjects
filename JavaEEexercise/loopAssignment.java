public class loopAssignment {
    public static void main(String[] args) {
		int k = 0;
        for(int i = 1949; i <= 2019; i++) {
			k = 2019 - i;
			if(k % 12 == 0) {
				System.out.println(i+"ÄêÊÇÖíÄê");
			}
		}
        
    }
}