import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 1;
        int num = 3;
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        n = scanner.nextInt();
        if (n >= 1)
        {
            System.out.println(n+" Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <= n ; )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num % j == 0 )
                {
                    count = 0;
                    break;
                }
            }
            if ( count != 0 )
            {
                System.out.println(num);
                i++;
            }
            count = 1;
            num++;
        }
    }
    }
