package pbo1.pkg10118031.latihan34.objectoriented.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program Kalkulator
 */
public class PBO110118031Latihan34ObjectOrientedKalkulator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        kalkulator kal;
        kal = new kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = scn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : " + kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kal.kurangBiangan());
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        System.out.println("Hasil Pembagian : " + df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa : " + kal.sisaBilangan());

    }

}
