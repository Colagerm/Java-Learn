public class Test_Translate {
    public static void main(String[]args){
/*
        Java 作为一个强类型编程语言, 当不同类型之间的变量相互赋值的时候, 会进行较严格的校验.
*/

/*
        int a = 100;
        long b = 1000L;
        b = a; // 可以通过编译
        a = b; // 编译失败
*/

/*
        在Java中，当参与运算数据类型不一致时，就会进行类型转换。
        Java中类型转换主要分为两类：自动类型转换(隐式) 和 强制类型转换(显式)。
*/

/*
        自动类型转换即：代码不需要经过任何处理，在代码编译时，编译器会自动进行处理。
        特点：数据范围小的转为数 据范围大的时会自动进行。
*/

/*
        System.Out.println(1024); // 整型默认情况下是int
        System.Out.println(3.14); // 浮点型默认情况下是double
        int a = 100;
        long b = 10L;
        b = a; // a和b都是整形，a的范围小，b的范围大，当将a赋值给b时，编译器会自动将a提升为long类型，然后赋值
        a = b; // 编译报错，long的范围比int范围大，会有数据丢失，不安全
        float f = 3.14F;
        double d = 5.12;
        d = f; // 编译器会将f转换为double，然后进行赋值
        f = d; // double表示数据范围大，直接将float交给double会有数据丢失，不安全
        byte b1 = 100; // 编译通过，100没有超过byte的范围，编译器隐式将100转换为byte
        byte b2 = 257; // 编译失败，257超过了byte的数据范围，有数据丢失
*/

/*
        强制类型转换：当进行操作时，代码需要经过一定的格式处理，不能自动完成。特点：数据范围大的到数据范围小的。
*/

/*
        int a = 23;
        long b = 100L;
        b = a; // int-->long，数据范围由小到大，隐式转换
        a = (int)b; // long-->int, 数据范围由大到小，需要强转，否则编译失败
        float f = 3.14F;
        double d = 5.12;
        d = f; // float-->double，数据范围由小到大，隐式转换
        f = (float)d; // double-->float, 数据范围由大到小，需要强转，否则编译失败
        a = d; // 报错，类型不兼容
        a = (int)d; // int没有double表示的数据范围大，需要强转，小数点之后全部丢弃
        byte b1 = 100; // 100默认为int，没有超过byte范围，隐式转换
        byte b2 = (byte)257; // 257默认为int，超过byte范围，需要显示转换，否则报错
        boolean flag = true;
        a = flag; // 编译失败：类型不兼容
        flag = a; // 编译失败：类型不兼容
*/

/*
        注意事项：
        1. 不同数字类型的变量之间赋值, 表示范围更小的类型能隐式转换成范围较大的类型
        2. 如果需要把范围大的类型赋值给范围小的, 需要强制类型转换, 但是可能精度丢失
        3. 将一个字面值常量进行赋值的时候, Java 会自动针对数字范围进行检查
        4. 强制类型转换不一定能成功，不相干的类型不能互相转换
*/

/*
        类型提升
        不同类型的数据之间相互运算时，数据类型小的会被提升到数据类型大的。
*/

/*
        1. int与long之间：int会被提升为long
*/

/*
        int a = 10;
        long b = 20;
        int c = a + b; // 编译出错: a + b==》int + long--> long + long 赋值给int时会丢失数据
        long d = a + b; // 编译成功：a + b==>int + long--->long + long 赋值给long
*/

/*
        2. byte与byte的运算
*/
/*
        byte a = 10;
        byte b = 20;
        byte c = a + b;
        System.out.println(c);// 编译报错
*/
/*
        Test.java:5: 错误: 不兼容的类型: 从int转换到byte可能会有损失
        byte c = a + b;
*/
/*
        结论: byte 和 byte 都是相同类型, 但是出现编译报错. 原因是, 虽然 a 和 b 都是 byte, 但是计算 a + b 会先将 a
        和 b 都提升成 int, 再进行计算, 得到的结果也是 int, 这是赋给 c, 就会出现上述错误.
        由于计算机的 CPU 通常是按照 4 个字节为单位从内存中读写数据. 为了硬件上实现方便, 诸如 byte 和 short
        这种低于 4 个字节的类型, 会先提升成 int, 再参与计算.
*/
/*
        正确的写法:
*/
/*
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        System.out.println(c);
*/

/*
        【类型提升小结:】
        1. 不同类型的数据混合运算, 范围小的会提升成范围大的.
        2. 对于 short, byte 这种比 4 个字节小的类型, 会先提升成 4 个字节的 int , 再运算.
*/


/*
        字符串类型
*/
/*
        在Java中使用String类定义字符串类型，比如：
*/
/*
        String s1 = "hello";
        String s2 = " world";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1+s2); // s1+s2表示：将s1和s2进行拼接
*/
/*
        1. int 转成 String
*/
/*
        int num = 10;// 方法1
        String str1 = num + "";// 方法2
        String str2 = String.valueOf(num);
*/

/*
        2. String 转成 int
*/
/*
        String str = "100";
        int num = Integer.parseInt(str);
*/






    }
}
