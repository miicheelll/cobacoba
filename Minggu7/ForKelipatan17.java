package Minggu7;
import java.util.Scanner;

public class ForKelipatan17 {
    
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        int kelipatan, jumlah=0, counter=0;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input17.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah = jumlah + i;
                counter++;
                System.out.print(i+" - ");
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        double rata2 = jumlah/counter;
        System.out.println("Rata-rata = "+rata2);
    }   
        

}
