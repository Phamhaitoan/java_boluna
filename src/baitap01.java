import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the ending number: ");
        int end = Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (int i = start; i <= end; i++){
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
