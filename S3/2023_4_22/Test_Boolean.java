public class Test_Boolean {
    public static void main(String[]args){
        /*布尔类型常用来表示真假，在现实生活中也是经常出现的，比如：听说xxx同学买彩票中了一个亿...，听到后估计
        大部分人第一反应就是：我x，真的假的？*/

/*
        boolean b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);
*/

        /*注意事项：
        1. boolean 类型的变量只有两种取值, true 表示真, false 表示假.
        2. Java 的 boolean 类型和 int 不能相互转换, 不存在 1 表示 true, 0 表示 false 这样的用法.*/

/*
        boolean b1 = true;
        System.out.println(b1 + 1);
*/

/*
        // 代码编译会出现如下错误
        Test.java:4: 错误: 二元运算符 '+' 的操作数类型错误
        System.out.println(value + 1);
                      ^
        第一个类型: boolean
        第二个类型: int
        1 个错误
*/

/*
        3. Java虚拟机规范中，并没有明确规定boolean占几个字节，也没有专门用来处理boolean的字节码指令，在
        Oracle公司的虚拟机实现中，boolean占1个字节。
        4. boolean的包装类型为Boolean。
*/


    }
}
