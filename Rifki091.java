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
public class Rifki091 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
//        int celcius;
//        int harga, diskon;
//        double setelahdiskon, total;
        Scanner scan = new Scanner(System.in);
//        System.out.print("masukan nilai a : ");
//        a = scan.nextInt();
//        System.out.print("masukan nilai b : ");
//        b = scan.nextInt();
        a = 10;
        b = 20;
        boolean x = true;
        boolean y = false;
        
        System.out.println("hasil a + b : " + (a + b));
        System.out.println("hasil a - b : " + (a - b));
        System.out.println("hasil a * b : " + (a * b));
        System.out.println("hasil b / a : " + (b / a));
        System.out.println("hasil b % a : " + (b % a));
//        System.out.println("a + 1 " + (++ a));
        System.out.println("b + 1 : " + (++ b));
        System.out.println("Nilai a setelah ditambah 2: " + (a += 2));
        System.out.println("sisa pembagian dari a dibagi 3: " + (a %= 7));
        System.out.println("a == b : "+ (a == b));
        System.out.println("a != b : "+ (a != b));
        System.out.println("a > b : "+ (a > b));
        System.out.println("a < b : "+ (a < b));
        System.out.println("a >= b : "+ (a >= b));
        System.out.println("a <= b : "+ (a <= b));
        System.out.println("X && y : "+ (x && y));
        System.out.println("X || Y: "+ (x || y));
        System.out.println("!x: "+ (!x));
//        
//     
//           celcius = 30;
//           System.out.println("hasil konversi suhu celcius ke fahrenheit : ");
//           System.out.println("----> 30.0 Celcius = " + ((celcius * 9/5)+ 32) + ".0 Fahrenheit");
//           System.out.println("hasil konversi suhu celcius ke reamur : ");
//           System.out.println("----> 30.0 Celcius = " + ((celcius * 4/5)) + ".0 Reamur");
//           System.out.println("hasil konversi suhu celcius ke kelvin : ");
//           System.out.println("----> 30.0 Celcius = " + ((celcius + 273.15)) + ".0 Kelvin");
//           
//           System.out.println("==================");
//           System.out.println("==================");
//           System.out.println("==================");
//           
//           System.out.print("Masukan harga sebelum diskon : Rp ");
//           harga = scan.nextInt();
//           System.out.print("Masukan brp persen diskon : % " );
//           diskon = scan.nextInt();
//           System.out.println("==================");
//           double setelahdiskon = + (harga * diskon) / 100;
//           System.out.println("Mendapat potongan sebesar = Rp. " + setelahdiskon);
////           double hasil = harga - setelahdiskon ;
//           System.out.println("Jadi harga setelah diskon adalah = Rp. " + (harga - setelahdiskon));
    }
    
}
