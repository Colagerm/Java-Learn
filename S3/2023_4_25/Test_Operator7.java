public class Test_Operator7 {
    public static void main(String[]args){
        //运算符的优先级
/*      在一条表达式中，各个运算符可以混合起来进行运算，但是运算符的优先级不同，比如：* 和 / 的优先级要高于 +
        和 - ，有些情况下稍不注意，可能就会造成很大的麻烦。
*/
        // 求a和b的平均值
/*
        int a = 10;
        int b = 20;
        int c = a + (b - a) >> 1;
        System.out.println(c);
*/
        //上述表达式中，由于 + 的优先级要高于 >> , 因此a先和b-a的结果做加法，
        //整体为20，最后再进行右移，因此结果为10。

        //运算符之间是有优先级的. 具体的规则我们不必记忆. 在可能存在歧义的代码中加上括号即可.
        // 求a和b的平均值
        int a = 10;
        int b = 20;
        int c = a + ((b - a) >> 1);
        System.out.println(c);


    }
}
