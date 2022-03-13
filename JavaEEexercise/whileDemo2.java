public class whileDemo2 {
    public static void main(String[] args) {
        double paper = 0.1;
        double height = paper;
        int flip = 0;
        while(height < 8844430) {
            height = height * 2;
            System.out.println(height);
            flip ++;
        }
        System.out.println("the fliping times:" + flip);
    }
}