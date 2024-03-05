import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 1;
        boolean found = false;
        while(!found){
            if ( N % 5 == 0 && N % 7 == 0 && N % 11 == 0){
                found = true;
                System.out.println("đây là số nhỏ nhất chia hết cho 5,7 và 11 là:" + N);
            } else {
                N++;
            }
        }
    }
}
