/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.tugas;

import java.util.Scanner;

/**
 *
 * @author Verel
 */
public class PrismaSegitia {
 
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
 
        float La, Ka, tinggi, luasP, volume;
 
        System.out.println("Luas Permukaan & Volume Prisma Segi 3\n");
 
        System.out.print("Masukkan Luas Alas     : ");
        La = userInput.nextFloat();
 
        System.out.print("Masukkan Keliling Alas : ");
        Ka = userInput.nextFloat();
 
        System.out.print("Masukkan Tinggi        : ");
        tinggi = userInput.nextFloat();
 
        luasP = (2 * La) + (Ka * tinggi);
        System.out.println("\nLuas Permukaannya  = " + luasP);
 
        volume = La * tinggi;
        System.out.println("Volumenya          = " + volume);
    }
}
