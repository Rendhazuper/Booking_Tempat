import java.util.Scanner;
public class Checkin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari, stok;
        System.out.println("Masukkan stok");
        stok = input.nextInt();
        System.out.println("Masukkan hari");
        hari = input.nextInt();
        stok = stok-hari;
        if (stok == 0){
            System.out.println("Stok habis");
        }else{
            System.out.println("Stok tersedia");
        } 
        }
    }

