import java.util.Scanner;

public class StudiKasus1_07{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        // Deklarasi dan Inisialisasi Variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextInt();

        // Hitung Total Harga
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Cek Diskon
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Hitung Total Bayar
        totalBayar = totalHarga - diskon;

        // Output Rincian
        System.out.println("\n--- Ringkasan Pembayaran ---");
        System.out.println("Total Harga : Rp" + totalHarga);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total Bayar : Rp" + totalBayar);

        // Cek Pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }

        input.close();
    }
}