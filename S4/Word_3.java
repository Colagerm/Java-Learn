import java.util.Scanner;

public class Word_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j || j == a-i-1){
                    System.out.print("x");
            }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
