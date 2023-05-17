/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */
public class Obat {
    private String kodeObat;
    private String namaObat;
    private String jenisObat;
    private double harga;
    private int stok;

    // Constructor
    public Obat(String kodeObat, String namaObat, String jenisObat, double harga, int stok) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter
    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getJenisObat() {
        return jenisObat;
    }

    public void setJenisObat(String jenisObat) {
        this.jenisObat = jenisObat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Metode lainnya
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok obat tidak cukup.");
        }
    }

    public void printInfoObat() {
        System.out.println("Kode Obat: " + kodeObat);
        System.out.println("Nama Obat: " + namaObat);
        System.out.println("Jenis Obat: " + jenisObat);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
