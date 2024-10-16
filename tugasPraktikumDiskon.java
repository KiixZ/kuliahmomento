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
public class tugasPraktikumDiskon {
    public static void main(String[] args) {
        int harga,diskon;
        double setelahDiskon,hasil;
        Scanner scan = new Scanner(System.in);
        
           System.out.print("Masukan harga sebelum diskon : Rp ");
           harga = scan.nextInt();
           System.out.print("Masukan brp persen diskon : % " );
           diskon = scan.nextInt();
           System.out.println("==================");
           double setelahdiskon = + (harga * diskon) / 100;
           System.out.println("Mendapat potongan sebesar = Rp. " + setelahdiskon);
//           double hasil = harga - setelahdiskon ;
           System.out.println("Jadi harga setelah diskon adalah = Rp. " + (harga - setelahdiskon));
           
    }
}
