public class Word_1 {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
           if(i % 10 == 9 || i / 10 == 9){
               System.out.println(i);
           }
        }
    }
}
