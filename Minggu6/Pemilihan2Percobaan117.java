package Minggu6;

import java.util.Scanner;
public class Pemilihan2Percobaan117 {
    
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.println("Masukkan Tahun");
        int tahun = input17.nextInt();

        String hasil = "Bukan tahun kabisat";
        if ((tahun % 4) == 0) {
            if (tahun % 100 != 0)
                hasil = "Tahun Kabisat";
            else {
                if (tahun % 400 == 0)
                hasil = "Tahun Kabisat";
            }
        } 
            System.out.println(hasil);
    }
}
