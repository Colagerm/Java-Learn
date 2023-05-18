import java.util.Scanner;

public class Word_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = 0;
        System.out.print(num + "的每一位是");
        while (true){
            a = num % 10;
            if (a == 0){
                break;
            }
            else{
                System.out.print(a);
                num /= 10;
            }
            System.out.print(",");
        }
    }
}
