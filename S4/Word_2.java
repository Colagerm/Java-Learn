public class Word_2 {
    public static void main(String[] args) {
        double sum = 0;
        int tmp = 1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/i*tmp;
            tmp = -tmp;
        }
        System.out.print(sum);
    }
}
