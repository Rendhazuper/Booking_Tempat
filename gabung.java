import java.util.*;
    
    public class gabung {

    public static void main(String[] args) {
     //deklarasi variable dan tipe data   
     String username,password ;
     int menu, nomor_kamar;
     boolean stop = true;
     //deklarasi scanner
     Scanner key = new Scanner(System.in); 

     //login
     System.out.println("harap login");
     System.out.print("masukkan username : ");
     username = key.nextLine();
     System.out.print("masukkan password : ");
     password = key.nextLine();

     if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
         //daftar menu&fitur
        do{
        System.out.println("==========Aplikasi Hotel==========");
        System.out.println("1. Input pesanan");
        System.out.println("2. Pembayaran");
        System.out.print("pilih menu yang ingin dipilih : ");
        menu = key.nextInt();
        switch (menu) {
            case 1:
            do{
            String nama_pemesan,sedia, jenis_inap;
            int hari, jam,pilih1;
            System.out.println("Masukkan nomor kamar");
            nomor_kamar = key.nextInt();
            key.nextLine();
            System.out.println("masukkan ketersediaan kamar :");
            sedia = key.nextLine();
    
       
            if (sedia.equalsIgnoreCase("Tersedia")) {
            System.out.println("masukkan jenis inap : ");          
            jenis_inap = key.nextLine();
            if (jenis_inap.equalsIgnoreCase("hari")) {
            System.out.println("masukkan durasi : ");
                hari = key.nextInt();
            System.out.println("=========================================");
            System.out.println("Detail pemesanan");
            System.out.println("nomor kamar " + nomor_kamar);
            System.out.println("lama menginap "+hari+ " hari");
            System.out.println("=========================================");
                }else if (jenis_inap.equalsIgnoreCase("jam")){
                System.out.println("Masukkan durasi ");
                jam = key.nextInt();
                System.out.println("=========================================");
                System.out.println("Detail pemesanan");
                System.out.println("nomor kamar " + nomor_kamar);
                System.out.println("lama menginap "+jam+ " jam");
                System.out.println("=========================================");
                    }else{
                    System.out.println("input tidak valid");
                    }
                }else if (sedia.equalsIgnoreCase("tidak")){
                System.out.println("kamar tidak tersedia");
            }
            System.out.println("masukkan data lagi ?");
            System.out.println("0.tidak");
            System.out.println("1.iya");
            System.out.println("masukkan pilihan : ");
            pilih1 = key.nextInt();
            if (pilih1 == 0) {
                stop = false;
                
            }else{
                stop = true;
            }
        }while(stop);

                
                break;
        
            case 2:
            do{
                 int harga_kamar, total_bayar, jml_pesan, pembayaran;
                 String tipe_kamar, nama;
                 System.out.print("nama pemesan : ");
                 nama = key.nextLine();
                 key.nextLine();
                 System.out.print("Masukkan nomor kamar : ");
                 nomor_kamar = key.nextInt();
                 
                 key.nextLine();
                 System.out.println("Tipe kamar");
                 System.out.println("1. Standart");
                 System.out.println("2. Deluxe");
                 System.out.print("Pilih tipe kamar : ");
                 tipe_kamar = key.nextLine();
                 if (tipe_kamar.equalsIgnoreCase("Standart")) {
                    tipe_kamar = "Standart";
                    
                    
                 } else if (tipe_kamar.equalsIgnoreCase("Deluxe")) {
                    tipe_kamar = "deluxe";

                 }else{
                    System.out.println("input tidak valid");
                    break;
                 }
                 System.out.print("masukkan harga kamar :");
                 harga_kamar = key.nextInt();
                 System.out.print("masukkan jumlah pesanan :");
                 jml_pesan = key.nextInt();
                 total_bayar = harga_kamar*jml_pesan;

                 System.out.println("Total pembayaran adalah : " + total_bayar );
                 System.out.print("Nominal bayar : ");
                 pembayaran = key.nextInt();
                 int kurang = total_bayar - pembayaran;
                 int kembalian = pembayaran - total_bayar;
                 if (total_bayar== pembayaran) {
                    System.out.println("=============Pembayaran Berhasil========");
                    System.out.println("nama pemesan : "+nama);
                    System.out.println("nomor kamar : " +nomor_kamar);
                    System.out.println("tipe kamar : "+ tipe_kamar) ;
                    System.out.println("total bayar  : " +total_bayar );
                    System.out.println("membayar sebesar : "+pembayaran);
                    System.out.println("masukkan data lagi ?");
            System.out.println("0.tidak");
            System.out.println("1.iya");
            System.out.println("masukkan pilihan : ");
            int  pilih2 = key.nextInt();
            if (pilih2 == 0) {
                stop = false;
                
            }else{
                stop = true;
            }
                    
                 } else if (total_bayar > pembayaran) {
                 System.out.println("=============Pembayaran belum berhasil========");
                 System.out.println("nama pemesan : "+nama);
                    System.out.println("nomor kamar : " +nomor_kamar);
                    System.out.println("tipe kamar : "+ tipe_kamar) ;
                    System.out.println("total bayar  : " +total_bayar );
                    System.out.println("membayar sebesar : "+pembayaran);
                 System.out.println("nominal kurang : " +kurang);
                 System.out.println("masukkan data lagi ?");
            System.out.println("0.tidak");
            System.out.println("1.iya");
            System.out.println("masukkan pilihan : ");
           int  pilih2 = key.nextInt();
            if (pilih2 == 0) {
                stop = false;
                
            }else{
                stop = true;
            }
                

                break;    
                 }else{ 
                       System.out.println("=============Pembayaran Berhasil========");
                       System.out.println("nama pemesan : "+nama);
                    System.out.println("nomor kamar : " +nomor_kamar);
                    System.out.println("tipe kamar : "+ tipe_kamar) ;
                    System.out.println("total bayar  : " +total_bayar );
                    System.out.println("membayar sebesar : "+pembayaran);
                    System.out.println("kembali : "+kembalian);
                    System.out.println("masukkan data lagi ?");
            System.out.println("0.tidak");
            System.out.println("1.iya");
            System.out.println("masukkan pilihan : ");
            int pilih2 = key.nextInt();
            if (pilih2 == 0) {
                stop = false;
                
            }else{
                stop = true;
            }
                 }
                }while(stop);
                break; 
        }
        } while (menu !=0) ;

     } else {
        System.out.println("username atau password salah");
        
     }


       
    
        
    
    }
}
