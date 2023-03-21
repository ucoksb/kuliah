package Minggu3.ContohMobil;

public class MobilBeraksi{
    public static void main(String[] arggs){
    Mobil mobilku = new Mobil();
    
    /* memanggil atribut dan memberi nilat */
    mobilku.warna = "Hitam";
    mobilku.tahunProduksi = 2006;
    System.out.println("Warna: " + mobilku.warna);
    System.out.println("Tahun: " + mobilku.tahunProduksi);
    }
}
