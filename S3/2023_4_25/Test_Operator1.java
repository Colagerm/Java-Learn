public class Test_Operator1 {
    public static void main(String[]args){
        //算术运算符
/*
        1. 基本四则运算符：加减乘除模(+ - * / %)
*/
/*
        int a = 30;
        int b = 10;
        System.out.println(a + b); // 40
        System.out.println(a - b); // 20
        System.out.println(a * b); // 300
        System.out.println(a / b); // 3
        System.out.println(a % b); // 0 --->模运算相当于数学中除法的余数
*/
/*
        注意：
        都是二元运算符，使用时必须要有左右两个操作数
        int / int 结果还是int类型，而且会向下取整
*/
/*
        int a = 3;
        int b = 2;
        // 在数学中应该是1.5 但是在Java中输出结果为1 会向下取整，即小数点之后全部舍弃掉了
        System.out.println(a / b);
        // 如果要得到数学中的结果，可以使用如下方式
        double d = a*1.0 / b;
        System.out.println(d);
*/
/*
        int a = 1;
        int b = 0;
        System.out.println(a / b);//编译出错
*/
        // % 不仅可以对整型取模，也可以对double类型取模，但是没有意义，一般都是对整型取模的
/*
        System.out.println(11.5 % 2.0);// 1.5
*/
        //两侧操作数类型不一致时，向类型大的提升
/*
        System.out.println(1+0.2); // +的左侧是int，右侧是double，在加之前int被提升为double
*/
        // 输出1.2

/*
        2. 增量运算符 += -= *= %=
*/
/*
        int a = 1;
        a += 2; // 相当于 a = a + 2
        System.out.println(a); // 输出3
        a -= 1; // 相当于 a = a - 1
        System.out.println(a); // 输出2
        a *= 3; // 相当于 a = a * 3
        System.out.println(a); // 输出6
        a /= 3; // 相当于 a = a / 3
        System.out.println(a); // 输出2
        a %= 3; // 相当于 a = a % 2
        System.out.println(a); // 输出2
*/
        //注意：只有变量才能使用该运算符，常量不能使用。

/*
        3. 自增/自减运算符 ++ --
*/
        int a = 1;
        a++; // 后置++ 表示给a的值加1，此时a的值为2
        System.out.println(a++); // 注意：后置++是先使用变量原来值，表示式结束时给变量+1，因此输出2
        System.out.println(a); // 输出3
        ++a; // 前置++ 表示给a的值加1
        System.out.println(++a); // 注意：前置++是先给变量+1，然后使用变量中的值，因此输出5
        System.out.println(a); // 输出5
        // --操作符给操作-1，与++含义类似

/*
        如果单独使用，【前置++】和【后置++】没有任何区别
        如果混合使用，【前置++】先+1，然后使用变量+1之后的值，【后置++】先使用变量原来的值，表达式
        结束时给变量+1
        只有变量才能使用自增/自减运算符，常量不能使用，因为常量不允许被修改
*/



    }
}
