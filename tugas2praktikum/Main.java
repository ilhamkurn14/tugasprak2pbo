/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2praktikum;

import java.util.Scanner;

/**
 *
 * @author Ilham Kurniawan Adi
 */
public class Main {
   static int choose;
    public static void main(String[] args){
        double panjang,lebar,tinggibalok,r, tinggitabung;
        int choose = 0;
        int i = 0;
        Scanner input = new Scanner (System.in);
        do{
        System.out.println("==========");
        System.out.println("Menu Utama ");
        System.out.println("==========");
        System.out.println("1. Balok");
        System.out.println("2. Tabung");
        System.out.println("0. Keluar");
        System.out.println("-----------");
        System.out.print("Pilih : "); choose = input.nextInt();
        
        if(choose == 1){
            System.out.print("Masukkan panjang : "); panjang = input.nextDouble();
            System.out.print("Masukkan lebar : "); lebar = input.nextDouble();
            System.out.print("Masukkan tinggi : "); tinggibalok = input.nextDouble();
            
            Balok balok = new Balok(panjang,lebar,tinggibalok);
            System.out.println("Luas persegi panjang : " + balok.luas());
            System.out.println("Keliling persegi panjang : " + balok.keliling());            
            System.out.println("Volume Balok : " + balok.volume());
            System.out.println("Luas permukaan balok : " + balok.luasPermukaan());

        }
        else if(choose == 2){
            System.out.print("Masukkan tinggi : "); tinggitabung = input.nextDouble();
            System.out.print("Masukkan jari-jari : "); r = input.nextDouble();
            
            Tabung tabung = new Tabung (r, tinggitabung);
            System.out.println("Luas lingkaran : " + tabung.luas());
            System.out.println("Keliling lingkaran : " + tabung.keliling());            
            System.out.println("Volume Tabung : " + tabung.volume());           
            System.out.println("Luas permukaan Tabung : " + tabung.luasPermukaan());

        }
         else if (choose==0){
        i=1;
        System.exit(0);   
        }
        }while(i==0);
    }  
    }