/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author LAB_P1_PC02
 */
public class KaryawanTetap extends Karyawan{
    public double gaji;
    public double tunjangan;

    public KaryawanTetap(double gaji, double tunjangan, String nama, int id) {
        super(nama, id);
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void prosesGaji(){
        System.out.println("status anda adalah Karyawan Tetap");
        System.out.println("Pendapatan Gaji : "+gaji);
        System.out.println("Tunjangan Anda: "+tunjangan);
        double totalGaji=gaji+tunjangan;
        System.out.println("Total Gaji Anda: "+totalGaji);
    }
}
