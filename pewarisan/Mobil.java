package pewarisan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(final String merek, final String model, final int tahunProduksi, final int jumalhPintu, final String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumalhPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void infoMobil() {
        infoKendaraan();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar" + jenisBahanBakar);
    }
}
