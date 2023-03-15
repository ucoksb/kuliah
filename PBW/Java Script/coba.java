import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama : ");
        String nama = input.nextLine();
        System.out.print("Masukan nilai kimia : ");
        int kimia = input.nextInt();
        System.out.print("Masukan nilai matematik : ");
        int mtk = input.nextInt();
        System.out.print("Masukan nilai fisika : ");
        int fisika = input.nextInt();
        System.out.print("Masukan nilai biologi : ");
        int bio = input.nextInt();
        int total = kimia + mtk + fisika + bio;
        int total_nilai = mtk + fisika;

        System.out.println("\n\nNAMA : "+ nama);
        System.out.println("Nilai Kimia = "+ kimia);
        System.out.println("Nilai Matematika = "+ mtk);
        System.out.println("Nilai Fisika = "+ fisika);
        System.out.println("Nilai Biologi = "+ bio);

        System.out.println("Total Score = "+ total);
        System.out.println("Nilai Nilai Matematika & Fisiks = "+ total_nilai);
        if(mtk >= 75 && kimia >= 70 && fisika >= 70 && bio >= 70 && total >= 295 && total_nilai >= 170){
            System.out.println("Selamat kamu lolos masuk IPA");
        } else{
            System.out.println("Maaf kamu tidak lolos masuk IPA");
        }
        input.close();
    }
}