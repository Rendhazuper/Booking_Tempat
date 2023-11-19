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
            jumlah = key.nextInt();
            totalHarga = hargaKamar * jumlah;
        } else if (pilihan == 2) {
            // Pilihan kedua (jam)
            System.out.print("Masukkan jumlah jam: ");
            jumlah = key.nextInt();
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
        // 1. Inisialisasi data
        int[][] informasiKamar = new int[10][2]; // Misalnya, 10 kamar dengan nomor kamar dan status ketersediaan
        // Inisialisasi ketersediaan kamar (0: tersedia, 1: tidak tersedia)
        for (int i = 0; i < informasiKamar.length; i++) {
            informasiKamar[i][0] = i + 1; // Nomor kamar
            informasiKamar[i][1] = 0;    // Ketersediaan diatur menjadi tersedia awalnya
        }

        // 2. Input data
        int[][] inputKamar = new int[10][2]; // Array untuk menyimpan data input
        for (int i = 0; i < inputKamar.length; i++) {
            System.out.println("Masukkan informasi kamar ke-" + (i + 1));
            System.out.print("Nomor Kamar: ");
            inputKamar[i][0] = key.nextInt();

            System.out.print("Ketersediaan (0: Tersedia, 1: Tidak Tersedia): ");
            inputKamar[i][1] = key.nextInt();

            // Mengupdate status kamar di informasiKamar
            for (int j = 0; j < informasiKamar.length; j++) {
                if (informasiKamar[j][0] == inputKamar[i][0]) {
                    informasiKamar[j][1] = inputKamar[i][1];
                    break;
                }
            }
        }

        // 3. Tampilkan array
        System.out.println("\nInformasi Kamar:");
        System.out.println("Nomor Kamar\tKetersediaan");
        for (int i = 0; i < informasiKamar.length; i++) {
            System.out.println(informasiKamar[i][0] + "\t\t\t" + informasiKamar[i][1]);
        }
     
                break;
           
            case 3:
            System.out.println("tes 3");
            break;
    }
}
}
}


        
    
    



         
 
        



 





//login terlebih dahulu
