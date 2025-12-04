import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class uklno6{

  
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM BIAYA PEMINJAMAN BUKU ===\n");

        System.out.print("Nama Peminjam : ");
        String nama = input.nextLine();

        System.out.print("Judul Buku : ");
        String judul = input.nextLine();

        System.out.print("Kategori Buku (A/B/C): ");
        String kategori = input.nextLine().toUpperCase();

        System.out.print("Lama Peminjaman (hari): ");
        int lama = input.nextInt();

        int tarif = 0;

        switch (kategori) {
            case "A":
                tarif = 2000;
                break;
            case "B":
                tarif = 1500;
                break;
            case "C":
                tarif = 1000;
                break;
            default:
                System.out.println("\nKategori tidak valid!");
                return;
        }

        int biayaAwal = tarif * lama;

        int denda = 0;
        if (lama > 7) {
            int hariTerlambat = lama - 7;
            denda = hariTerlambat * 500;
        }

        int total = biayaAwal + denda;

        System.out.println("\n=== RINCIAN PEMINJAMAN ===");
        System.out.println("Nama Peminjam       : " + nama);
        System.out.println("Judul Buku          : " + judul);
        System.out.println("Kategori Buku       : " + kategori);
        System.out.println("Lama Peminjaman     : " + lama + " hari");
        System.out.println("Biaya Peminjaman    : Rp " + biayaAwal);
        System.out.println("Denda Keterlambatan : Rp " + denda);
        System.out.println("---------------------------------------");
        System.out.println("Total Biaya Akhir   : Rp " + total);
        System.out.println("---------------------------------------");
    }
}
}
