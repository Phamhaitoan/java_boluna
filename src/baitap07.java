import java.util.Scanner;

public class baitap07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============Menu=============");
        System.out.println("1.Tính chu vi và diện tích hình chữ nhật");
        System.out.println("2.tính chu vi và diện tích hình tam giác");
        System.out.println("3.Tính chu vi và diện tích hình tròn");
        System.out.println("4.Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("nhập chiều dài");
                double cd = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập chiều rộng");
                double cr = Double.parseDouble(scanner.nextLine());
                double C = (cd + cr)*2;
                double S = cd * cr;
                    System.out.println(C);
                    System.out.println(S);
            case 2:
                System.out.println("nhập cạnh a");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập cạnh b");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập cạnh c");
                double c = Double.parseDouble(scanner.nextLine());
                double Chuvi = a + b + c;
                double p = (a+b+c)/2;
                double Dientich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println(Chuvi);
                System.out.println(Dientich);
            case 3:
                System.out.println("nhâp bán kính hình tròn");
                double r = Double.parseDouble(scanner.nextLine());
                double Pi = 3.14;
                double circum = 2*Pi*r;
                double areaCircum = Pi*(r*r);
                System.out.println(circum);
                System.out.println(areaCircum);
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("nhập chưa hợp lệ");
        }
    }
}
