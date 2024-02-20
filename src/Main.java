import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, sonuc;
        String d = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Merhabalar! İşlem önceliği için sizlerden 3 adet sayı isteyeceğiz. Yapılacak işlem = a+b*c-b");
        System.out.print("Hazırsanız ekrana 'ok' yazınız : ");
        d = input.nextLine();

        if (Objects.equals(d, "ok")) {
            System.out.print("Birinci sayıyı giriniz: ");
            a = input.nextInt();

            System.out.print("İkinci sayıyı giriniz: ");
            b = input.nextInt();

            System.out.print("Üçüncü sayıyı giriniz: ");
            c = input.nextInt();

            sonuc = a + b * c - b;
            System.out.println("İşlem Sonucu : " + sonuc);
        } else{
            System.out.println("'ok' yazmadığınız için program sonlandırıldı.");
        }

    }
}