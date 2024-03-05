import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("==============Menu=============");
            System.out.println("1.Tìm số ước của số vừa nhập");
            System.out.println("2.tính tổng các số đó");
            System.out.println("3.tìm các số chia hêt cho 3 và 5 trong khoảng 1 - n");
            System.out.println("4.thoát");
            System.out.println("mơi nhập số nguyên bất kì");
            int choice = Integer.parseInt(scanner.nextLine());
            int number = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
//                    int number = Integer.parseInt(scanner.nextLine());
                    System.out.println("n/nhâp vào số cần tim ước số");
                    for(int i = 1;i <= number; i++){
                        if(number % i == 0){
                            System.out.println(i + "\n");
                        }
                    }
                case 2:
                    int sum = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập vào số cần tìm ước số");
                    for(int i = 1; i <= number/2; i++) {
                        if (number % i == 0) {
                            System.out.println(i);
                            sum += i;
                        }
                        System.out.println(sum);
                    }
                case 3:
                    for(int i = 1;i <= number; i++){
                        if ( i % 3 ==0 && i % 5==0 ){
                            System.out.println(i);
                        }
                    }
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while(true);
    }
}
