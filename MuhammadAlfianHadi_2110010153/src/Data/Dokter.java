/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */
public class Dokter {
    private String kodeDokter;
    private String namaDokter;
    private String spesialisasi;
    private String noTelepon;
    private String email;

    // Constructor
    public Dokter(String kodeDokter, String namaDokter, String spesialisasi, String noTelepon, String email) {
        this.kodeDokter = kodeDokter;
        this.namaDokter = namaDokter;
        this.spesialisasi = spesialisasi;
        this.noTelepon = noTelepon;
        this.email = email;
    }

    // Getter dan Setter
    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Metode lainnya
    public void periksaPasien(String kodePasien) {
        
    }

    public void tambahJadwal(String hari, String jamMulai, String jamSelesai) {
        
    }

    public void printInfoDokter() {
        System.out.println("Kode Dokter: " + kodeDokter);
        System.out.println("Nama Dokter: " + namaDokter);
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Nomor Telepon: " + noTelepon);
        System.out.println("Email: " + email);
    }
}

