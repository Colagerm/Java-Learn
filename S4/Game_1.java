import java.util.Scanner;

public class Game_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎来到猜数字游戏");
        System.out.println("输入任意字符进入游戏，退出游戏请输入x");
        String jian = scan.next();
        if (!jian.equals("x")) {
            game();
        }
        else {
            System.out.println("游戏结束");
        }
    }
    public static void game(){
        Scanner scan = new Scanner(System.in);
        int a = (int) (1 + Math.random() * (100 - 1 + 1));
        System.out.println("数字范围1-100，开猜");
        while (true) {
            int guess = scan.nextInt();
            if (guess == a) {
                System.out.println("恭喜你猜对啦");
                break;
            }
            if (guess > a){
                System.out.println("猜大啦，请继续猜");
            }
            else {
                System.out.println("猜小啦，请继续猜");
            }
        }
    }
}
