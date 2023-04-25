public @interface Tip {
/*  注意事项:
 1. Java 中使用 单引号 + 单个字母 的形式表示字符字面值.
 2. 计算机中的字符本质上是一个整数. 在 C 语言中使用 ASCII 表示字符, 而 Java 中使用 Unicode 表示字符. 因此
    char ch = '呵';
    System.out.println(ch);
    一个字符占用两个字节, 表示的字符种类更多, 包括中文.
    执行 javac 的时候可能出现以下错误:

    Test.java:3: 错误: 未结束的字符文字
    char ch = '鍛?';

    此时我们在执行 javac 时加上 -encoding UTF-8 选项即可

    javac -encoding UTF-8 Test.java

    关于字符编码方式的讨论, 参见
    https://zhuanlan.zhihu.com/p/35172335
3. char的包装类型为Character
*/
}
