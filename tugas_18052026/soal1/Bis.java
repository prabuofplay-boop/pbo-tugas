/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author LAB_P1_PC02
 */
    public class Bis extends Transportasi{
    public double biayaTiket;

    public Bis(double biayaTiket, String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.biayaTiket = biayaTiket;
    }

    public double getBiayaTiket() {
        return biayaTiket;
    }

    public void setBiayaTiket(double biayaTiket) {
        this.biayaTiket = biayaTiket;
    }
    
    @Override
    public void prosesKeberangkatan(){
        System.out.println("Perjalanan Mobil");
        System.out.println("Biaya transportasi: "+biayaTiket);
    }
}
    

