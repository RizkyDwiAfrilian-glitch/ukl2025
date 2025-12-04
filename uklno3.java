/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class uklno3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean lanjut = true;

        while (lanjut) {

            int a = rand.nextInt(10) + 1;   
            int b = rand.nextInt(10) + 1;  

            int op = rand.nextInt(3);

            int hasilBenar = 0;
            String operator = "";

            switch (op) {
                case 0:
                    operator = "*";
                    hasilBenar = a * b;
                    break;
                    
                case 1:
                    operator = "+";
                    hasilBenar = a + b; 
                    break;
                
            }

           
            System.out.print(a + " " + operator + " " + b + " = ");
            int jawaban = input.nextInt();
            
            if (jawaban == hasilBenar) {
                System.out.println("Jawaban benar!\n");
            } else {
                System.out.println("Jawaban salah. Hasil yang benar adalah: " + hasilBenar + "\n");
            }
            System.out.print("Lanjut soal? (ya/tidak): ");
            String pilih = input.next();

            if (pilih.equalsIgnoreCase("tidak")) {
                lanjut = false;
            }

            System.out.println();
        }
        System.out.println("okei tengkyu");
    }
}
