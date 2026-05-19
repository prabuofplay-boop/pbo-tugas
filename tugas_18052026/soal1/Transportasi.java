/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author LAB_P1_PC02
 */
    public abstract class Transportasi {
    protected String namaPenumpang;
    protected String tujuan;

    public Transportasi(String namaPenumpang, String tujuan) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    public abstract void prosesKeberangkatan();
}
    

