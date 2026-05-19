/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author LAB_P1_PC02
 */
public class Kereta extends Transportasi{
    public double hargaTiket;

    public Kereta(double hargaTiket, String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.hargaTiket = hargaTiket;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
    
    public void prosesKeberangkatan(){
        System.out.println("Perjalanan Mobil");
        System.out.println("Biaya transportasi: "+hargaTiket);
    }
}
