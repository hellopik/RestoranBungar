import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int jumlah_tamu;
        int persen_diskon = 10;
        Double harga_setelah_diskon;
        String nama_tamu;
        Double total_harga = 0.00;

        DecimalFormat df;
        df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        Menu[] daftar_menu = new Menu[5];
        daftar_menu[0] = new Menu("Nasi Goreng Spesial    ", 9999.99);
        daftar_menu[1] = new Menu("Ayam Bakar Spesial     ", 12345.67);
        daftar_menu[2] = new Menu("Steak Sirloin Spesial  ", 21108.40);
        daftar_menu[3] = new Menu("Kwetiaw Siram Spesial  ", 13579.13);
        daftar_menu[4] = new Menu("Kambing Guling Spesial ", 98765.43);

        System.out.println("Selamat siang...");
        System.out.print("Pesanan untuk berapa orang : ");
        jumlah_tamu = input.nextInt();
        input.nextLine();
        System.out.print("Pesanan atas nama          : ");
        nama_tamu = input.nextLine();

        System.out.println("Menu Spesial hari ini");
        System.out.println("=====================");
        for (int i = 0; i < daftar_menu.length; i++) {
            System.out.println((i+1) + ". " + daftar_menu[i].getNama() + "  @  " + "Rp. " + daftar_menu[i].getHarga());
        }

        System.out.println("Pesanan Anda [batas pesanan 0-10 por]");
        for (int i = 0; i < daftar_menu.length; i++) {
            System.out.print((i+1) + ". " + daftar_menu[i].getNama() + " = ");
            int quantity = input.nextInt();
            daftar_menu[i].setJumlah(quantity);
        }

        System.out.println("Selamat menikmati makanan anda...");
        System.out.println("Pembelian : ");
        for (int i = 0; i < daftar_menu.length; i++) {
            Double total = daftar_menu[i].getHarga() * daftar_menu[i].getJumlah();
            total_harga = total_harga + total;
            System.out.print("\n" + (i+1) + ". " + daftar_menu[i].getNama() + daftar_menu[i].getJumlah() 
            + " porsi * " + "Rp. " + daftar_menu[i].getHarga() + " = " + "Rp. " + df.format(total));
        }
        System.out.print(" +\n");
        harga_setelah_diskon = (100 - persen_diskon) * total_harga / 100;
        System.out.println("=================================================================");
        System.out.println("Total pembelian                                  = " + "Rp. " + df.format(total_harga));
        System.out.println("Disc. 10% <Masa Promosi>                         = " + "Rp. " +
         df.format(total_harga - harga_setelah_diskon) + " -");
        System.out.println("=================================================================");
        System.out.println("Total pembelian setelah disc 10%           = " + "Rp. " + df.format(harga_setelah_diskon));
        System.out.println("Pembelian per orang" + " < untuk " + jumlah_tamu + " orang >      " + "= " + "Rp. " +
         df.format(harga_setelah_diskon / jumlah_tamu));

        System.out.println("            Terima kasih atas kunjungan anda...");
        System.out.print("            ...Tekan ENTER untuk keluar...");
        input.nextLine();
        System.exit(0);

        input.close();
    }
}
