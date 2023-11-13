import java.util.Scanner;

/**
 * Login
 */
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        boolean session = false;

        System.out.println("Harap login");
        System.out.print("Masukkan username: ");
        username = input.nextLine();
        System.out.print("Masukkan password: ");
        password = input.nextLine();

        if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
            session = true;
        } else {
            System.out.println("username atau password salah");
            session = false;
        }

    }
}
