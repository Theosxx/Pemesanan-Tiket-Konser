package tiketkonser;

public class TiketKonser {
    protected String nama_konser;
    protected String kategori_konser;
    protected int jumlah_tiket;
    protected int total_harga;

    // Constructor untuk inisialisasi objek
    public TiketKonser(String nama_konser, String kategori_konser, int jumlah_tiket) {
        this.nama_konser = nama_konser;
        this.kategori_konser = kategori_konser;
        this.jumlah_tiket = jumlah_tiket;
        this.total_harga = hitungTotalHarga(); // Menghitung total harga otomatis
    }

    // Method untuk menghitung total harga tiket berdasarkan kategori
    private int hitungTotalHarga() {
        int harga_per_tiket;
        switch (kategori_konser.toLowerCase()) {
            case "vip":
                harga_per_tiket = 1000000;
                break;
            case "regular":
                harga_per_tiket = 500000;
                break;
            case "festival":
                harga_per_tiket = 300000;
                break;
            default:
                harga_per_tiket = 0;
        }
        return harga_per_tiket * jumlah_tiket;
    }

    // Method untuk menampilkan detail tiket konser
    public void tampilkanDetail() {
        System.out.println("\n=== DETAIL PESANAN TIKET ===");
        System.out.println("Nama Konser: " + nama_konser);
        System.out.println("Kategori: " + kategori_konser);
        System.out.println("Jumlah Tiket: " + jumlah_tiket);
        System.out.println("Total Harga: Rp " + total_harga);
    }

}
