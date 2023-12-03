import java.util.*;
public class gabungan {
static Scanner key = new Scanner(System.in);
static int[][] kamar = new int[2][];
static String[] tipeKasur  = new String[3];
static String[] ketersediaan = new String[2];
static int[] hargahari = new int[2];
static int[] hargajam = new int[2];


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

    tipeKasur[1] = "single bed";
    tipeKasur[2] = "double bed";

    ketersediaan[0] = "tersedia";
    ketersediaan[1] = "tidak tersedia";

    hargahari[0] = 145000;
    hargahari[1] = 200000;

    hargajam[0] = 50000;
    hargajam[1] = 75000;

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
            System.out.println("");
                break;
            
            case 2:

                break;

            case 3:

                break;
        
            default:
                break;
        }
}
}
}



        
    
    



         
 
        



 





//login terlebih dahulu