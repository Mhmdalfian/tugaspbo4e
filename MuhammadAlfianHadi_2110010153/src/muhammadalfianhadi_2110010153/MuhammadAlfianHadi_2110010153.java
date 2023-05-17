/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadalfianhadi_2110010153;

import Data.Dokter;
import Data.Jadwal_Dokter;
import Data.Obat;
import Data.Pasien;
import Data.Pembayaran;
import Data.Rawat_Inap;
import Data.Rekam_Medis;
import java.util.Date;

/**
 *
 * @author User
 */
public class MuhammadAlfianHadi_2110010153 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Membuat objek Pasien
        Pasien pasien = new Pasien("001", "Usman", "Laki-Laki","Jl. Contoh No. 123", "081234567890");

        // Mencetak informasi pasien
        pasien.printInfoPasien();

        System.out.println("-----------------------------");

        // Membuat objek Dokter
        Dokter dokter = new Dokter("D001", "Dr. Alfian", "Spesialis Jantung", "08123456789", "alfian@example.com");

        // Mencetak informasi dokter
        dokter.printInfoDokter();

        System.out.println("-----------------------------");

        // Membuat objek Obat
        Obat obat = new Obat("O001", "Paracetamol", "Tablet", 5000, 100);

        // Mencetak informasi obat
        obat.printInfoObat();

        System.out.println("-----------------------------");

        // Membuat objek RekamMedis
        Rekam_Medis rekam_Medis = new Rekam_Medis("RM001", "001", "D001", new Date(123, 4, 1), "Demam", "Panas Seluruh Tubuh", "Memberikan Resep Obat");

        // Mencetak informasi rekam medis
        rekam_Medis.printInfoRekam_Medis();

        System.out.println("-----------------------------");

        // Membuat objek JadwalDokter
        Jadwal_Dokter jadwal_Dokter = new Jadwal_Dokter("D001", "Senin", new Date(123, 4, 1 ), new Date(123, 4, 2));

        // Mencetak informasi jadwal dokter
        jadwal_Dokter.printInfoJadwal();

        System.out.println("-----------------------------");

        // Membuat objek Pembayaran
        Pembayaran pembayaran = new Pembayaran("PB001", "RM001", new Date(123, 4, 3), 500000, "Transfer Bank");

        // Mencetak informasi pembayaran
        pembayaran.cetakStrukPembayaran();

        System.out.println("-----------------------------");

        // Membuat objek RawatInap
        Rawat_Inap rawat_Inap = new Rawat_Inap("RI001", "001", new Date(123, 4, 1), new Date(123, 4, 5), "Kamar 101", 1000000);

        // Mencetak informasi rawat inap
        rawat_Inap.cetakInfoRawatInap();
    }
}

    
    

