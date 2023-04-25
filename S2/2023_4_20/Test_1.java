public class Test_1 {
    public static void main(String[] args) {
        /*
        int a;
        System.out.println(a);// 局部变量需要先定义与赋值再使用
        System.out.println("Hello World");
         */
        int a = 100;//演示数值
        System.out.println(a);
        //整形  4字节  -2^31 ~ -2^31-1
        //下面为显示出int的最大最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("===========");


        //字节型  2字节  -2^7 ~ -2^7 - 1
        byte b = 12;
        System.out.println(b);
        //下面为显示出的byte最大最小值
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("===========");


        //长整型  8字节  -2^63 ~ -2^63 - 1
        long l = 10l;//不推荐看起来像1001
        long ll = 10L;//一般更加以加大写L，因为小写l与1不好区分
        System.out.println(l);
        //下面为显示出long的最大最小值
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("===========");
        //长整型变量的初始值后加L或者l，推荐加L
        //长整型不论在那个系统下都占8个字节
        //long的包装类型为Long


        //短整型  2字节  -2^15 ~ -2^15 - 1
        short s = 12;
        System.out.println(s);
        //下面为显示出short的最大最小值
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("===========");
        //short在任何系统下都占2个字节
        //short的表示范围为：-32768 ~ 32767
        //使用时注意不要超过范围(一般使用比较少)
        //short的包装类型为Short



    }
}
