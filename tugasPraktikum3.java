/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifki091;
import java.util.Scanner;

/**
 *
 * @author LAB 4
 */
public class tugasPraktikum3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

           int bilangan1, bilangan2;
           double jumlah,kurang,kali,bagi;
           
           System.out.print("Masukan bilangan 1: ");
           bilangan1 =  scan.nextInt();
           System.out.print("Masukan bilangan 2: ");
           bilangan2 = scan.nextInt();
           jumlah = bilangan1 + bilangan2;
           kurang = bilangan1 - bilangan2;
           kali = bilangan1 * bilangan2;
           if (bilangan2 != 0){
               bagi = bilangan1 / bilangan2;
           }
           else{
               System.out.println("Pembagian nol tidak diperbolehkan");
           }
           System.out.println("Hasil Penjumlahan adalah: " + jumlah);
           System.out.println("Hasil Pengurangan adalah: " + kurang);
           System.out.println("Hasil Perkalian adalah: "+ kali);
           if (bilangan2 != 0){
               bagi = bilangan1 / bilangan2;
               System.out.println("hasil Pembagian adalah : "+ bagi);
           
           }
           else{
               System.out.println("Pembagian nol tidak diperbolehkan");
           }
           scan.close();
           
    }
}
