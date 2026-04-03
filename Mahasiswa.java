/*
    Nama : Muhammad Prabu Utungga A
    Nim  :2501083011
    program: Main Persegi Panjang
 */
package Pratikum_30042026;

/**
 *
 * @author Night_kid
 */
public class Mahasiswa {
    
    String nama, nobp;
    double UTS, Tugas, UAS;
    
    Mahasiswa (){
        
    }
    
    Mahasiswa (double tgs,double uas,double uts){
        UTS = uts;
        Tugas = tgs;
        UAS = uas;
    }
    
    double NilaiAkhir(){
        return((0.25*Tugas)+(0.35*UTS)+(0.4*UAS));
    }
    
    void Tampilkan(){
        System.out.println("Nilai Akhir = "+NilaiAkhir());
    }
    
    
}