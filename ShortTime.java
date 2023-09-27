import java.util.Scanner;
public class ShortTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tipe_kamar;
        int stok_kamar, jam;
        System.out.println("Masukkan tipe kamar");
        tipe_kamar = input.nextLine();
        System.out.println("Masukkan stok kamar");
        stok_kamar = input.nextInt();
        System.out.println("Masukkan durasi");
        jam = input.nextInt();
        --stok_kamar;
        if (stok_kamar == 0) {
            System.out.println("status kamar : kamar tidak tersedia");
        }else{
            System.out.println("status kamar : Kamar tersedia");
        }
    }
}
