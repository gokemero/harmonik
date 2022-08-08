import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        System.out.print("Sayıyı giriniz :");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double z = 0;
        for (double i = 1; i <= x; i++) {
            double a = 1 / i;
            z += a;
        }
        System.out.print("Sonuç :" + z);
    }
}
