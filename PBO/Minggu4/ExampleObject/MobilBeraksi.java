package Minggu4.ExampleObject;
import java.util.Scanner;

class Mobil {
    String warna;
    int tahunProduksi;
    String merk;

    void halo(){
        System.out.println("Hello");
    }
    void keterangan(String pemilik){
        System.out.println("Pemilik mobilku "+ pemilik);
    }
    int kecepatan(int n){
        System.out.println("Kecepatan maksimal mobil ini adalah = "+n);
        return n;
    }
}
public class MobilBeraksi {
    public static void main(String[] contoh) {
        Scanner input = new Scanner(System.in);
        Mobil mobilku = new Mobil();
        Mobil mobilmu = new Mobil();
        mobilku.halo();

        mobilku.warna = "Black";
        mobilku.tahunProduksi = 2006;
        mobilku.merk = "honda";

        mobilmu.warna = "White";
        mobilmu.tahunProduksi = 2022;
        mobilmu.merk = "supra";

        System.out.print("Warna mobilku " + mobilku.warna);
        System.out.print("& Tahun Produksi " + mobilku.tahunProduksi);
        System.out.println(" Merk nya " + mobilku.merk);
        mobilku.kecepatan(100);
    
        System.out.print("Warna mobilmu " + mobilmu.warna);
        System.out.print("& Tahun Produksi " + mobilmu.tahunProduksi);
        System.out.println(" Merk nya " + mobilmu.merk);

    }
}