import java.util.*;

public class gabungan {
static Scanner key = new Scanner(System.in);
static int[][] kamar = new int[2][20];
static String[] tipeKasur  = new String[3];
static int[] harga = new int[2];
static int[] kamarpesan = new int [20];
static String[] tanggal = new String [7];

//array riwayat
static String[]  namariwayat = new String[20];



//persiapan array untuk format data input tamu 
static String [] Nama = new String[20];
static String[] nomorHP = new String[20];
static String[] checkin = new String[20];
static String[] checkout = new String[20];
//pengisian data array
static{ 
    kamar[0][0] = 101; 
    kamar[0][1] = 102;
    kamar[0][2] = 103;
    kamar[0][3] = 104;
    kamar[0][4] = 105;
    kamar[0][5] = 106;
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

    tanggal[0] = "1-12-2023";
    tanggal[1] = "2-12-2023";
    tanggal[2] = "3-12-2023";
    tanggal[3] = "4-12-2023";
    tanggal[4] = "5-12-2023";
    tanggal[5] = "6-12-2023";
    tanggal[6] = "7-12-2023";
    
    kamarpesan[0] = 211;
    kamarpesan[1] = 210;

    tipeKasur[1] = "single bed";
    tipeKasur[2] = "double bed";

    harga[0] = 145000;
    harga[1] = 200000;

    //data array input tamu
    Nama[0]  = "Ren";
    Nama[1]  = "Viona";

    nomorHP[0] = "082141744866";
    nomorHP[1] = "088882828282";

    //format dd/mm/yyy
    checkin[0] = "3-12-2023";
    checkin[1] = "2-12-2023";

    checkout[0] = "2-12-2023";
    checkout[1] = "3-12-2023";

    //data riwayat tamu
    namariwayat[0]  = "Ren";
    namariwayat[1]  = "Viona";


}

static int foundnull(){
    for (int i = 0; i < Nama.length; i++) {
        if (Nama[i] == null) {
            return i;
        }
    }
    return -1;
}
static void tampiltanggal(){
    System.out.println("silahkan pilih tanggal");
    for (int i = 0; i < tanggal.length; i++) {
        System.out.println(i+1 + ". " + tanggal[i]);
    }
}

static void Tamu() {
    System.out.println("=========================================================================================================================");
    System.out.println("|Nama \t |\t No. Hp \t|\tTanggal checkin \t|\t Tanggal checkout \t|\t Nomor kamar \t|");
    System.out.println("=========================================================================================================================");
    for (int i = 0; i < Nama.length; i++) {
        if (Nama[i] == null ) {
             continue;
        }else{
            System.out.printf("| %-6s |\t %-14s |\t %-22s |\t %-22s |\t %12d  |\n", Nama[i], nomorHP[i], checkin[i], checkout[i], kamarpesan[i]);
        }
       
    }
    System.out.println("=========================================================================================================================");
}

static void riwayattamu(){
    System.out.println("=========================================================================================================================");
    System.out.println("|Nama \t |\t No. Hp \t|\tTanggal checkin \t|\t Tanggal checkout \t|\t Nomor kamar\t|");
    System.out.println("=========================================================================================================================");
    for (int i = 0; i < namariwayat.length; i++) {
        if (namariwayat[i] == null ) {
             continue;
        }else{
            System.out.printf("| %-6s |\t %-14s |\t %-22s |\t %-22s |\t %12d  |\n", namariwayat[i], nomorHP[i], checkin[i], checkout[i], kamarpesan[i]);
        }
       
    }
    System.out.println("=========================================================================================================================");
}

static void tampilkamar(int pilihtanggal) {
    System.out.println("====================================================");
    System.out.println("| Lantai | No. Kamar | Harga | Ketersediaan \t   |");
    System.out.println("====================================================");
    for (int i = 0; i < kamar.length; i++) {
        for (int j = 0; j < kamar[i].length; j++) {
            int nomorKamar = kamar[i][j];
            if (nomorKamar != 0) {
                boolean dipesan = false;
                for (int k = 0; k < kamarpesan.length; k++) {
                    if (kamarpesan[k] == nomorKamar && checkin[k].equals(tanggal[pilihtanggal])) {
                        dipesan = true;
                        break;
                    }
                }
                
                if (dipesan) {
                    System.out.printf("| %-6d | %-9d | %-5d | %-18s |\n",
                        i + 1, nomorKamar, harga[i], "tidak tersedia");  
                } else {
                    System.out.printf("| %-6d | %-9d | %-5d | %-18s |\n",
                        i + 1, nomorKamar, harga[i], "Tersedia");  
                }
            }
        }
    }
    System.out.println("----------------------------------------------------");
}

static void hapusTamu(String namaCO){
int indextamu = -1 ;
            for (int i = 0; i < Nama.length; i++) {
                if (Nama[i] != null && Nama[i].equals(namaCO)) {
                    indextamu = i;
                    break;
                    
                }
                
            }    
            
            if (indextamu != -1) {
                System.out.println(namaCO + " Berhasil checkout");
                Nama[indextamu] = null;
                // nomorHP[indextamu] = null;
                // checkin[indextamu] = null;
                // checkout[indextamu] = null;
                kamarpesan[indextamu] = 0;
            }else{
                System.out.println("tidak ada tamu dengan nama "+ namaCO);
            }
}

static int hitunghari(int tgl_checkin, int tgl_checkout){
    String[] partsCheckin = tanggal[tgl_checkin].split("-");
    String[] partsCheckout = tanggal[tgl_checkout].split("-");;
    int haricekin = Integer.parseInt(partsCheckin[0]);
    int haricekout = Integer.parseInt(partsCheckout[0]);
    int jumlah = haricekout-haricekin;
    return jumlah; 
}

