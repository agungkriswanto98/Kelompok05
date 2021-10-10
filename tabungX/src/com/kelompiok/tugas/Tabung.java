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
public class Tabung {
    public static void main(String[] args) {
        double r, t;
        final double PHI = 3.14;
        double luasTabung, volTabung;
        
        Scanner scanInput = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari alas: ");
        r = scanInput.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        t = scanInput.nextDouble();
        
        luasTabung = 2 * (PHI * r * r) + (2 * PHI * r * t);
        volTabung = (PHI * r * r) * t;
        
        System.out.println("Luas Tabung = " + luasTabung);
        System.out.println("Volume Tabung = " + volTabung);
    }
}