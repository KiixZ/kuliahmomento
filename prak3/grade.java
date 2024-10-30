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
public class grade {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai;
        String grade, nama;
        
        System.out.println("Program untuk memasukan nilai");
        System.out.println("============================================");
        System.out.print("Masukan Nama anda : ");
        nama = scan.nextLine();
        System.out.print("Masukan Nilai ini : ");
        nilai = scan.nextInt();
        
        if (nilai  >= 80){
            System.out.println("Nilai a"); 
          {
            if (nilai >= 90) {
                System.out.println("Sempurna");
            }
          }
        }
        else if (nilai >= 60 && nilai < 80){
            System.out.println("NIlai b");
        }
        else if (nilai >= 40 && nilai < 60){
            System.out.println("NIlai c");
        }
        else{
            System.out.println("Nilai D");
        }
    }
    
}
