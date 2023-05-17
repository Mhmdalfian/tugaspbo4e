/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author User
 */
public class Pasien {
    private String kodePasien;
    private String namaPasien;
    private String jenisKelamin;
    private String alamat;
    private String noTelepon;
    

    // Constructor
    public Pasien(String kodePasien, String namaPasien, String jenisKelamin, String alamat, String noTelepon) {
        this.kodePasien = kodePasien;
        this.namaPasien = namaPasien;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    // Getter dan Setter
    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    // Metode lainnya
    public void printInfoPasien() {
        System.out.println("Kode Pasien: " + kodePasien);
        System.out.println("Nama Pasien: " + namaPasien);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + noTelepon);
    }
}
