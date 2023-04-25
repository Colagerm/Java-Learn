public class Test_2 {
    public static void main(String[] args){

//        双精度浮点型
        int a = 1;
        int b = 2;
        System.out.println(a / b); // 输出 0.5 吗？
        //在 Java 中, int 除以 int 的值仍然是 int(会直接舍弃小数部分)。如果想得到 0.5, 需要使用 double 类型计算.

        double c = 1.0;
        double d = 2.0;
        System.out.println(c / d); // 输出0.5


        double num = 1.1;
        System.out.println(num * num); // 输出1.21吗？
        // 执行结果
        //1.2100000000000002

        //double在任何系统下都占8个字节
        //浮点数与整数在内存中的存储方式不同，不能单纯使用 的形式来计算
        //double的包装类型为Double
        // double 类型的内存布局遵守 IEEE 754 标准(和C语言一样), 尝试使用有限的内存空间表示可能无限的小数, 势
        //必会存在一定的精度误差，因此浮点数是个近似值，并不是精确值。


//        单精度浮点型
        float num1 = 1.0f; // 写作 1.0F 也可以
        System.out.println(num1);


    }

}
