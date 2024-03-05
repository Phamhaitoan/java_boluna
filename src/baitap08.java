import java.util.Scanner;

public class baitap08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ daì cạnh a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập đô dài cạnh b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập độ dài cạnh c");
        double c = Double.parseDouble(scanner.nextLine());
        double chuvi = a + b + c;
        double p =  (a + b +c)/2;
        double Dientich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        while(true){
            if(a>0 && b>0 && c>0 && a + b > c && a + c > b && b+c>a){
                System.out.println(chuvi);
                System.out.println(Dientich);
                break;
            } else {
                System.out.println("mời ban nhập lại các cạnh");
            }
        }
    }
}
