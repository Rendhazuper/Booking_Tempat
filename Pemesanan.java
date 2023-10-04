import java. util.Scanner;
public class Pemesanan {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int nomor_kamar, hari, jam;
        String sedia, jenis_inap;
        
        System.out.println("Masukkan nomor kamar");
        nomor_kamar = input.nextInt();
        input.nextLine();
            System.out.println("masukkan ketersediaan kamar :");
        sedia = input.nextLine();
    
       
        if (sedia.equalsIgnoreCase("Tersedia")) {
          System.out.println("masukkan jenis inap : ");          
          jenis_inap = input.nextLine();
          if (jenis_inap.equalsIgnoreCase("hari")) {
            System.out.println("masukkan durasi : ");
            hari = input.nextInt();
              System.out.println("=========================================");
          System.out.println("Detail pemesanan");
          System.out.println("nomor kamar " + nomor_kamar);
          System.out.println("lama menginap "+hari+ " hari");
          System.out.println("=========================================");
            }else if (jenis_inap.equalsIgnoreCase("jam")){
                System.out.println("Masukkan durasi ");
                jam = input.nextInt();
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

        
        }

        }