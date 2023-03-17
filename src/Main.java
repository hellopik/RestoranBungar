import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int jumlah_tamu;
        String nama_pemesan;
        Double total_harga = 0.00;
        int disc_percentage = 10;
        Double price_after_disc;

        DecimalFormat df;
        df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        Menu[] list_menu = new Menu[6];
        list_menu[0] = new Menu("Nasi Goreng Spesial    ", 9999.99);
        list_menu[1] = new Menu("Ayam Bakar Spesial     ", 12345.67);
        list_menu[2] = new Menu("Steak Sirloin Spesial  ", 21108.40);
        list_menu[3] = new Menu("Kwetiaw Siram Spesial  ", 13579.13);
        list_menu[4] = new Menu("Kambing Guling Spesial ", 98765.43);
        list_menu[5] = new Menu("Babi Guling Sanur      ", 20000.00);

        System.out.println("Selamat datang...");
        System.out.print("Pesanan untuk berapa orang : ");
        jumlah_pemesan = input.nextInt();
        input.nextLine();
        System.out.print("Pesanan atas nama          : ");
        nama_pemesan = input.nextLine();

        System.out.println("Menu spesial hari ini");
        System.out.println("=====================");
        for (int i = 0; i < list_menu.length; i++) {
            System.out.println((i+1) + ". " + list_menu[i].getName() + "  @  " + "Rp. " + list_menu[i].getPrice());
        }

        System.out.println("Masukan jumlah pesanan anda [batas pesanan 0 - 10 porsi]");
        for (int i = 0; i < list_menu.length; i++) {
            System.out.print((i+1) + ". " + list_menu[i].getName() + " = ");
            int quantity = input.nextInt();
            list_menu[i].setQuantity(quantity);
        }

        System.out.println("Selamat menikmati makanan anda...");
        System.out.println("Pembelian atas nama " + nama_pemesan + " : ");
        for (int i = 0; i < list_menu.length; i++) {
            Double total = list_menu[i].getPrice() * list_menu[i].getQuantity();
            total_price = total_price + total;
            System.out.println((i+1) + ". " + list_menu[i].getName() + list_menu[i].getQuantity() + " porsi * " + "Rp. " + list_menu[i].getPrice() + " = " + "Rp. " + df.format(total));
        }
        price_after_disc = (100 - disc_percent) * total_price / 100;
        System.out.println("=================================================================");
        System.out.println("Total pembelian                            = " + "Rp. " + df.format(total_price));
        System.out.println("Disc. 10% <Masa Promosi>                   = " + "Rp. " + df.format(total_price - price_after_disc));
        System.out.println("=================================================================");
        System.out.println("Total pembelian setelah disc 10%           = " + "Rp. " + df.format(price_after_disc));
        System.out.println("Pembelian per orang" + " < untuk " + jumlah_pemesan + " orang > " + "= " + "Rp. " + df.format(price_after_disc / jumlah_pemesan));

        System.out.println("Terima kasih atas kunjungan anda...");
        System.exit(0);
    }
}
