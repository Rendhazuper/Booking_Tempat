import java.util.*;
public class cek_sedia {
 public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    String[][] kamarTersedia = new String[10][31];
            int  nomor_kamar, tanggal;
            System.out.print("Masukkan nomor kamar: ");
            nomor_kamar = key.nextInt();
            key.nextLine();
            
            if (nomor_kamar < 1 || nomor_kamar > 10) {
                System.out.println("Nomor kamar tidak valid. Harus antara 1 dan 10.");
            }
            
            System.out.print("Masukkan tanggal (1-31): ");
            tanggal = key.nextInt();
            key.nextLine();
            if (tanggal < 1 || tanggal > 31) {
                System.out.println("Tanggal tidak valid. Harus antara 1 dan 31.");
            }
            
            System.out.print("Masukkan ketersediaan kamar (tersedia / tidak): ");
            String ketersediaan = key.nextLine();
            
            
            kamarTersedia[nomor_kamar - 1][tanggal - 1] = ketersediaan;

            System.out.println("Ketersediaan kamar untuk Nomor Kamar " + nomor_kamar + " pada Tanggal " + tanggal + " adalah: " + ketersediaan);

 }   
}
