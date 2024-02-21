import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenler tanımlanıp, kullanıcının veri girmesi sağlandı.
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        b = input.nextInt();

        //Döngü kullanılarak üs alma işlemi yapıldı.
        int toplam = 1;
        for (int i = 1; i <= b; i++) {
            toplam *= a;
        }
        System.out.println("Sonuç: " + toplam);
    }
}