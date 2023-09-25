package Minggu5;
import java.util.Scanner;
public class PemilihanPercobaan217 {
    
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        System.out.println("Nilai uas     : ");
        float uas = input17.nextFloat();
        System.out.println("Nilai uts     : ");
        float uts = input17.nextFloat();
        System.out.println("Nilai kuis    : ");
        float kuis = input17.nextFloat();
        System.out.println("Nilai tugas   : ");
        float tugas = input17.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (80<total && total<=100) {
            System.out.println("Nilai Huruf A\nNilai Setara 4\nKualifikasi Sangat Baik");
        } else if (73<total && total<=80) {
            System.out.println("Nilai Huruf B+\nNilai Setara 3,5\nKualifikasi Lebih dari Baik");
        } else if (65<total && total<=73) {
            System.out.println("Nilai Huruf B\nNilai Setara 3\nKualifikasi Baik");
        } else if (60<total && total<=65) {
            System.out.println("Nilai Huruf C+\nNilai Setara 2,5\nKualifikasi Lebih dari Cukup");
        } else if (50<total && total<=60) {
            System.out.println("Nilai Huruf C\nNilai Setara 2\nKualifikasi Cukup");
        } else if (39<total && total<=50) {
            System.out.println("Nilai Huruf D\nNilai Setara 1\nKualifikasi Kurang");
        } else {
            System.out.println("Nilai Huruf E\nNilai Setara 0\nKualifikasi Gagal");
        }
    }
}
