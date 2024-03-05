import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============Menu=============");
        System.out.println("1.Món cá nhảy");
        System.out.println("2.thịt chó");
        System.out.println("3.thịt gà");
        System.out.println("4.Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice)
        {
            case 1:
                System.out.println("mời bạn ăn cá nhảy");
                break;
            case 2:
                System.out.println("thịt chó");
                break;
            case 3:
                System.out.println("thịt gà");
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
