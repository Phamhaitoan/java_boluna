import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        int num = scanner.nextInt();

//        num = Integer.parseInt(scanner.nextLine());
        for(int j = 1; j <=10; j++){
            for (int i = 1; i <= 10 ; i++) {
                System.out.printf(" %d * %d = %d \n",j,i,(i*j));
//                System.out.println("");
             }
            System.out.println("");
        }
    }
}
