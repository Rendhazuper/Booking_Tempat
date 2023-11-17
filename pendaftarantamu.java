 import java.util.Scanner;
 public class pendaftarantamu {
    int MAX_TAMU = 100; // Maksimum jumlah tamu yang dapat diakomodasi

    String[] namaTamu = new String[MAX_TAMU];
    int[] umurTamu = new int[MAX_TAMU];
    int[] nomorKamar = new int[MAX_TAMU];
    int jumlahTamu = 0;

    public static void main(String[] args) {
        pendaftarantamu hotel = new pendaftarantamu();
        Scanner scanner = new Scanner(System.in);

        // Pendaftaran tamu
        hotel.daftarTamu("Sesy", 19, 101);
        hotel.daftarTamu("Rendha", 20, 102);
        hotel.daftarTamu("Alfin", 21, 103);

        // Menampilkan daftar tamu
        hotel.tampilkanDaftarTamu();
    }

    public void daftarTamu(String nama, int umur, int kamar) {
        if (jumlahTamu < MAX_TAMU) {
            namaTamu[jumlahTamu] = nama;
            umurTamu[jumlahTamu] = umur;
            nomorKamar[jumlahTamu] = kamar;
            jumlahTamu++;
            System.out.println("Tamu " + nama + " telah berhasil mendaftar!");
        } else {
            System.out.println("Maaf, kamar hotel sudah penuh.");
        }
    }

    public void tampilkanDaftarTamu() {
        System.out.println("Daftar Tamu Hotel:");
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.println("Nama: " + namaTamu[i] + ", Umur: " + umurTamu[i] + ", Kamar: " + nomorKamar[i]);
        }
    }
}
    

