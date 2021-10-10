import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner bangunRuang = new Scanner(System.in);
    System.out.println("Luas Permukaan Kubus   : 6 x (s x s)");
    System.out.println("Volume Kubus           : s x s x");
    System.out.println("Luas Permukaan Balok   : p x l x t");
    System.out.println("Volume Balok           : 2 x (p.l + l.t + p.t)");

     System.out.println("Masukkan nilai sisi : ");
     int sisi = bangunRuang.nextInt();

    System.out.println("Luas Permukaan Kubus  : " + 6 * (sisi*sisi));
    System.out.println("Volume Kubus : " + (sisi * sisi * sisi));

      System.out.println("Masukkan nilai panjang : ");
     int panjang = bangunRuang.nextInt();

      System.out.println("Masukkan nilai lebar : ");
     int lebar = bangunRuang.nextInt();

      System.out.println("Masukkan nilai tinggi : ");
     int tinggi = bangunRuang.nextInt();

     
    System.out.println("Luas Permukaan Balok  : " + panjang * lebar * tinggi);
    System.out.println("Volume Balok : " + 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi));
      

  }
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agung Kris
 */
public class Kubus {
    
}
