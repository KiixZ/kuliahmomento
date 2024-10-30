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
public class RipkiPrak3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        float nilai_IPK;
        
        
        System.out.println("PROGRAM MENENTUKAN KATEGORI PRESTASI BERDASARKAN NILAI IPK");
        System.out.println("============================================");
        
        
        System.out.print("Masukan Nama Anda : ");
        nama = scan.nextLine();
        System.out.print("Masukan IPK Anda : ");
        nilai_IPK = scan.nextFloat();
        
        if ( nilai_IPK >= 3.5 ) {
            System.out.println("Cumlaude");
        }
        else if ( nilai_IPK >= 3.0) {
            System.out.println("Sangat memuaskan");
        }
        else if ( nilai_IPK >= 2.5 ){
            System.out.println("memuaskan");
        }
        else if ( nilai_IPK >= 2.0 ){
            System.out.println("cukup");
        }
        else {
            System.out.println("lu ga lulus");
        }
    }
    
}
