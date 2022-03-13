public class forDemo6 {
    public static void main(String args[]) {
        int count = 0;
        for(int i = 1; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                System.out.print(i + " ");
                count++;
                if(count % 2 == 0) {
                    System.out.println();
                }
            }
        }
    }
}