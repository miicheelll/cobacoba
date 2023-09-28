package Minggu5;
import java.util.Scanner;
public class PemilihanPercobaan117 {
    
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input18.nextInt();

        String message = angka % 2 == 0 ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilangan ganjil";
        System.out.println(message);
    }
}

