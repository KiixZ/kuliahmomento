package ripki.prak3;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hargaProduk, diskon = 0, totalHarga;
        int jumlahPembelian;

        System.out.println("PROGRAM PENJUALAN SEDERHANA");
        System.out.println("============================");
        
        hargaProduk = 100000; // Ubah harga produk jika diperlukan
        System.out.print("Masukkan Jumlah Pembelian Anda: ");
        jumlahPembelian = scan.nextInt();
        
        // Logika untuk menghitung diskon
        if (jumlahPembelian > 10) {
            if (hargaProduk > 100000) {
                System.out.println("Selamat Anda mendapatkan diskon 15%");
                diskon = hargaProduk * 0.15 * jumlahPembelian;
            } else {
                System.out.println("Selamat Anda mendapatkan diskon 10%");
                diskon = hargaProduk * 0.10 * jumlahPembelian;
            }
        } else {
            if (hargaProduk > 50000) {
                System.out.println("Selamat Anda mendapatkan diskon 5%");
                diskon = hargaProduk * 0.05 * jumlahPembelian; // Perbaikan di sini
            } else {
                System.out.println("Selamat Anda mendapatkan diskon 2%");
                diskon = hargaProduk * 0.02 * jumlahPembelian; // Perbaikan di sini
            }
        }

        totalHarga = (hargaProduk * jumlahPembelian) - diskon;
        System.out.println("Jadi total harga yang harus kamu bayar adalah: " + totalHarga);
    }
}
