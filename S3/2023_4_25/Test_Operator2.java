public class Test_Operator2 {
    public static void main(String[]args){
        //关系运算符

        //关系运算符主要有六个: == != < > <= >= ，其计算结果是 true 或者 false 。
        int a = 10;
        int b = 20;
        // 注意：在Java中 = 表示赋值，要与数学中的含义区分
        // 在Java中 == 表示相等
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a < b); // true
        System.out.println(a > b); // false
        System.out.println(a <= b); // true
        System.out.println(a >= b); // false
    }
}
