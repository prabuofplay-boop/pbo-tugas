/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_30042026;

/**
 *
 * @author Night_kid
 */
import java.util.Scanner;
public class mainMahasiswa {
    public static void main(String[] args){
    
    Mahasiswa pp1 = new Mahasiswa();
    pp1.nama = "Muhammad Prabu Utungga A";
    pp1.nobp ="2501083011";
    System.out.println("Nama = "+pp1.nama);
    System.out.println("NoBP="+pp1.nobp);
     
    Scanner input = new Scanner(System.in);
    double Tugas, UAS, UTS;
    System.out.print("masukan nilai tugas =");
    Tugas = input.nextInt();
    System.out.print("masukan nilai uts =");
    UTS = input.nextInt();
    System.out.print("masukan nilai uas= ");
    UAS = input.nextInt();
    Mahasiswa pp2 = new Mahasiswa(Tugas, UAS, UTS);
    pp2.Tampilkan();
    
    
 
    }
}