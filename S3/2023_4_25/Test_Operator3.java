public class Test_Operator3 {
    public static void main(String[]args){
        //逻辑运算符(重点)

        //逻辑运算符主要有三个: && || ! ，运算结果都是 boolean类型。

        //1. 逻辑与 &&
/*
        语法规则：表达式1 && 表达式2，左右表达式必须是boolean类型的结果。
        相当于现实生活中的且，比如：如果是学生，并且 带有学生证 才可以享受半票。
        两个表达式都为真，结果才是真，只要有一个是假，结果就是假。
*/
/*
        int a = 1;
        int b = 2;
        System.out.println(a == 1 && b == 2); // 左为真 且 右为真 则结果为真
        System.out.println(a == 1 && b > 100); // 左为真 但 右为假 则结果为假
        System.out.println(a > 100 && b == 2); // 左为假 但 右为真 则结果为假
        System.out.println(a > 100 && b > 100); // 左为假 且 右为假 则结果为假
*/

        //2. 逻辑 ||
/*
        语法规则：表达式1 || 表达式2，左右表达式必须是boolean类型的结果。
        相当于现实生活中的或，比如：买房子交钱时，全款 或者 按揭都可以，如果全款或者按揭，房子都是你的，
        否则站一边去。
*/
/*
        int a = 1;
        int b = 2;
        System.out.println(a == 1 || b == 2); // 左为真 且 右为真 则结果为真
        System.out.println(a == 1 || b > 100); // 左为真 但 右为假 则结果也为真
        System.out.println(a > 100 || b == 2); // 左为假 但 右为真 则结果也为真
        System.out.println(a > 100 || b > 100); // 左为假 且 右为假 则结果为假
*/

        //3. 逻辑非 !
/*
        语法规则：! 表达式
        真变假，假变真。
*/
/*
        int a = 1;
        System.out.println(!(a == 1)); // a == 1 为true，取个非就是false
        System.out.println(!(a != 1)); // a != 1 为false，取个非就是true
*/

        //4. 短路求值
/*
        && 和 || 遵守短路求值的规则.
*/
/*
        System.out.println(10 > 20 && 10 / 0 == 0); // 打印 false
        System.out.println(10 < 20 || 10 / 0 == 0); // 打印 true
*/
        //我们都知道, 计算 10 / 0 会导致程序抛出异常. 但是上面的代码却能正常运行, 说明 10 / 0 并没有真正被求值.

/*
        对于 && , 如果左侧表达式值为 false, 则表达式结果一定是 false, 无需计算右侧表达式.
        对于 ||, 如果左侧表达式值为 true, 则表达式结果一定是 true, 无需计算右侧表达式.
        & 和 | 如果表达式结果为 boolean 时, 也表示逻辑运算. 但与 && || 相比, 它们不支持短路求值.
*/
/*
        System.out.println(10 > 20 & 10 / 0 == 0); // 程序抛出异常
        System.out.println(10 < 20 | 10 / 0 == 0); // 程序抛出异常
*/


    }
}
