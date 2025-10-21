public class Pemesanan implements Printable {
    private String namaPemesan;
    private Film film;
    private int jumlahTiket;
    private Tiket tiket;

    public Pemesanan(String namaPemesan, Film film, int jumlahTiket, String jamTayang) {
        this.namaPemesan = namaPemesan;
        this.film = film;
        this.jumlahTiket = jumlahTiket;
        this.tiket = new Tiket(film, jumlahTiket, jamTayang);
    }

    @Override
    public void printData() {
        System.out.println("\n--- PEMESANAN BERHASIL ---");
        tiket.tampilkanTiket();
        System.out.println("Terima kasih telah memesan!");
    }
}
