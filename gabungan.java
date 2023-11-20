    import java.util.*;
public class gabungan {


/**
 * @param args
 */
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
            System.out.println("tes 1");

                break;

            case 2:
            System.out.println("Masukkan nomor kamar");
                break;

            case 3:
            System.out.println("tes 3");

            break;

            case 4:
            int MAX_TAMU = 100;
            String[][] riwayatTamu = new String[MAX_TAMU][4];
            String [] nama = {"ren" , "ron", "rin"}; 
            String [] checkin = {"11-12-2023","12-12-2023","15-12-2023"};
            String [] checkout = {"11-12-2023","12-12-2023","15-12-2023"};
            int [] nomor_kamar = {1,2,3};
            int pembayaran;

            System.out.println("===RIWAYAT TAMU===");
            for (int i = 0; i < nama.length; i++) { 
                System.out.printf("%-3d| %-10s| %-20s| %-20s| %-3d | \n", (i+1), nama[i], checkin[i], checkout[i], nomor_kamar[i]);
                    

            }
        
                break;
        
            default : 
            System.out.println("Pilih nomor yg ad!");
            continue;
            
        }

       

}
}
}





