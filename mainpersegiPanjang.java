/*
    NAMA/NOBP:HERU ZAKI RYANDA/2501081002
    DESKRIPSI:PROGRAM Main Persegi Panjang
 */
package Pratikum_30042026;

/**
 *
 * @author Night_kid
 */
import java.util.Scanner;
public class mainpersegiPanjang {
    
    public static void main(String[] args){
        persegiPanjang pp1 = new persegiPanjang();
        pp1.panjang = 10;
        pp1.lebar=7;
        System.out.println("Akses Method Dalam Main Class");
        System.out.println("Luas Persegi Panjang = "+pp1.HitungLuas());
        System.out.println("Keliling = "+pp1.HitungKel());
        System.out.println();
        pp1.TampilData();
        
        persegiPanjang pp2 = new persegiPanjang(19, 10);
        pp2.TampilData();
        
        
        Scanner input = new Scanner(System.in);
        int p;
        int l;
        System.out.println("Panjang dan Lebar di input user =");
        System.out.print("Masukan Panjang = ");
        p = input.nextInt();
        System.out.print("Masukan Leebas = ");
        l = input.nextInt();
        persegiPanjang pp3 = new persegiPanjang(p, l);
        pp3.TampilData();
    }
    
    
    
}