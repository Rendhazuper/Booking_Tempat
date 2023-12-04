import java.util.*;
public class gabungan {
static Scanner key = new Scanner(System.in);
static int[][] kamar = new int[2][20];
static String[] tipeKasur  = new String[3];
static String[] ketersediaan = new String[2];
static int[] harga = new int[2];


//persiapan array untuk format data input tamu 
static String [] Nama = new String[20];
static String[] nomorHP = new String[20];
static String[] checkin = new String[20];
static String[] checkout = new String[20];

static int[][] kamarDipesan = new int [20][5];


//pengisian data array
static{ 
    kamar[0][0] = 101; 
    kamar[0][1] = 102;
    kamar[0][2] = 103;
    kamar[0][3] = 104;
    kamar[0][4] = 105;
    kamar[1][0] = 201;
    kamar[1][1] = 202;
    kamar[1][2] = 203;
    kamar[1][3] = 204;
    kamar[1][4] = 205;
    kamar[1][5] = 206;
    kamar[1][6] = 207;
    kamar[1][7] = 208;
    kamar[1][8] = 209;
    kamar[1][9] = 210;
    kamar[1][10] = 211;
    
    kamarDipesan[0] = new int[]{101,102,103};

    tipeKasur[1] = "single bed";
    tipeKasur[2] = "double bed";

    ketersediaan[0] = "tersedia";
    ketersediaan[1] = "tersedia";

    harga[0] = 145000;
    harga[1] = 200000;

    //data array input tamu
    Nama[0]  = "Ren";
    Nama[1]  = "Viona";

    nomorHP[0] = "082141744866";
    nomorHP[1] = "088882828282";

    //format dd/mm/yyy
    checkin[0] = "12-12-2023";
    checkin[1] = "13-12-2023";

    checkout[0] = "24-12-2023";
    checkout[1] = "25-12-2023";

}

static int foundnull(){
    for (int i = 0; i < Nama.length; i++) {
        if (Nama[i] != null) {
            return i;
        }
    }
    return -1;
}

static void perbaruiKetersediaanBerdasarkanCheckin(String tanggalCek) {
    for (int i = 0; i < checkin.length; i++) {
        if (checkin[i] != null && checkin[i].equals(tanggalCek)) {
            // Mengambil data nomor kamar yang dipesan oleh tamu
            int[] nomorKamarDipesan = kamarDipesan[i];

            // Memperbarui ketersediaan hanya untuk nomor kamar yang dipesan pada tanggal tersebut
            for (int nomorKamar : nomorKamarDipesan) {
                if (nomorKamar != 0) {
                    int lantai = (nomorKamar / 100) - 1;
                    int indexKamar = nomorKamar % 100 - 1;
                    ketersediaan[lantai] = "tidak tersedia";
                }
            }
        }
    }
}

// Fungsi untuk menampilkan kamar dengan informasi tambahan
static void tampilkamar() {
    System.out.println("========================================");
    System.out.println("| Lantai | No. Kamar | Harga | Ketersediaan |");
    System.out.println("========================================");
    for (int i = 0; i < kamar.length; i++) {
        for (int j = 0; j < kamar[i].length; j++) {  
            int nomorKamar = kamar[i][j];
        if (nomorKamar != 0) {
            System.out.printf("| %-6d | %-9d | %-5d | %-13s |\n",
                    i + 1, nomorKamar, harga[i], ketersediaan[i]);      
        }
        
        }
    }
    System.out.println("----------------------------------------");
}

public static void main(String[] args) {
//login terlebih dahulu

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
        System.out.println("|| 3.Riwayat Tamu           ||");
        System.out.println("==============================");
        System.out.print("Pilih menu : ");
        pilih_menu = key.nextInt();
        switch (pilih_menu) {

            case 1:
            int index = foundnull();

             if (index != -1) {
                System.out.print("Masukkan Nama Tamu: ");
                key.nextLine();
            String namaTamu = key.nextLine();
            tampilkamar();
            System.out.print("Masukkan Nomor kamar : ");
            String inputNomor = key.nextLine();
            System.out.print("Masukkan tanggal Check-in (format dd-mm-yyy)");
            String inputcheckin = key.nextLine();
            System.out.print("Masukkan tanggal check-out (format dd-mm-yyy)");
            String inputcheckout = key.nextLine();

                Nama[index] = namaTamu;
                nomorHP[index] = inputNomor;
                checkin[index] = inputcheckin;
                checkout[index] = inputcheckout;
            }else{
                System.out.println("maaf kamar sudah penuh");
            }
           
                break;
           
             
            
            case 2:
            System.out.print("Masukkan tanggal yang ingin dicek (format dd-mm-yyyy): ");
            String tanggalCek = key.next();
            perbaruiKetersediaanBerdasarkanCheckin(tanggalCek);
            tampilkamar();

                break;

            case 3:

                break;
        
            default:
                continue;
        }
}
}
}
