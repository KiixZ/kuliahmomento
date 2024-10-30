/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripki.prak3;

import java.util.Scanner;

/**
 *
 * @author k
 */
public class nested_if {
    public static void main(String[] args) 
   {
        Scanner scan = new Scanner(System.in);
        double hargaProduk, diskon = 0, totalHarga;
        int jumlahPembelian;
        
        System.out.println("PROGRAM PENJUALAN SEDERHANA");
        System.out.println("============================");
        System.out.print("Masukan Total Harga : ");
        hargaProduk = scan.nextDouble();
        System.out.print("Masukan Jumlah pembelian anda : ");
        jumlahPembelian = scan.nextInt();
        System.out.println("================================");
        if (jumlahPembelian >= 10){
            if(hargaProduk > 100000){
                System.out.println("Selamat anda mendapatkan diskon 15%");
                diskon = (hargaProduk * 15)/100;
            }
            else {
                System.out.println("Selamat anda mendapatkan diskon 10%");
                diskon =  (hargaProduk * 10 )/100;
            }
        }else{
                if(hargaProduk > 50000){
                System.out.println("selamat anda mendapatkan diskon 5%");
                diskon = hargaProduk * 0.05;
            }
                else
                {
                System.out.println("selamat anda mendapatkan diskon 2%");
                diskon = hargaProduk * 0.02;
                }
        }
        totalHarga = (hargaProduk * jumlahPembelian) - diskon;
        System.out.println("Kamu mendapatkan potongan diskon senilai : " + diskon);
        System.out.println("Jadi total harga yang harus kamu bayar adalah : " + totalHarga);
   }
}
