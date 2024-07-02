import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class prkeiko2 {
    static Scanner sc = new Scanner(System.in);
    static LocalDateTime myDate = LocalDateTime.now();
    static DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static void main(String[] args) {
        System.out.println("Selamat datang di modiar Salatiga");
        System.out.println("Dapatkan diskon 20% untuk pembelian minimal 50k");
        System.out.println();
        System.out.print("Silahkan masukan nama anda= ");
        String nama = sc.nextLine();

        System.out.println("Menu modiar : ");
        System.out.println("==============================");

        //array buat nama produk
        String[] menu = {"Nasgor Ketekek", "Nasgor Mencelat", "Teh Beseren", "Jus"};

        //array buat harga produk
        int[] harga = {40000, 35000, 25000, 27000};

        //buat nampilih daftar produk
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i] + " Rp." + harga[i]);
        }

        //array buat banyak menu yang dipesan
        int[] transaksi = new int[menu.length];
        //status ini loop input pesanan
        boolean status = true;
        //ini buat cetak nota
        boolean status1 = false;

        //buat input pesenan e
        do {
            System.out.print("Inputkan Pilihan 1-4 menu anda: ");
            int pilihan = sc.nextInt();
            if (pilihan < 1 || pilihan > menu.length) {
                System.out.println("menu tidak tersedia");
                //status = false;
            } else {
                status1 = true;
                pilihan -= 1;
                System.out.print("Inputkan jumlah pesanan anda: ");
                int jumlah = sc.nextInt();
                transaksi[pilihan] += jumlah;
                System.out.println("Lanjut? Y/N");
                String inputStatus = sc.next();
                if (inputStatus.equalsIgnoreCase("N")) {
                    status = false;
                }
            }

            //System.out.println(Arrays.toString(transaksi));
        } while(status);

        if (status1) {
            System.out.println();
            System.out.println();

            System.out.println("Modiar Salatiga");
            System.out.println("Jl. Jalan 1 A");
            System.out.println("-----------------");
            System.out.println(nama + "       " + myDate.format(f));

            double tagihan = 0;
            double totalTmp;
            for (int i = 0; i < transaksi.length; i++) {
                if (transaksi[i] > 0) {
                    totalTmp = harga[i] * transaksi[i];
                    System.out.println(menu[i] + " " + transaksi[i] + "x" + harga[i] + " " + totalTmp);
                    tagihan += totalTmp;
                }
            }

            System.out.println("tahigan      :" + tagihan);
            double diskon = 0;
            if (tagihan > 50000) {
                diskon = 0.2 * tagihan;
            }
            System.out.println("Diskon       :" + diskon);
            double totalBayar = tagihan - diskon;
            System.out.println("total bayar  :" + totalBayar);
        }
     }
}
