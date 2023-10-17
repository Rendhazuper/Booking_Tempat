import java.util.*;
public class Final {
    
   public static void main(String[] args) {
        String username = "", password = "";
        boolean session = false;
        Scanner key = new Scanner(System.in);

        
        while (!session) {
            // String username, password;
        System.out.println("harap login");
        System.out.print("masukkan username : ");
        username = key.nextLine();
        System.out.print("masukkan password : ");
        password = key.nextLine();
    
        if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
            session = true;

    }else{
        System.out.println("username atau password salah");
        break;
    }
}
    while (session) {
        System.out.println("selamat datang "+ username + " ingin melakukan input pesanan ?");
        System.out.println("1. iya");
        System.out.println("2. tidak");
        System.out.print("pilih menu : ");
        int pilih_menu;
        pilih_menu = key.nextInt();
        switch (pilih_menu) {
            case 1: 
            String nama_pemesan,sedia, jenis_inap, nama_tipe;
            int hari, jam, pilih_tipe , nomor_kamar, tipe_kamar, harga_kamar, total_bayar, jml_pesan, bayar;
            System.out.print("Masukkan nama pemesan : ");
            nama_pemesan= key.nextLine();
            key.nextLine();
            System.out.print("Masukkan nomor kamar : ");
            nomor_kamar = key.nextInt();
            key.nextLine();
            System.out.println("tipe kamar : ");
            System.out.println("1. Standart");
            System.out.println("2. Deluxe");
            System.out.print("pilih tipe kamar : ");
            pilih_tipe = key.nextInt();
            key.nextLine();
            switch (pilih_tipe) {
                case 1:
                nama_tipe = "Standart";//input nilai nama tipe kamar untuk dipanggil pada struk
                
                //input nilai
                System.out.print("masukkan ketersediaan kamar (tersedia / tidak): ");
                sedia = key.nextLine();
                if (sedia.equalsIgnoreCase("Tersedia")) {
                System.out.print("masukkan harga kamar : ");
                harga_kamar = key.nextInt();
                key.nextLine();
                System.out.print("masukkan jenis inap (hari/jam): ");          
                jenis_inap = key.nextLine();
                    if (jenis_inap.equalsIgnoreCase("hari")) {
                    System.out.print("masukkan durasi : ");
                    hari = key.nextInt();
                    total_bayar = harga_kamar * hari;
                    System.out.println("total harus dibayar : "+ total_bayar);
                    System.out.print("Masukkan pembayaran : ");
                    bayar = key.nextInt();
                    if (bayar > total_bayar) {
                   int kembalian = bayar - total_bayar;
                    System.out.println("Pembayaran berhasil");
                    System.out.println("=============Detail Pesanan===========");
                    System.out.println("nama pemesan : "+nama_pemesan);
                    System.out.println("nomor kamar " + nomor_kamar);
                    System.out.println("tipe kamar : "+ nama_tipe);
                    System.out.println("lama menginap "+hari+ " hari");
                    System.out.println("taghinan Rp "+total_bayar);
                    System.out.println("bayar Rp "+bayar);
                    System.out.println("kembalian Rp "+kembalian);
                    System.out.println("=========================================");
                    } else if (total_bayar == bayar) {
                         System.out.println("Pembayaran berhasil");
                    System.out.println("=============Detail Pesanan===========");
                    System.out.println("nama pemesan : "+nama_pemesan);
                    System.out.println("nomor kamar " + nomor_kamar);
                    System.out.println("tipe kamar : "+ nama_tipe);
                    System.out.println("lama menginap "+hari+ " hari");
                    System.out.println("taghinan Rp "+total_bayar);
                    System.out.println("bayar Rp "+bayar);
                    System.out.println("=========================================");
                    }else{
                        System.out.println("Pembayaran tidak berhasil");
                    }   
                }else if (jenis_inap.equalsIgnoreCase("jam")){
                    System.out.print("Masukkan durasi : ");
                    jam = key.nextInt();
                    total_bayar = harga_kamar * jam;
                     System.out.println("total harus dibayar : "+ total_bayar);
                    System.out.print("Masukkan pembayaran : ");
                    bayar = key.nextInt();
                    if (bayar > total_bayar) {
                   int kembalian = bayar - total_bayar;
                    System.out.println("Pembayaran berhasil");
                    System.out.println("=============Detail Pesanan===========");
                    System.out.println("nama pemesan : "+nama_pemesan);
                    System.out.println("nomor kamar " + nomor_kamar);
                    System.out.println("tipe kamar : "+ nama_tipe);
                    System.out.println("lama menginap "+jam+ " hari");
                    System.out.println("taghinan Rp "+total_bayar);
                    System.out.println("bayar Rp "+bayar);
                    System.out.println("kembalian Rp "+kembalian);
                    System.out.println("=========================================");
                    } else if (total_bayar == bayar) {
                         System.out.println("Pembayaran berhasil");
                    System.out.println("=============Detail Pesanan===========");
                    System.out.println("nama pemesan : "+nama_pemesan);
                    System.out.println("nomor kamar " + nomor_kamar);
                    System.out.println("tipe kamar : "+ nama_tipe);
                    System.out.println("lama menginap "+jam+ " hari");
                    System.out.println("taghinan Rp "+total_bayar);
                    System.out.println("bayar Rp "+bayar);
                    System.out.println("=========================================");
                    }else{
                        System.out.println("Pembayaran tidak berhasil");
                    }  
                        }else{
                        System.out.println("input tidak valid");
                        break;
                        }

                    }else if (sedia.equalsIgnoreCase("tidak")){
                   
                }

                    break;
            
                case 2:
                 nama_tipe = "Deluxe";//input nilai nama tipe kamar untuk dipanggil pada struk
                
                //input nilai
                System.out.print("masukkan ketersediaan kamar (tersedia / tidak): ");
                sedia = key.nextLine();
                if (sedia.equalsIgnoreCase("Tersedia")) {
                System.out.print("masukkan harga kamar : ");
                harga_kamar = key.nextInt();
                key.nextLine();
                System.out.print("masukkan jenis inap (hari/jam): ");          
                jenis_inap = key.nextLine();
                    if (jenis_inap.equalsIgnoreCase("hari")) {
                    System.out.print("masukkan durasi : ");
                    hari = key.nextInt();
                    total_bayar = harga_kamar * hari;
                    System.out.println("total harus dibayar : "+ total_bayar);
                    System.out.print("Masukkan pembayaran : ");
                    bayar = key.nextInt();
                    if (bayar > total_bayar) {
                   int kembalian = bayar - total_bayar;
                    System.out.println("Pembayaran berhasil");
                    System.out.println("=============Detail Pesanan===========");
                    System.out.println("nama pemesan : "+nama_pemesan);
                    System.out.println("nomor kamar " + nomor_kamar);
                    System.out.println("tipe kamar : "+ nama_tipe);
                    System.out.println("lama menginap "+hari+ " hari");
                    System.out.println("taghinan Rp "+total_bayar);
                    System.out.println("bayar Rp "+bayar);
                    System.out.println("kembalian Rp "+kembalian);
                    System.out.println("=========================================");
                    } else if (total_bayar == bayar) {
                         System.out.println("Pembayaran berhasil");
                    System.out.println("=============Detail Pesanan===========");
                    System.out.println("nama pemesan : "+nama_pemesan);
                    System.out.println("nomor kamar " + nomor_kamar);
                    System.out.println("tipe kamar : "+ nama_tipe);
                    System.out.println("lama menginap "+hari+ " hari");
                    System.out.println("taghinan Rp "+total_bayar);
                    System.out.println("bayar Rp "+bayar);
                    System.out.println("=========================================");
                    }else{
                        System.out.println("Pembayaran tidak berhasil");
                    }   
                }else if (jenis_inap.equalsIgnoreCase("jam")){
                    System.out.print("Masukkan durasi : ");
                    jam = key.nextInt();
                    total_bayar = harga_kamar * jam;
                     System.out.println("total harus dibayar : "+ total_bayar);
                    System.out.print("Masukkan pembayaran : ");
                    bayar = key.nextInt();
                    if (bayar > total_bayar) {
                   int kembalian = bayar - total_bayar;
                    System.out.println("Pembayaran berhasil");
                    System.out.println("=============Detail Pesanan===========");
                    System.out.println("nama pemesan : "+nama_pemesan);
                    System.out.println("nomor kamar " + nomor_kamar);
                    System.out.println("tipe kamar : "+ nama_tipe);
                    System.out.println("lama menginap "+jam+ " hari");
                    System.out.println("taghinan Rp "+total_bayar);
                    System.out.println("bayar Rp "+bayar);
                    System.out.println("kembalian Rp "+kembalian);
                    System.out.println("=========================================");
                    } else if (total_bayar == bayar) {
                         System.out.println("Pembayaran berhasil");
                    System.out.println("=============Detail Pesanan===========");
                    System.out.println("nama pemesan : "+nama_pemesan);
                    System.out.println("nomor kamar " + nomor_kamar);
                    System.out.println("tipe kamar : "+ nama_tipe);
                    System.out.println("lama menginap "+jam+ " hari");
                    System.out.println("taghinan Rp "+total_bayar);
                    System.out.println("bayar Rp "+bayar);
                    System.out.println("=========================================");
                    }else{
                        System.out.println("Pembayaran tidak berhasil");
                    }  
                        }else{
                        System.out.println("input tidak valid");
                        break;
                        }

                    }else if (sedia.equalsIgnoreCase("tidak")){
                   
                }

                    break;
            }
            
                break;
        
            case 2:
            System.out.println("Anda telah keluar dari aplikasi");
            session = false;
                break;
        }
    }

}
}
