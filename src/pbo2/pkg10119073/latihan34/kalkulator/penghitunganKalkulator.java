package pbo2.pkg10119073.latihan34.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk melakukan penghitungan
 * menggunakan kalkulator dengan object oriented
 *
 */

public class penghitunganKalkulator {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        System.out.println("=====Aplikasi Kalkulator Bilangan=====\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Angka ke-1 : ");
        calc.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        calc.value2 = scanner.nextDouble();
        
        DecimalFormat decfor = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+calc.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+calc.kurangBilangan());
        System.out.println("Hasil Perkalian : "+calc.kaliBilangan());
        System.out.println("Hasil Pembagian : "+decfor.format(calc.bagiBilangan()));
        System.out.println("Hasil Sisa : "+calc.sisaBilangan());
    }
    
}
