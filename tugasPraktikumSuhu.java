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
public class tugasPraktikumSuhu {
    public static void main(String[] args) {
        int celcius;
        Scanner scan = new Scanner(System.in);

           celcius = 30;
           System.out.println("hasil konversi suhu celcius ke fahrenheit : ");
           System.out.println("----> " +celcius+ " Celcius = " + ((celcius * 9/5)+ 32) + ".0 Fahrenheit");
           System.out.println("hasil konversi suhu celcius ke reamur : ");
           System.out.println("----> " +celcius+ "Celcius = " + ((celcius * 4/5)) + ".0 Reamur");
           System.out.println("hasil konversi suhu celcius ke kelvin : ");
           System.out.println("----> " +celcius+ " Celcius = " + ((celcius + 273.15)) + ".0 Kelvin");
           
    }
}
