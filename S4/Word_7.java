import java.util.Scanner;

public class Word_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a>b?a:b;
        b = a<b?a:b;
        a = c;
        while (true){
            if (a % b == 0){
                System.out.println(b);
                break;
            }
            else{
                c = b;
                b = a % b;
                a = c;
            }
        }
    }
}
