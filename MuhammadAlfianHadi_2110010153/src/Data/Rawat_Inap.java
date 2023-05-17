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

public class Rawat_Inap {
    private String nomorRawatInap;
    private String nomorRekamMedis;
    private Date tanggalMasuk;
    private Date tanggalKeluar;
    private String kamar;
    private double biaya;

    // Constructor
    public Rawat_Inap(String nomorRawatInap, String nomorRekamMedis, Date tanggalMasuk, Date tanggalKeluar, String kamar, double biaya) {
        this.nomorRawatInap = nomorRawatInap;
        this.nomorRekamMedis = nomorRekamMedis;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
        this.kamar = kamar;
        this.biaya = biaya;
    }

    // Getter dan Setter
    public String getNomorRawatInap() {
        return nomorRawatInap;
    }

    public void setNomorRawatInap(String nomorRawatInap) {
        this.nomorRawatInap = nomorRawatInap;
    }

    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public void setNomorRekamMedis(String nomorRekamMedis) {
        this.nomorRekamMedis = nomorRekamMedis;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public Date getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(Date tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    public String getKamar() {
        return kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    // Metode lainnya
    public int hitungLamaRawatInap() {
    
        return 0;
    }

    public void cetakInfoRawatInap() {
        System.out.println("Nomor Rawat Inap: " + nomorRawatInap);
        System.out.println("Nomor Rekam Medis: " + nomorRekamMedis);
        System.out.println("Tanggal Masuk: " + tanggalMasuk);
        System.out.println("Tanggal Keluar: " + tanggalKeluar);
        System.out.println("Kamar: " + kamar);
        System.out.println("Biaya: " + biaya);
    }
}