    static void pembayaran(int menu2, int jumlahbayar, String nama, String tglcheckin, String tglcheckout, String nohp, int nomorkamar, int index){
        switch (menu2) {
            case 1:
            System.out.println("masukkan pembayaran : ");
            int bayar = key.nextInt();
            if (bayar == jumlahbayar) {
                System.out.println("kamar berhasil di booking");
                Nama[index] = nama;
                namariwayat[index]= nama;
                checkin[index] = tglcheckin;
                checkout[index] = tglcheckout;
                kamarpesan[index] = nomorkamar;
                nomorHP[index] = nohp;
            }else if (bayar > jumlahbayar) {
                System.out.println("kamar berhasil di booking");
                int kembalian = jumlahbayar - bayar;
                System.out.println("kembalian : "+ kembalian);
                Nama[index] = nama;
                namariwayat[index]= nama;
                checkin[index] = tglcheckin;
                checkout[index] = tglcheckout;
                kamarpesan[index] = nomorkamar;
                nomorHP[index] = nohp;
        }else{
            System.out.println("pembayaran tidak berhasil");
            System.out.println("uang tidak mencukupi");
        }
            
            break;
    
        case 2:
            break;
    }
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
        System.out.println("|| 2.Check Out              ||");
        System.out.println("|| 3.Ketersediaan kamar     ||");
        System.out.println("|| 4.Riwayat Tamu           ||");
        System.out.println("==============================");
        System.out.print("Pilih menu : ");
        pilih_menu = key.nextInt();
        switch (pilih_menu) {

            case 1:
            int indexlantai = -1;
            int index = foundnull();   
 

            if (index != -1) {
            tampiltanggal();
            System.out.print("Input tanggal checkin : ");
            int input_tglin = key.nextInt();
            int tgl_checkin = input_tglin-1;    
            System.out.print("Input tanggal checkout : ");
            int input_tglout = key.nextInt();
            int tgl_checkout = input_tglout-1;
            System.out.print("Masukkan Nama Tamu: ");
            key.nextLine();
            String namaTamu = key.nextLine();
            tampilkamar(tgl_checkin);
            System.out.print("Masukkan Nomor kamar : ");
            int inputNomor = key.nextInt();
            key.nextLine();

            System.out.println("Masukkan nomor hp ");  
            String nohp = key.next();
            key.nextLine();
            int jumlahhari = hitunghari(tgl_checkin, tgl_checkout);
            int nomorkamardipesan = inputNomor;
            if (jumlahhari <= 0) {
                System.out.println("input hari tidak valid");
            } else {
                for (int i = 0; i < kamar.length; i++) {
                for ( int j = 0; j < kamar[i].length; j++) {
                    if (kamar[i][j] == nomorkamardipesan) {
                        indexlantai = i;
                        break;
                    }
                }
            }
            if (indexlantai != -1) {
            int hargakamar = harga[indexlantai];
            int jumlahbayar = hargakamar * jumlahhari;
            System.out.println("================= Detail Pemesanan ================");
            System.out.println("|Nama              : "+namaTamu+"                   \t  |");
            System.out.println("|Nomor kamar       : "+inputNomor+"                 \t  |");
            System.out.println("|Tanggal check-in  : "+tanggal[tgl_checkin]+"     \t\t  |");
            System.out.println("|Tanggal check-out : "+tanggal[tgl_checkout]+"    \t\t  |");
            System.out.println("|Jumlah bayar      : "+jumlahbayar+"                \t  |");
            System.out.println("|Tipe Kasur        : "+tipeKasur[index-1]+"          \t  |");
            System.out.println("===================================================");

            System.out.println("apakah ingin lanjut pembayaran ? : ");

            
            System.out.println("1. ya ");
            System.out.println("2. tidak ");
            System.out.print("input pilihan : ");
            int menu2 = key.nextInt();
            pembayaran(menu2, jumlahbayar,namaTamu,tanggal[tgl_checkin],tanggal[tgl_checkout],nohp,inputNomor,index);
            }
            }    
            
            
            }else{
                System.out.println("maaf kamar sudah penuh");
            }
           
                break;
            
            case 2 : 
            Tamu();

            System.out.print("masukkan nama tamu yang ingin checkout : ");
            String namaCO = key.next();
            key.nextLine();

            hapusTamu(namaCO);

            
             break; 
            
            case 3:
            tampiltanggal();
            System.out.print("input tanggal yang ingin di cek : ");
            int input_tgl = key.nextInt();
            int tgl_cek = input_tgl-1;    
            tampilkamar(tgl_cek);

                break;

            case 4:
            riwayattamu();

                break;
        
            default:
                continue;
        }
}
}
}
