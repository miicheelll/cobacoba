package Minggu5;
import java.util.Scanner;
public class PemilihanPercobaan117 {
    
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        System.out.println("MAsukkan angka: ");
        int angka = input17.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" bilangan genap");
        } else {
        System.out.println("Angka "+angka+" bilangan ganjil");
        }
    }
}
