public class forwhile {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            //for 循环内部定义的变量，在循环结束之后，就会从内存中消失
            System.out.println("ok:");
        }
        System.out.println(i); //错误，找不到符号i
        for(int i = 1; i <= 5; i++) {
            //因此重新定义一次也没关系
            System.out.println("ok:");
        }

        //while循环控制语句所使用的自增变量不归属于其语法结构，因此循环结束后，该变量还可以继续使用
        int a = 1;
        while(a <= 5) {
            System.out.println(a);
            a++;
        }
        System.out.println(a+"...");

    }
}