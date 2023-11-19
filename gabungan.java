import java.util.*;
public class gabungan {


public static void main(String[] args) {
//login terlebih dahulu
Scanner key = new Scanner(System.in);
String username, password;
boolean sesi = false;
int kesempatan = 3;

while (!sesi && kesempatan > 0) {
    
    System.out.println("Login");
    System.out.print("Masukkan username : ");
    username = key.nextLine();
    System.out.print("Masukkan password : ");
    password = key.nextLine();

    if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
        sesi = true; 
    } else {
        kesempatan--; 
        System.out.println("Username atau Password salah");
        System.out.println("Kesempatan : "+kesempatan);
        
    }

}
while (sesi) {
    int pilih_menu = 0;
        System.out.println("==============================");
        System.out.println("|| 1.Booking kamar          ||");
        System.out.println("|| 2.Manage kamar           ||");
        System.out.println("|| 3.Manage tamu            ||");
        System.out.println("|| 4.Riwayat Tamu           ||");
        System.out.println("==============================");
        System.out.print("Pilih menu : ");
        pilih_menu = key.nextInt();

        switch (pilih_menu) {
            case 1:
          
             Scanner scanner = new Scanner(System.in);

        // Harga kamar per hari atau per jam
        int hargaKamar = 100; // Ganti dengan harga kamar yang sesuai

        // Input nama tamu
        System.out.print("Masukkan nama tamu: ");
        String namaTamu = scanner.next();

        // Input nomor kamar yang dipesan
        System.out.print("Masukkan nomor kamar: ");
        int nomorKamar = scanner.nextInt();

        // Tampilkan pilihan menginap hari atau jam
        System.out.println("Pilihan menginap:");
        System.out.println("1. Menginap Hari");
        System.out.println("2. Menginap Jam");
        System.out.print("Pilih opsi (1/2): ");
        int pilihan = scanner.nextInt();

        int jumlah = 0;
        double totalHarga = 0;

        if (pilihan == 1) {
            // Pilihan pertama (hari)
            System.out.print("Masukkan jumlah hari: ");
            jumlah = scanner.nextInt();
            totalHarga = hargaKamar * jumlah;
        } else if (pilihan == 2) {
            // Pilihan kedua (jam)
            System.out.print("Masukkan jumlah jam: ");
            jumlah = scanner.nextInt();
            totalHarga = hargaKamar * jumlah / 24; // asumsi 1 hari = 24 jam
        }

        // Input pembayaran
        System.out.print("Masukkan jumlah pembayaran: ");
        double pembayaran = scanner.nextDouble();

        // Proses pembayaran dan kembalian
        if (pembayaran > totalHarga) {
            double kembalian = pembayaran - totalHarga;
            System.out.println("Kembalian: " + kembalian);
        } else if (pembayaran < totalHarga) {
            System.out.println("Pembayaran kurang. Transaksi dibatalkan.");
        } else {
            // Tampilkan informasi booking
            System.out.println("Nama Tamu: " + namaTamu);
            System.out.println("Nomor Kamar: " + nomorKamar);
            System.out.println("Tanggal Booking: " + java.time.LocalDate.now());
            System.out.println("Total Harga: " + totalHarga);
            System.out.println("Status: Lunas");
        }
    
             break;
            case 2:
            System.out.println("tes 2");
                break;

            case 3:
            System.out.println("tes 3");
            break;
    }   }
}
}
        
    
    



         
 
        



 





//login terlebih dahulu
