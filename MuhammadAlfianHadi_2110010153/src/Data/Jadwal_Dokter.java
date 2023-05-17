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

public class Jadwal_Dokter {
    private String kodeDokter;
    private String hari;
    private Date jamMulai;
    private Date jamSelesai;

    // Constructor
    public Jadwal_Dokter(String kodeDokter, String hari, Date jamMulai, Date jamSelesai) {
        this.kodeDokter = kodeDokter;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    // Getter dan Setter
    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public Date getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(Date jamMulai) {
        this.jamMulai = jamMulai;
    }

    public Date getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(Date jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    // Metode lainnya
    public void tambahJadwal(String hari, Date jamMulai, Date jamSelesai) {
        
    }

    public void hapusJadwal(String hari) {
        
    }

    public void printInfoJadwal() {
        System.out.println("Kode Dokter: " + kodeDokter);
        System.out.println("Hari: " + hari);
        System.out.println("Jam Mulai: " + jamMulai);
        System.out.println("Jam Selesai: " + jamSelesai);
    }
}
