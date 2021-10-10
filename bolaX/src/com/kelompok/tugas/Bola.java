/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompiok.tugas;

import java.util.Scanner;

/**
 *
 * @author Verel
 */
 
public class Bola {
 
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
 
        float phi = 3.14f;
        float rusuk, luas, volume;
 
        System.out.println("Luas dan Volume Bola \n");
 
        System.out.print("Masukkan Rusuk : ");
        rusuk = userInput.nextFloat();
 
        luas = 4 * phi * rusuk * rusuk;
        System.out.println("Luas Bola =12 " + luas);
 
        volume = 4 / (float) 3 * phi * rusuk * rusuk * rusuk;
        System.out.println("Volume Bola = " + volume);
    }
}