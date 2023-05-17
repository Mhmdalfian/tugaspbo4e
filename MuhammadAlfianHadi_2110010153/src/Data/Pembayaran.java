/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */
import java.util.Date;

public class Pembayaran {
    private String nomorPembayaran;
    private String nomorRekamMedis;
    private Date tanggal;
    private double jumlah;
    private String metodePembayaran;

    // Constructor
    public Pembayaran(String nomorPembayaran, String nomorRekamMedis, Date tanggal, double jumlah, String metodePembayaran) {
        this.nomorPembayaran = nomorPembayaran;
        this.nomorRekamMedis = nomorRekamMedis;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.metodePembayaran = metodePembayaran;
    }

    // Getter dan Setter
    public String getNomorPembayaran() {
        return nomorPembayaran;
    }

    public void setNomorPembayaran(String nomorPembayaran) {
        this.nomorPembayaran = nomorPembayaran;
    }

    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public void setNomorRekamMedis(String nomorRekamMedis) {
        this.nomorRekamMedis = nomorRekamMedis;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    // Metode lainnya
    public void cetakStrukPembayaran() {
        System.out.println("Nomor Pembayaran: " + nomorPembayaran);
        System.out.println("Nomor Rekam Medis: " + nomorRekamMedis);
        System.out.println("Tanggal Pembayaran: " + tanggal);
        System.out.println("Jumlah Pembayaran: " + jumlah);
        System.out.println("Metode Pembayaran: " + metodePembayaran);
    }

    public void konfirmasiPembayaran() {
    
    }
}

