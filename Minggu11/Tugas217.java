package Minggu11;
import java.util.Scanner;

public class Tugas217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            for (int j=7; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
