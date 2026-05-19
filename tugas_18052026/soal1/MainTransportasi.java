/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

import java.util.Scanner;

/**
 *
 * @author LAB_P1_PC02
 */
public class MainTransportasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        Transportasi transportasi=null;
        
        System.out.println("---Perjalanan Via Darat---");
        System.out.println("Masukkan Nama Penumpang= ");
        String nama=scanner.nextLine();
        
        System.out.println("Masukkan Tujuan Penumpang= ");
        String tujuan=scanner.nextLine();
        
        System.out.println("Pilih jenis transportas: ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Bis");
        System.out.println("4. Kereta");
        System.out.println("Pilihan metode perjalanan anda (1/2/3/4): ");
        int pilihan=scanner.nextInt();
        scanner.nextLine(); //buffer clear
        
        switch(pilihan){
            case 1 : System.out.println("Perjalanan Mobil");
                     System.out.print("masukkan biaya perjalanan: ");
                     double biaya=scanner.nextDouble();
                     transportasi=new Mobil(biaya,nama,tujuan);
                     break;
            
            case 2 : System.out.println("Perjalanan Motor");
                     System.out.print("masukkan biaya perjalanan: ");
                     double harga=scanner.nextDouble();
                     transportasi=new Motor(harga,nama,tujuan);
                     break;
                     
            case 3 : System.out.println("Perjalanan Bis");
                     System.out.print("masukkan biaya perjalanan: ");
                     double biayaTiket=scanner.nextDouble();
                     transportasi=new Bis(biayaTiket,nama,tujuan);
                     break;
        
            case 4 : System.out.println("Perjalanan Kereta");
                     System.out.print("masukkan biaya perjalanan: ");
                     double hargaTiket=scanner.nextDouble();
                     transportasi=new Kereta(hargaTiket,nama,tujuan);
                     break;
        }
        System.out.println("\n==konfirmasi Bukti Pembayaran");
        transportasi.prosesKeberangkatan();
    }
    
}