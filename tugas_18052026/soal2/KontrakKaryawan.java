/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author LAB_P1_PC02
 */
public class KontrakKaryawan extends Karyawan{
    public double honor;
    public int jam;

    public KontrakKaryawan(double honor, int jam, String nama, int id) {
        super(nama, id);
        this.honor = honor;
        this.jam = jam;
    }

    public double getHonor() {
        return honor;
    }

    public void setHonor(double honor) {
        this.honor = honor;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    
    @Override
    public void prosesGaji(){
        System.out.println(" Status anda adalah Karyawan Kontrak");
        System.out.println("Pendapatan Gaji: "+honor);
        double totalGaji=honor*jam;
        System.out.println("Total Gaji Anda: "+totalGaji);
    }
}
