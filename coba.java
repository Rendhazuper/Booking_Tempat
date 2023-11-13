  import java.util.*;
public class coba {
    
  


    public static void main(String[] args) {
        String username, password;
        int menu, nomor_kamar;
        boolean loggedIn = false;
        Scanner key = new Scanner(System.in);

        while (!loggedIn) {
            System.out.println("Harap login");
            System.out.print("Masukkan username: ");
            username = key.nextLine();
            System.out.print("Masukkan password: ");
            password = key.nextLine();

            if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
                loggedIn = true;
            } else {
                System.out.println("Username atau password salah. Silakan coba lagi.");
            }
        }

        while (loggedIn) {
            System.out.println("==========Aplikasi Hotel==========");
            System.out.println("1. Input pesanan");
            System.out.println("2. Pembayaran");
            System.out.print("Pilih menu yang ingin dipilih (0 untuk keluar): ");
            menu = key.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Anda telah keluar dari aplikasi.");
                    loggedIn = false; // Keluar dari loop utama
                    break;

                case 1:
                    // ... (bagian input pesanan)
                    break;

                case 2:
                    // ... (bagian pembayaran)
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}


