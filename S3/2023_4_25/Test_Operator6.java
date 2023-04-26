public class Test_Operator6 {
    public static void main(String[]args){
/*
        条件运算符只有一个:
        【表达式1 ? 表达式2 : 表达式3】
        当 表达式1 的值为 true 时, 整个表达式的值为 表达式2 的值;
        当 表达式1 的值为 false 时, 整个表达式的值为 表达式3 的值.
        也是 Java 中唯一的一个 三目运算符, 是条件判断语句的简化写法.
*/
        // 求两个整数的最大值
/*
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
*/

        //注意
        //1. 表达式2和表达式3的结果要是同类型的，除非能发生类型隐式类型转换
/*
        int a = 10;
        int b = 20;
        int c = a > b? 1 : 2.0;
*/
        //2. 表达式不能单独存在，其产生的结果必须要被使用。
/*
        int a = 10;
        int b = 20;
        a > b? a : b; // 报错：Error:(15, 14) java: 不是语句
*/
    }
}
