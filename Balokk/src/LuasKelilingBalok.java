/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adhi Jadmiko
 */
import java.util.Scanner;

class LuasKelilingBalok{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;
        System.out.println("Program Menghitung Volume Balok");
        System.out.println("=============================");
 
        // logic
        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();
 
        // hitung volume balok;
        hasil = panjang * lebar * tinggi;
 
        System.out.println("Volume Balok tersebut adalah: " + hasil);
        
        public static void main (String[] args) 
    {
        Scanner input = new Scanner (System.in) ;
        System.out.println ("Masukkan panjang balok : ") ;
        double panjang = input.nextDouble();
        System.out.println ("Masukkan lebar balok : ") ;
        double lebar = input.nextDouble();
        System.out.println ("Masukkan tinggi balok : ") ;
        double tinggi = input.nextDouble();
        double luas = (panjang*lebar*2)+(panjang*tinggi*2)+(lebar*tinggi*2);
        System.out.println ("Luas permukaan balok adalah : " + luas) ;
    }
 
 
    }
}