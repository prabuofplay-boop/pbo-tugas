/*
nama : M Prabu Utungga A
nim  :2501083011
 */
package Pratikum_30042026;

/**
 *
 * @author Night_kid
 */

public class persegiPanjang {
    
    //Atribut Variable
    int panjang;
    int lebar;
    
    persegiPanjang(){
        
    }
    
    persegiPanjang(int p, int l){
        panjang=p;
        lebar=l;
    }
    //Method dengan nilai pengembalian
    int HitungLuas(){
        return(panjang*lebar);
    }
    
    int HitungKel(){
        return(2*(panjang+lebar));
    }
    //Method tanpa pengembalian
    void TampilData(){
        System.out.println("Panjang Persegi Panjang = "+panjang);
        System.out.println("Lebar Persegi Panjang ="+lebar);
        System.out.println("Luas Persegi Panjang = "+HitungLuas());
        System.out.println("Keliling = "+HitungKel());
        
        
    }
    
   
}
