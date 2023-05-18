import java.util.Scanner;

public class Word_6 {
    public static void main(String[] args) {
            System.out.println("请输入一个整数: ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            //打印奇数
            System.out.println("奇数是：");
            for(int i = 31; i >= 1; i -= 2){
                System.out.print(((n>>i)&1) + " ");
            }
            System.out.println();

            //打印偶数
            System.out.println("偶数是：");
            for(int i = 30; i >= 0; i -= 2){
                System.out.print(((n>>i)&1) + " ");
            }
    }
}
