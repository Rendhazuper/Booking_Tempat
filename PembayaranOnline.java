import java.util.Scanner;
public class PembayaranOnline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_kamar, total_bayar, jml_pesan, pembayaran;
        String nama_kamar;
        System.out.println("Masukkan nama kamar");
        nama_kamar = input.nextLine();
        System.out.println("Masukkan harga kamar");
        harga_kamar = input.nextInt();
        System.out.println("Masukkan jumlah pesan");
        jml_pesan = input.nextInt();
        total_bayar =harga_kamar*jml_pesan;
        System.out.println("Total pembayaran adalah : "+ total_bayar);
        System.out.println("Nominal bayar : ");
        pembayaran = input.nextInt();
        if (total_bayar == pembayaran) {
            System.out.println("Pembayaran berhasil");
        }else{
            System.out.println("Pesanan belum dibayar");
        }
    }
}
