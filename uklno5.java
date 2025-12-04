import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class uklno5 {
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        int menangKomputer = 0;
        int menangPemain = 0;

        System.out.println("PERMAINAN LEMPAR DADU");
        System.out.println("Komputer dan pemain akan saling melempar dadu (1–6).");
        System.out.println("Permainan berakhir jika salah satu mencapai 5 kemenangan.\n");

        int ronde = 1;

        while (menangKomputer < 5 && menangPemain < 5) {

            System.out.println("=== Ronde " + ronde + " ===");
            System.out.print("Tekan tombol apa saja untuk melempar dadu... ");
            input.nextLine();

            int daduKomputer = rand.nextInt(6) + 1;
            int daduPemain = rand.nextInt(6) + 1;

            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            System.out.println("Nilai dadu komputer : " + daduKomputer);
            System.out.println("Nilai dadu pemain   : " + daduPemain);

            if (daduPemain > daduKomputer) {
                System.out.println(" Pemain menang di ronde ini!\n");
                menangPemain++;
            } else if (daduKomputer > daduPemain) {
                System.out.println(" Komputer menang di ronde ini!\n");
                menangKomputer++;
            } else {
                System.out.println(" Seri!\n");
            }

            ronde++;
        }
        System.out.println("========================================");

        if (menangPemain == 5) {
            System.out.println("Permainan selesai, pemenangnya adalah PEMAIN!");
        } else {
            System.out.println("Permainan selesai, pemenangnya adalah KOMPUTER!");
        }

        System.out.println("\n=== REKAP LEMPARAN ===");

        System.out.println("Riwayat lemparan komputer:");
        System.out.println(riwayatKomputer);

        System.out.println("\nRiwayat lemparan pemain:");
        System.out.println(riwayatPemain);

        System.out.println("\nTotal kemenangan pemain  : " + menangPemain);
        System.out.println("Total kemenangan komputer: " + menangKomputer);

        System.out.println("========================================");
        System.out.println("Terima kasih telah bermain!");
    }
}
}