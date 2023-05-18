import java.util.Scanner;

public class Word_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入密码");
        String password = "12345678";
        String input = "";
        for (int i = 0; i < 3; i++) {
            input = scan.next();
            if (input.equals(password)){
                System.out.println("密码正确");
                break;
            }
            else{
                System.out.println("密码错误，请重新输入");
            }
        }
    }
}
