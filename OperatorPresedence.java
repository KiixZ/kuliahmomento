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
public class OperatorPresedence {
    public static void main(String[] args) {
        //Deklarasi dan memberi nilai awal pada variable
        int x = 20, y = 10;
        boolean nilaiBoolean = false;
        
        // Deklarasi variable
        int Ekspresi1, Ekspresi3, Ekspresi4;
        boolean Ekspresi2;
        
       // Memberi nilai ke variable dengan Ekspresi JAVA
        Ekspresi1 = 5+x*2-x/2+(y-2);
        Ekspresi2 = !nilaiBoolean;
        Ekspresi3 = ++x - --y;
        Ekspresi4 = 40+x*y+25;
        
        System.out.println();
        System.out.println("Nilai Ekspresi 1 = " + Ekspresi1);
        System.out.println("Nilai Ekspresi 2 = " + Ekspresi2);
        System.out.println("Nilai Ekspresi 3 = " + Ekspresi3);
        System.out.println("Nilai Ekspresi 4 = " + Ekspresi4);
    }
}
