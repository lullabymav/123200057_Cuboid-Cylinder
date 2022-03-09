/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2pbo;

import calculation.*;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choose;
        double radius, height, length, width;
        Scanner input = new Scanner(System.in);
        
        Balok callB = new Balok(0, 0, 0);
        Tabung callTb = new Tabung(0, 0);
        
        do {
          System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            choose = input.nextInt();
            if (choose == 1){
                System.out.print("Input Panjang : ");
                length = input.nextDouble();
                callB.setLength(length);
                
                System.out.print("Input Lebar : ");
                width = input.nextDouble();
                callB.setWidth(width);
                
                System.out.print("Input Tinggi : ");
                height = input.nextDouble();
                callB.setHeight(height);
                
                callB.area();
                System.out.println("Luas Persegi Panjang : " + callB.areaResult);
                callB.circumference();
                System.out.println("Keliling Persegi Panjang : " + callB.circumResult);
                callB.volume();
                System.out.println("Volume Balok : " + callB.volumeResult);
                callB.surface();
                System.out.println("Luas Permukaan Balok : " + callB.surfaceResult);
            } 
            else if (choose == 2){
                System.out.print("Input Tinggi : ");
                height = input.nextDouble();                
                callTb.setHeight(height);
                
                System.out.print("Input Jari-Jari : ");
                radius = input.nextDouble();
                callTb.setRadius(radius);
                
                callTb.area();
                System.out.printf("Luas Lingkaran : %.2f\n",callTb.areaResult);
                callTb.circumference();
                System.out.printf("Keliling Lingkaran : %.2f\n",callTb.circumResult);
                callTb.volume();
                System.out.println("Volume Tabung : " + callTb.volumeResult);
                callTb.surface();
                System.out.printf("Luas Permukaan Tabung : %.2f\n",callTb.surfaceResult);   
            }
            else if (choose != 1 || choose != 2 || choose != 0){
                System.out.println("Wrong Input");
            }
            else {
                System.exit(0);
            }
            System.out.print("Ulangi? (Ya : 1 || Tidak : 0) ");
            choose = input.nextInt();
        }while (choose == 1);    
    }
}
