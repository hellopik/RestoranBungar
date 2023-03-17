public class Menu {
    private String nama;
    private Double harga;
    private int jumlah;

    Menu(String nama, Double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public Double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
}
