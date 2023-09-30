import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        String secim;
        double n1,n2,sonuc;
        Scanner giris = new Scanner(System.in);
        System.out.print("İlk Sayıyı giriniz: ");
        n1 = giris.nextDouble();
        System.out.print("İkinci Sayıyı giriniz: ");
        n2 = giris.nextDouble();
        System.out.println("Toplama işlemi için '+'\nÇıkarma işlemi için '-'\nÇarpma işlemi için '*'\nBölme işlemi için '/' ");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        secim = giris.next();
        switch(secim) {
            case "+":
                sonuc=(n1+n2);
                System.out.print("Sonuç: "+sonuc);
                break;
            case "-":
                sonuc=(n1-n2);
                System.out.print("Sonuç: "+sonuc);
                break;
            case "*":
                sonuc=(n1*n2);
                System.out.print("Sonuç: "+sonuc);
                break;
            case "/":
                sonuc=(n1/n2);
                System.out.print("Sonuç: "+sonuc);
                break;
            default:
                System.out.print("Yapmak istediğiniz işlemi seçmediniz!");
            }
    }
}