//package D1;
//
//public class zhushi {
//    /**
//     文档注释：
//     @version v1.0.0
//     @author will
//     作用HelloWorld类，入门第一个程序练习
//     */
//    public class HelloWorld{
///*
//比特就业课
//3.2 注释规范
//1. 内容准确: 注释内容要和代码一致, 匹配, 并在代码修改时及时更新.
//2. 篇幅合理: 注释既不应该太精简, 也不应该长篇大论.
//3. 使用中文: 一般中国公司都要求使用中文写注释, 外企另当别论.
//4. 积极向上: 注释中不要包含负能量(例如 领导 SB 等).
//4. 标识符
//在上述程序中，Test称为类名，main称为方法名，也可以将其称为标识符，即：在程序中由用户给类名、方法名或
//者变量所取的名字。
//【硬性规则】
//标识符中可以包含：字母、数字以及 下划线和 $ 符号等等。
//注意：标识符不能以数字开头，也不能是关键字，且严格区分大小写。
//【软性建议】
//类名：每个单词的首字母大写(大驼峰)
//方法名：首字母小写，后面每个单词的首字母大写(小驼峰)
//变量名：与方法名规则相同
//一个大型的工程，是由多名工程师协同开发的，如果每个人都按照自己的方式随意取名，比如：person、
//PERSON、Person、_person，将会使程序非常混乱。如果大家在取名时能够遵守一定的约束(即规范)，那多人写
//除的代码仿佛一个人写的。
//多行注释：
//1. main方法是Java程序的入口方法
//2. main函数的格式是固定的，必须为public static void main(String[] args)
//*/
//        /**
//         main方法是程序的入口函数
//         @param args 命令行参数。
//         */
//        public static void main(String[] args){
//// 单行注释：System.out.println是Java中标准输出，会将内容输出到控制台
//            System.out.println("Hello World");
//        }
//    }
//
//}
//
//
//// 在cmd中，使用javadoc工具从Java源码中抽离出注释
//// -d 创建目录 myHello为目录名
//// -author 显示作者
//// -version 显示版本号
//// -encoding UTF-8 -charset UTF-8 字符集修改为UTF-8
////javadoc -d myHello -author -version -encoding UTF-8 -charset UTF-8 HelloWorld.java