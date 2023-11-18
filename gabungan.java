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
            System.out.println("tes 1");
                
                break;
        
            case 2:
            System.out.println("tes 2");
                break;

            case 3:
            System.out.println("tes 3");

            break;

         
            
        }
        
        break;
  
}
}
}
 





//login terlebih dahulu
