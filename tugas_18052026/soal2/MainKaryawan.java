/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

import java.util.Scanner;

/**
 *
 * @author LAB_P1_PC02
 */
public class MainKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        Karyawan karyawan=null;
        
        
        System.out.println("Masukkan Nama Karyawan= ");
        String nama=scanner.nextLine();
        System.out.println("Masukkan ID Karyawan= ");
        int id=scanner.nextInt();
        
        System.out.println("Pilih jenis transportas: ");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.println("Pilihan status pekerjaan anda (1/2): ");
        int pilihan=scanner.nextInt();
        scanner.nextLine(); //buffer clear
        
        switch(pilihan){
            case 1 -> {
                System.out.println("Karyawan Tetap");
                System.out.print("masukkan gaji: ");
                double gaji=scanner.nextDouble();
                System.out.print("masukkan tunjangan anda: ");
                double tunjangan=scanner.nextDouble();
                karyawan=new KaryawanTetap(gaji,tunjangan,nama,id);
            }
            
            case 2 -> {
                System.out.println("Karyawan Kontrak");
                System.out.print("masukkan honor anda: ");
                double honor=scanner.nextDouble();
                System.out.print("masukkan jam kerja anda: ");
                int jam=scanner.nextInt();
                karyawan=new KontrakKaryawan(honor,jam,nama,id);
            }
        }
        System.out.println("\n==konfirmasi Gaji Anda");
        karyawan.prosesGaji();
    }
    
}
