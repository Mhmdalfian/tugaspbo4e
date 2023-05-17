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

public class Rekam_Medis {
    private String nomorRekamMedis;
    private String kodePasien;
    private String kodeDokter;
    private Date tanggal;
    private String keluhan;
    private String diagnosa;
    private String tindakan;

    // Constructor
    public Rekam_Medis(String nomorRekamMedis, String kodePasien, String kodeDokter, Date tanggal, String keluhan, String diagnosa, String tindakan) {
        this.nomorRekamMedis = nomorRekamMedis;
        this.kodePasien = kodePasien;
        this.kodeDokter = kodeDokter;
        this.tanggal = tanggal;
        this.keluhan = keluhan;
        this.diagnosa = diagnosa;
        this.tindakan = tindakan;
    }

    // Getter dan Setter
    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public void setNomorRekamMedis(String nomorRekamMedis) {
        this.nomorRekamMedis = nomorRekamMedis;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public String getTindakan() {
        return tindakan;
    }

    public void setTindakan(String tindakan) {
        this.tindakan = tindakan;
    }

    // Metode lainnya
    public void tambahCatatan(String catatan) {
        
    }

    public void printInfoRekam_Medis() {
        System.out.println("Nomor Rekam Medis: " + nomorRekamMedis);
        System.out.println("Kode Pasien: " + kodePasien);
        System.out.println("Kode Dokter: " + kodeDokter);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Keluhan: " + keluhan);
        System.out.println("Diagnosa: " + diagnosa);
        System.out.println("Tindakan: " + tindakan);
    }
}
