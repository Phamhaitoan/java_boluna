import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============Menu=============");
        System.out.println("1.In hình chữ nhât");
        System.out.println("2.In hình tam giác vuông");
        System.out.println("3.In hình tam giác cân");
        System.out.println("4.Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice)
        {
            case 1:
                int column = Integer.parseInt(scanner.nextLine());
                System.out.println(column);
                int rows = Integer.parseInt(scanner.nextLine());
                System.out.println(rows);
                for (int i = 1; i <= column; i++) {
                    for (int j = 1; j <= rows; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 2:
                int size = 5;

                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 3:
                int sizes = 5;

                for (int i = 1; i <= sizes; i++) {
                    for (int j = 1; j <= sizes - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 4:
                System.exit(0);

        }

    }
}
