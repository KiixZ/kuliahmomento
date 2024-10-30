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
public class usia {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        String nama;
        
        System.out.println("PROGRAM Memeriksa rentang usia pengguna dan mencetak kategori yang sesuai");
        System.out.println("============================================");
            System.out.print("Masukan Nama anda : ");
            nama = scan.nextLine();
        System.out.print("Masukan Umur Anda : ");
        age = scan.nextInt();
        
        if (age <= 13) 
        {
            System.out.println("lu anak kecil");
        }
        else if (age >= 13 && age <= 20)
        {
            System.out.println("lu anak muda");
        }
        else {
                System.out.println("lu ketuaan");
             }
   }
}
