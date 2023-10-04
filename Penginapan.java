import java. util.Scanner;
public class Penginapan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nomor_kamar, hari, jam;
        String ketersediaan = "Tersedia"; 
        String jenis_inap;
        System.out.println("Masukkan nomor kamar");
        nomor_kamar = input.nextInt();
        System.out.println("Masukkan hari menginap");
        hari = input.nextInt();
        System.out.println("Masukkan jam menginap");
        jam = input.nextInt();
        if (ketersediaan.equals("Tersedia")) {
          jenis_inap = input.nextLine();
          
        }
        }
    }


