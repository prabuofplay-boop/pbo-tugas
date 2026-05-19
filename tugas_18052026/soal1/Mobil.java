/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author LAB_P1_PC02
 */
public class Mobil extends Transportasi{
    public double biaya;

    public Mobil(double biaya, String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.biaya = biaya;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    
    @Override
    public void prosesKeberangkatan(){
        System.out.println("Perjalanan Mobil");
        System.out.println("Biaya transportasi: "+biaya);
    }
}
