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
public class hari {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;
        
        System.out.println("PROGRAM untuk memasukan tanggal");
        System.out.println("============================================");
        
        System.out.print("Masukan tanggal hari ini : ");
        day = scan.nextInt();
        
        switch (day) {
            case 1 :
                System.out.println("senen");
                break;
            case 2 :
                System.out.println("selasa");
                break;
            case 3 :
                System.out.println("rabu");
                break;
            case 4 :
                System.out.println("kamis");
                break;
            case 5 :
                System.out.println("jumat");
                break;
            case 6 :
                System.out.println("sabtu");
                break;
            case 7 :
                System.out.println("minggu");
                break;
            default :
                System.out.println("angka ga valid");
        }
        }
}
