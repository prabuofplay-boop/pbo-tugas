/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author LAB_P1_PC02
 */
public class Motor extends Transportasi{
    public double harga;

    public Motor(double harga, String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    @Override
    public void prosesKeberangkatan(){
        System.out.println("Perjalanan Mobil");
        System.out.println("Biaya transportasi: "+harga);
    }
}
